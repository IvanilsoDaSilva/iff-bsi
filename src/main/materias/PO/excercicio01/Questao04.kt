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
    val vetorV1 = create(40);
    val vetorV2 = create(40);

    println("Quesão 04"+"\n\nVetor V1:");
    printMatrix(vetorV1);
    println("\nVetor V2:");
    printMatrix(vetorV2);
    print("\nR: ");
    println(isV1GreaterThanV2OrEquals(vetorV1, vetorV2));
}

private fun create(size: Int): IntArray {
    val vetor = IntArray(size) {  Random.nextInt(100) } // Gera valores aleatórios de 1 a 100
    return vetor
}

private fun isV1GreaterThanV2OrEquals(matrixV1: IntArray, matrixV2: IntArray): Boolean {
    val columnsV1 = matrixV1.size;
    val columnsV2 = matrixV2.size;
    var sumV1 = 0;
    var prodV2 = 1;

    for (i in 1 downTo columnsV1 step 2) {
            sumV1 += matrixV1[i];
    }

    for (i in 0 downTo columnsV2 step 2) {
        prodV2 *= matrixV2[i];
    }

    if (sumV1 >= prodV2){
        return true;
    } else {
        return false;
    }
}