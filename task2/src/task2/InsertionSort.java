package task2;

public class InsertionSort {

	public static void main(String[] args) {
		

		/*
		 * Ich habe mich f�r den Insertion sort Algorithmus entschieden,
		 * da er bei kleinen Inputmengen sehr effizient ist und im Vergleich
		 * zu komplexeren Algorithmen (Quick-, Merge sort relativ einfach zu implementieren ist).
		 * Bei einem gr��eren oder variablen Inputmenge w�re Insertion sort aufgrund der Komplexit�t
		 * nicht allzu effizient und ein komplexerer Algorithmus mit O(n log n) als average case w�re
		 * deutlich besser(z.B. Quicksort).
		 * Auch wenn der allgemeine auf gr��ere Datenmengen bezogene 
		 * average case und worst case(wenn array genau anders herum sortiert ist) bei O(n^2)
		 * und best case(bereits sortiert) bei O(n)liegt
		 * mit der Speicherkomplexit�t von O(1). Es wird also kein extra Speicher ben�tigt.
		 */
		
		// Gegebenes zu sortierendes Array
		int[] unsortiert = {19,2,3,6,201,23,43,99,54,778,889,123,54};
		
		// Ausgabe des unsortierten Arrays
		System.out.println("Unsortiert: ");
		for (int i = 0; i < unsortiert.length; i++) {
			if(i == unsortiert.length-1) {
			System.out.print(unsortiert[i] + "\n");
			}else
			System.out.print(unsortiert[i] + ", ");
		}
		
		// Aufruf der Insertionsort funktion
		int[] sortiert = insertionSort(unsortiert);
		
		// Ausgabe des sortierten Arrays
		System.out.println("Sortiert: ");
		for (int i = 0; i < sortiert.length; i++) {
			if(i == sortiert.length-1) {
			System.out.print(sortiert[i] + "\n");
			}else
			System.out.print(sortiert[i] + ", ");
		}

	}

		// Implementation des Insertionsorts
		/**
		 * @param list
		 * @return int[] sortiert
		 */
		public static int[] insertionSort(int[] list) {
		int temp;
		for (int i = 1; i < list.length; i++) {
			temp = list[i];
			int j = i;
			while (j > 0 && list[j - 1] > temp) {
				list[j] = list[j - 1];
				j--;
			}
			list[j] = temp;
		}
		return list;
		}
	}
