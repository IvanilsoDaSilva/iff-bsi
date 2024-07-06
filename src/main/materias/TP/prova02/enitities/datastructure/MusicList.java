package TP.prova02.enitities.datastructure;

import java.util.Iterator;
import java.util.NoSuchElementException;

import TP.prova02.enitities.Music;
import TP.prova02.interfaces.*;

public class MusicList implements MusicCollection {
	// Fields
	private int length;
	private Knot firstKnot;
	private Knot lastKnot;
	private MusicListIterator interator;
	
	// Methods - Construct
	/**
	 * Instancia um novo objeto do tipo @MusicList
	 */
	public MusicList () {
		this.length = 0;
		this.firstKnot = null;
		this.lastKnot = null;
	}
	
	// Methods - Setters and Getters
	
	// Methods - Others
	private void interatorGenerate(int index) {
		if (index < this.interator.currentIndex) {
			this.interator = new MusicListIterator();
		}
	}
	
	@Override
	public boolean add(Music music) {
		if (firstKnot == null) {
			this.firstKnot = new Knot(music, null);
			this.lastKnot = this.firstKnot;
			this.length++;
			this.interator = new MusicListIterator();
		} else {
			this.lastKnot.setNext(new Knot(music, null));
			this.lastKnot = this.lastKnot.getNext();
			this.length+=1;
		}
		return true;
	}

	@Override
	public boolean remove(String nome) {
		MusicListIterator interator = new MusicListIterator();
		boolean sucess = false;
		while(interator.hasNext()) {
			Music musicIndex = interator.currentKnot.getMusic();
			if (musicIndex.getTrack().equalsIgnoreCase(nome)) {
				interator.remove();
				this.length--;
				sucess = true;
			} else {
				interator.next();
			}
		}
		return sucess;
	}

	@Override
	public Music get(int index) {
		interatorGenerate(index);
		
		if (firstKnot != null && index<=this.length-1) {
			for(int i=this.interator.currentIndex;i<index;i++){
				this.interator.next();
			}
			return this.interator.currentKnot.getMusic();
		}
		
		return null;
	}

	@Override
	public int length() {
		return this.length;
	}

	@Override
	public boolean swap(int firstIndex, int secondIndex) {
		MusicListIterator interator1 = new MusicListIterator();
		MusicListIterator interator2 = new MusicListIterator();
		Music aux;
		boolean sucess = false;
		
		if ((firstIndex+secondIndex)/2<=this.length-1 && firstKnot!=null) {
			for(int i=0;i<firstIndex;i++) {
				interator1.next();
			}
			for(int i=0;i<secondIndex;i++) {
				interator2.next();
			}
			
			aux = interator1.currentKnot.getMusic();
			interator1.currentKnot.setMusic(interator2.currentKnot.getMusic());
			interator2.currentKnot.setMusic(aux);
			
			sucess = true;
		}
		
		return sucess;
	}

	@Override
	public boolean update(int index, Music music) {
		interatorGenerate(index);
		boolean sucess = false;
		
		if (firstKnot != null && index<=this.length) {
			for(int i=this.interator.currentIndex;i<index;i++){
				this.interator.next();
			}
			
			this.interator.currentKnot.setMusic(music);
			return true;
		}
		
		return false;
	}
	
	@Override
	public void sort(Sorter sorter) {
		sorter.sort(this);
	}
	
	@Override
	public String toString() {
		String string = "{";
		Knot knot = this.firstKnot;
		
		while(knot != null) {
			string = string + knot.getMusic().getTrack()+",";
			
			knot = knot.getNext();
		}
		
		string = string + "}";
		return string;
	}
	
    @Override
    public Iterator<Music> iterator() {
        return new MusicListIterator();
    }

    private class MusicListIterator implements Iterator<Music> {
        private Knot currentKnot;
        private Knot previousKnot;
        private int currentIndex;
        
        public MusicListIterator() {
        	this.currentKnot = firstKnot;
        	this.previousKnot = null;
        	this.currentIndex = 0;
        }
        
        @Override
        public boolean hasNext() {
            return currentKnot != null;
        }

        @Override
        public Music next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }

            this.currentIndex++;
            Music music = this.currentKnot.getMusic();
            this.previousKnot = this.currentKnot;
            this.currentKnot = this.currentKnot.getNext();
            return music;
        }

        @Override
        public void remove() {
        	if (currentKnot != null) {
	        	if(currentKnot.getNext() == null) {
	        		currentKnot = null;
	        		previousKnot.setNext(currentKnot);
	        	} else if (previousKnot == null) {
	        		currentKnot = currentKnot.getNext();
	        		firstKnot = currentKnot;
	        	} else {
	        		currentKnot = previousKnot;
	        		currentKnot.setNext(currentKnot.getNext().getNext());
	        	}
        	}
        }
    }
}
