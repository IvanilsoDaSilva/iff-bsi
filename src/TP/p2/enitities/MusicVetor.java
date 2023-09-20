package TP.p2.enitities;

import java.util.Iterator;
import java.util.NoSuchElementException;

import TP.p2.interfaces.MusicCollection;

public class MusicVetor implements MusicCollection {
	// Fields
	private Music musics[];
	private int last, length;
	
	// Methods - Construct
	/**
	 * Instancia um novo objeto do tipo @MusicVetor
	 * 
	 * @param size
	 */
	public MusicVetor (int size) {
		this.last = 0;
		this.musics = new Music[size];
		this.length = size;
	}
	
	// Methods - Others
	@Override
	public boolean add(Music music) {
		boolean sucess = false;
		if (this.last < this.length()-1) {
			this.musics[last] = music;
			last++;
			sucess = true;
		} else {
			sucess = false;
		}
		return sucess;
	}

	public boolean remove(String nome) {
		MusicListIterator interator = new MusicListIterator();
		boolean sucess = false;
		if (this.last <= this.length()-1) {
			
			
			while(interator.hasNext()) {
				Music musicIndex = musics[interator.currentIndex];
				if (musicIndex.getTrack().equalsIgnoreCase(nome)) {
					interator.remove();
					this.length--;
					sucess = true;
				} else {
					interator.next();
				}
			}
			
//			this.musics[last] = null;
//			last--;
			
			sucess = true;
		} else {
			sucess = false;
		}
		return sucess;
	}

	@Override
	public Music get(int index) {
		Music music;
		if (index <= this.length()-1) {
			music = this.musics[index];
		} else {
			music = null;
		}
		return music;
	}

	@Override
	public int length() {
		return this.length;
	}

	@Override
	public boolean swap(int firstIndex, int secondIndex) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(int index, Music music) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterator<Music> iterator() {
		return new MusicListIterator();
	}
	
	private class MusicListIterator implements Iterator<Music> {
        // Aqui usa o mesmo esquema do length (Sobre pq não é "Array.length()" e sim "Array.length")
        private int currentIndex = 0;

        @Override
        public boolean hasNext() {
            return currentIndex < last-1;
        }

        @Override
        public Music next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }

            Music music = musics[currentIndex+1];
            currentIndex++;
            
            return music;
        }

        @Override
        public void remove() {
        	musics[currentIndex] = null;
        	length--;
        }
    }
}
