package br.unipe.java.unidade1;

import java.util.Scanner;

public class NomeIdade {
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe o seu nome: ");
		String nome = teclado.nextLine();
		
		System.out.println("Informe a sua idade: ");
		int idade = teclado.nextInt();
		
		System.out.println("O usuario " + nome + " , tem a idade de " + idade + " anos");
		
		teclado.close();
	}
}
