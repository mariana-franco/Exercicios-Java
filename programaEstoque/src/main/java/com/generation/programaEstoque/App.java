package com.generation.programaEstoque;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		// int valorMaximo = 15;
		// int valorMinimo = 7;
		// double valorMedia = (valorMaximo + valorMinimo) / 2;
		// System.out.printf("O valor médio é: " + valorMedia);

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite um valor mínimo: ");
		float valorMinimo = entrada.nextFloat();

		System.out.println("Digite um valor máximo: ");
		float valorMaximo = entrada.nextFloat();

		float valorMedia = (valorMaximo + valorMinimo) / 2;
		System.out.printf("O valor médio é: " + valorMedia);
	}
}
