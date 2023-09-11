package TP.p2.enitities;

import java.util.Iterator;
import java.util.NoSuchElementException;

import TP.p2.interfaces.MusicCollection;

public class MusicList implements MusicCollection, Iterable<Music> {
	// Fields
	private int length;
	private Knot firstKnot;
	private Knot lastKnot;
	
	// Methods - Construct
	public MusicList () {
		this.length = 0;
		this.firstKnot = null;
		this.lastKnot = null;
	}
	
	// Methods - Setters and Getters
	
	// Methods - Others
	@Override
	public boolean add(Music music) {
		boolean sucess = false;
		if (firstKnot == null) {
			this.firstKnot = new Knot(music, null);
			this.lastKnot = this.firstKnot;
			this.length++;
			sucess = true;
		} else {
			this.lastKnot.setNext(new Knot(music, null));
			this.lastKnot = this.lastKnot.getNext();
			this.length+=1;
			sucess = true;
		}
		return sucess;
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
		MusicListIterator interator = new MusicListIterator();
		
		if (firstKnot != null && index<=this.length-1) {
			for(int i=0;i<=index;i++){
				
				interator.next();
			}
			return interator.currentKnot.getMusic();
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
		MusicListIterator interator = new MusicListIterator();
		boolean sucess = false;
		
		if (firstKnot != null && index<=this.length) {
			for(int i=0;i<index;i++) {
				interator.next();
			}
			
			interator.currentKnot.setMusic(music);
			return true;
		}
		
		return false;
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
        // Aqui usa o mesmo esquema do length (Sobre pq não é "Array.length()" e sim "Array.length")
        private Knot currentKnot = firstKnot;
        private Knot previousKnot = null;// modificação minha 

        @Override
        public boolean hasNext() {
            return currentKnot != null;
        }

        @Override
        public Music next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }

            
            Music music = currentKnot.getMusic();
            previousKnot = currentKnot;
            currentKnot = currentKnot.getNext();
            return music;
        }

        @Override
        public void remove() {
        	if (currentKnot != null) {
	        	if(currentKnot.getNext() == null) {
	        		System.out.println("caso 1");
	        		currentKnot = null;
	        		previousKnot.setNext(currentKnot);
	        	} else if (previousKnot == null) {
	        		System.out.println("caso 2");
	        		currentKnot = currentKnot.getNext();
	        		firstKnot = currentKnot;
	        	} else {
	        		System.out.println("caso 3");
	        		currentKnot = previousKnot;
	        		currentKnot.setNext(currentKnot.getNext().getNext());
	        	}
        	}
        }
    }
}
