package com.generation.programaDolar;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite o valor atual da cotação do dólar: ");
		float cotacaoDolar = entrada.nextFloat();

		System.out.println("Digite o valor em dólar: ");
		float valorDolar = entrada.nextFloat();

		float valorReais = cotacaoDolar * valorDolar;
		System.out.printf("O valor em reais é: " + valorReais);
	}
}
