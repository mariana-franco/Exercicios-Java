package com.generation.numeroAB;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite um número: ");
		int numero = entrada.nextInt();

		if (numero > 0) {
			System.out.printf(numero + " = A");
		} else if (numero < 0) {
			System.out.printf(numero + " = B");
		}
		entrada.close();
	}
}
