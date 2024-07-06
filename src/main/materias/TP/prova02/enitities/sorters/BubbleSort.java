package TP.prova02.enitities.sorters;

import TP.prova02.interfaces.*;
import TP.prova02.interfaces.Sorter;

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
		
//		boolean swapped;
//        do {
//            swapped = false;
//            Iterator<Music> iterator = collection.iterator();
//            Music prev = iterator.next();
//            while (iterator.hasNext()) {
//            	Music current = iterator.next();
//                if (prev.getTrack().compareTo(current.getTrack()) > 0) {
//                	Music temp = prev;
//                    prev = current;
//                    current = temp;
//                    swapped = true;
//                }
//                prev = current;
//            }
//        } while (swapped);
	}
}
