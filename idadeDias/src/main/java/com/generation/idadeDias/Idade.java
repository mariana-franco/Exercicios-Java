package com.generation.idadeDias;

import java.util.Scanner;

public class Idade {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite os anos: ");
		int idadeAnos = entrada.nextInt();

		System.out.println("Digite os meses: ");
		int idadeMeses = entrada.nextInt();

		System.out.println("Digite os dias: ");
		int idadeDias = entrada.nextInt();

		int idadeTotal = (idadeAnos * 365) + (idadeMeses * 30) + idadeDias;
		System.out.printf("A sua idade total em dias é: " + idadeTotal);
		
		entrada.close();
	}
}
