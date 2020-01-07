package com.generation.informarIdade;

import java.util.Scanner;

public class DifIdade {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite a sua idade: ");
		int idadeUsu = entrada.nextInt();

		System.out.println("Informe a idade da sua mãe: ");
		int idadeMae = entrada.nextInt();

		int diferenca = idadeMae - idadeUsu;
		System.out.printf("Minha mãe é " + diferenca + " anos mais velha do que eu!");

		entrada.close();
	}
}
