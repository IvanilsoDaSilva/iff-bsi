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
    val vetorV = create(30);

    println("Quesão 03"+"\n\nVetor V:");
    printMatrix(vetorV);
    print("\nR: ");
    printMatrix(modify(vetorV));
}

private fun create(size: Int): IntArray {
    val vetor = IntArray(size) {  Random.nextInt(100)+1 } // Gera valores aleatórios de 1 a 100
    return vetor
}

private fun modify(matrix: IntArray): IntArray {
    val input = Scanner(System.`in`);

    print("Escreva o valor de k a ser utilizadp pela fução: ")
    var k = input.nextInt();

    val columns = matrix.size;
    val vetor = IntArray(columns-k+1) { 0 }

    for (i in 0 until columns-k+1) {
        for (j in i until i+k) {
            vetor[i] += matrix[j];
        }
    }

    return vetor;
}