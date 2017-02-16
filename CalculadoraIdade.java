package br.unipe.java.unidade1;


import java.util.Scanner;

public class CalculadoraIdade {
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe o ano do seu nascimento: ");
		int ano_nasc = teclado.nextInt();
		
		System.out.println("Informe o ano atual: ");
		int ano_atual = teclado.nextInt();
		
		int idade = ano_atual - ano_nasc;
		System.out.println("Você tem " + idade + " anos.");
		teclado.close();
	}
}
