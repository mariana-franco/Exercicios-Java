package com.generation.negativoPositivo;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		int numero;

		Scanner entrada = new Scanner(System.in);

		do {
			System.out.println("Digite 0 para sair!\n");
			System.out.println("Digite um número: ");
			numero = entrada.nextInt();

			if (numero > 0) {
				System.out.printf("O número " + numero + " é POSITIVO!\n");
			} else if (numero < 0) {
				System.out.printf("O número " + numero + " é NEGATIVO!\n");
			}
		} while (numero != 0);
		entrada.close();
	}
}
