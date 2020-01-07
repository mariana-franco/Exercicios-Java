package com.generation.numerosDecrescente;

import java.util.Arrays;
import java.util.Scanner;

public class OrdemDecrescente {
	public static void main(String[] args) {

		Scanner numeros = new Scanner(System.in);

		int[] listaDeNumeros = new int[3];

		for (int i = 0; i < listaDeNumeros.length; i++) {
			System.out.printf("Digite o número " + (i + 1) + ": ");
			listaDeNumeros[i] = (numeros.nextInt());
		}

		Arrays.sort(listaDeNumeros);

		System.out.printf("Ordem decrescente: ");

		for (int j = listaDeNumeros.length - 1; j >= 0; j--) {
			System.out.printf(listaDeNumeros[j] + " ");
		}

		// System.out.println("Digite o primeiro número : ");
		// int num1 = numeros.nextInt();

		// System.out.println("Digite o segundo número: ");
		// int num2 = numeros.nextInt();

		// System.out.println("Digite o terceiro número: ");
		// int num3 = numeros.nextInt();

		// if (num1 < num2 && num2 < num3) {
		// System.out.printf("Segue lista de números em ordem decrescente: " + num3 +
		// num2 + num1);
		// } else if (num2 < num1 && num1 < num3) {
		// System.out.printf("Segue lista de números em ordem decrescente: " + num3 +
		// num1 + num2);
		// } else if (num3 < num1 && num1 < num2) {
		// System.out.printf("Segue lista de números em ordem decrescente: " + num2 +
		// num1 + num3);
		// } else if (num1 < num3 && num3 < num2) {
		// System.out.printf("Segue lista de números em ordem decrescente: " + num2 +
		// num3 + num1);
		// } else if (num3 < num2 && num2 < num1) {
		// System.out.printf("Segue lista de números em ordem decrescente: " + num1 +
		// num2 + num3);
		// } else if (num2 < num3 && num3 < num1) {
		// System.out.printf("Segue lista de números em ordem decrescente: " + num1 +
		// num3 + num2);
		// }
		numeros.close();
	}
}
