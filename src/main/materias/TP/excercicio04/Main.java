package TP.excercicio04;

public class Main {
	private static int somaRecursivaAux(int[] arr, int index) {
        if (index == arr.length) {
            return 0;
        }
        return arr[index] + somaRecursivaAux(arr, index + 1);
    }
	
	private static String inverteStringRecursivaAux(String string, int index) {
		if (index < 0) {
			return "";
		}
		return string.charAt(index) + inverteStringRecursivaAux(string, index-1);
    }
	
	private static int maiorNumeroRecursivoAux(int[] arr, int index) {
        if (index == 0) {
            return arr[0];
        }

        int previousMax = maiorNumeroRecursivoAux(arr, index - 1);

        return Math.max(arr[index], previousMax);
    }
	
	public static int somaRecursiva(int[] arr) {
        return somaRecursivaAux(arr, 0);
    }
	
	public static String inverteStringRecursiva(String string) {
		return inverteStringRecursivaAux(string, string.length()-1);
	}
	
	public static int maiorNumeroRecursivo(int[] arr) {
		return maiorNumeroRecursivoAux(arr, arr.length-1);
	}
	
	public static void main(String[] args) {
		System.out.println("Soma Array: "+somaRecursiva(new int[] {1, 2}));
		System.out.println("Inverter String: "+inverteStringRecursiva("Ivanilso"));
		System.out.println("Maior numero de um array: "+maiorNumeroRecursivo(new int[] {1, 2, 23, 0 , -1}));
	}

}
