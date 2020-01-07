package com.generation.loginSenha;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("login> ");
		String login = entrada.nextLine();

		System.out.println("senha> ");
		String senha = entrada.nextLine();

		if (login.equals("Mariana") && senha.equals("123451990")) {
			System.out.printf("Usuário %s logado com sucesso.", login);
		} else {
			System.out.println("Login ou senha inválidos!");
		}
	}
}
