package TP.prova02.enitities.datastructure;

import java.util.Iterator;
import java.util.NoSuchElementException;

import TP.prova02.enitities.Music;
import TP.prova02.interfaces.MusicCollection;
import TP.prova02.interfaces.Sorter;

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
		if (this.last < this.length-1) {
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
		return this.last;
	}

	@Override
	public boolean swap(int firstIndex, int secondIndex) {
		MusicListIterator interator1 = new MusicListIterator();
		MusicListIterator interator2 = new MusicListIterator();
		Music aux;
		boolean sucess = false;
		
		if ((firstIndex+secondIndex)/2<=this.length-1 && last!=0) {
			for(int i=0;i<firstIndex;i++) {
				interator1.next();
			}
			for(int i=0;i<secondIndex;i++) {
				interator2.next();
			}
			
			aux = this.musics[interator1.currentIndex];
			this.musics[interator1.currentIndex] = this.musics[interator2.currentIndex];
			this.musics[interator2.currentIndex] = aux;
			
			sucess = true;
		}
		
		return sucess;
	}

	@Override
	public boolean update(int index, Music music) {
		return false;
	}
	
	
	@Override
	public void sort(Sorter sort) {
		sort.sort(this);
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
