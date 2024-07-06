package TP.prova02.enitities.sorters;

import java.util.Iterator;

import TP.prova02.enitities.Music;
import TP.prova02.interfaces.MusicCollection;
import TP.prova02.interfaces.Sorter;

public class SelectionSort implements Sorter {

	@Override
	public void sort(MusicCollection collection) {
		selectionSort(collection);
	}
	
	private void selectionSort(MusicCollection collection) {
        int size = collection.length();
        Iterator<Music> iterator = collection.iterator();

        Music currentValue;
        for (int i = 0; i < size - 1; i++) {
            int minIndex = i;
            Music minValue = iterator.next();
            Iterator<Music> innerIterator = collection.iterator();
            currentValue = innerIterator.next();
			/*
			 * for (int j = 0; j < i; j++) { innerIterator.next(); }
			 */

            for (int j = i + 1; j < size; j++) {
                //Music currentValue = innerIterator.next();

                if (currentValue.getTrack().compareTo(minValue.getTrack()) < 0) {
                    minIndex = j;
                    minValue = currentValue;

                    collection.swap(minIndex, i);
                }
            }
        }
    }
}