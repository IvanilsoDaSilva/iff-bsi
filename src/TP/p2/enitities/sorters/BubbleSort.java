package TP.p2.enitities.sorters;

import TP.p2.interfaces.*;
import TP.p2.interfaces.Sorter;

public class BubbleSort implements Sorter {

	@Override
	public void sort(MusicCollection collection) {
		bubbleSort(collection);
	}

	private void bubbleSort(MusicCollection collection) {
        for (int i = 0; i < collection.length() - 1; i++) {
        	
            for (int j = 0; j < collection.length() - i - 1; j++) {
            	
                String track1 = collection.get(j).getTrack();
                String track2 = collection.get(j + 1).getTrack();

                if (track1.compareToIgnoreCase(track2) > 0) {
                	collection.swap(j, j + 1);
                }
            }
        }
	}
}
