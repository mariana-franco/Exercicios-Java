package com.generation.programaComissao;

import java.util.Scanner;

public class Comissao {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite o valor do item: ");
		float valorItem = entrada.nextFloat();

		System.out.println("Digite a quantidade de itens vendidos: ");
		float quantItem = entrada.nextFloat();

		double valorComissao = (quantItem * valorItem) * 0.05;
		System.out.printf("O valor da comissão é de: R$ " + valorComissao);
		
		entrada.close();
	}
}
