package TP.p2_2.enitities;

import TP.p2_2.interfaces.MusicCollection;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class MusicList implements MusicCollection, Iterable<Music> {
	// Fields
	private int length = 0;
	private Knot firstKnot = new Knot();
	private Knot lastKnot = new Knot();
	
	// Methods - Constrcut
	
	// Methods - Setters and Getters
	
	// Methods - Others
	@Override
	public boolean addMusic(Music music) {
		boolean sucess = false;
		if (length == 0) {
			this.firstKnot.setMusic(music);
			this.lastKnot = this.firstKnot;
			this.length+=1;
			sucess = true;
		} else {
			this.lastKnot.setNextMusic(new Knot(music, null));
			this.lastKnot = this.lastKnot.getNextMusic();
			this.length+=1;
			sucess = true;
		}
		return sucess;
	}

	@Override
	public boolean removeMusic(String nome) {
		MusicListIterator interator = new MusicListIterator();
		boolean sucess = false;
		while(interator.hasNext()) {
			Music music = interator.currentKnot.getMusic();
			if (music.getTrack() == nome) {
				
				
				interator.next();
				sucess = true;
			} else {
				interator.next();
			}
		}
		return sucess;
	}

	@Override
	public Music getMusic(int index) {
		return null;
	}

	@Override
	public int length() {
		return this.length;
	}

	@Override
	public boolean swap(int firstIndex, int secondIndex) {
		return false;
	}

	@Override
	public boolean update(int index, Music music) {
		return false;
	}
	
	@Override
	public String toString() {
		String string = "{";
		Knot knot = this.firstKnot;
		
		while(knot != null) {
			string = string + knot.getMusic().getTrack()+",";
			
			knot = knot.getNextMusic();
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
            currentKnot = currentKnot.getNextMusic();
            return music;
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException("remove() não é suportado.");
        }
    }
}
