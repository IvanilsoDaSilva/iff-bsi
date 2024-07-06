package PO.excercicio01;

import java.util.Scanner;
import kotlin.random.Random

// Função para printar a matriz
private fun printMatrix(matrix: Array<IntArray>) {
    for (row in matrix) {
        for (element in row) {
            print("$element ");
        }
        println();
    }
}

private fun printMatrix(matrix: IntArray) {
    for (element in matrix) {
        print("$element ");
    }
    println();
}

public fun main() {
    val vetorV = create(50);

    println("Quesão 02"+"\n\nVetor V:");
    printMatrix(vetorV);
    print("\nR: ");
    printMatrix(modify(vetorV))
}

private fun create(size: Int): IntArray {
    val vetor = IntArray(size) {  Random.nextInt(100)+1 } // Gera valores aleatórios de 1 a 100
    return vetor
}

private fun modify(matrix: IntArray): IntArray {
    val columns = matrix.size;
    val vetor = IntArray(columns) { 0 }

    for (i in 0 until columns) {
        for (j in 0 until columns) {
            if (i != j) {
                vetor[i] += matrix[j];
            }
        }
    }

    return vetor;
}