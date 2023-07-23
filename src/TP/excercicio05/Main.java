package TP.excercicio05;

public class Main {
	public static void bubbleSort(int[] arr) {
		int n = arr.length;
		boolean swapped;

		for (int i = 0; i < n - 1; i++) {
			swapped = false;

			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					// Troca os elementos de posição
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					swapped = true;
				}
			}

			// Se não houve trocas na iteração anterior, o array está ordenado, e o loop
			// pode ser interrompido.
			if (!swapped) {
				break;
			}
		}
	}

	public static void selectionSort(int[] arr) {
		int n = arr.length;

		for (int i = 0; i < n - 1; i++) {
			int minIndex = i;

			// Encontra o índice do menor elemento na parte não ordenada do array
			for (int j = i + 1; j < n; j++) {
				if (arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}

			// Troca o elemento atual com o menor elemento encontrado
			int temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
		}
	}

	public static void insertionSort(int[] arr) {
		int n = arr.length;

		for (int i = 1; i < n; i++) {
			int key = arr[i];
			int j = i - 1;

			// Move os elementos maiores que a chave para a direita
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j--;
			}

			// Insere a chave na posição correta
			arr[j + 1] = key;
		}
	}

	public static void main(String[] args) {
		int[] array1 = { 4, 3, 2, 1 };
		int[] array2 = { 4, 3, 2, 1 };
		int[] array3 = { 4, 3, 2, 1 };

		bubbleSort(array1);
		for (int i : array1) {
			System.out.print(i);
		}
		System.out.println("\n");

		selectionSort(array2);
		for (int i : array1) {
			System.out.print(i);
		}
		System.out.println("\n");

		insertionSort(array3);
		for (int i : array1) {
			System.out.print(i);
		}
		System.out.println("\n");
	}

}
