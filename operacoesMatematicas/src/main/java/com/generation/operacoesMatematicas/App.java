package com.generation.operacoesMatematicas;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite o primeiro número: ");
		float num1 = entrada.nextFloat();

		System.out.println("Digite o segundo número: ");
		float num2 = entrada.nextFloat();

		System.out.println("Escolha uma opção:\n" + "Digite 1 para Soma!\n" + "Digite 2 para Subtração!\n"
				+ "Digite 3 para Multiplicação!\n" + "Digite 4 para Divisão!");

		int opcao = entrada.nextInt();

		if (opcao == 1) {
			float soma = num1 + num2;
			System.out.printf("A soma do número " + num1 + " com o número " + num2 + " é: " + soma + "\n");
		} else if (opcao == 2) {
			float subt = num1 - num2;
			System.out.printf("A subtração do número " + num1 + " pelo número " + num2 + " é: " + subt + "\n");
		} else if (opcao == 3) {
			float mult = num1 * num2;
			System.out.printf("A multiplicação do número " + num1 + " pelo número " + num2 + " é: " + mult + "\n");
		} else if (opcao == 4) {
			float divs = num1 / num2;
			System.out.printf("A divisão do número " + num1 + " pelo número " + num2 + " é: " + divs + "\n");
		}
		entrada.close();
	}
}
