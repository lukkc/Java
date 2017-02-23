package br.unipe.java.unidade1;

import java.util.Scanner;

public class Soma {
	public static void main(String[] args) {
		float x = 0, y = 0, soma = 0;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe o primeiro número: ");
		x = teclado.nextFloat();
		
		System.out.println("Informe o segundo número: ");
		y = teclado.nextFloat();
		
		soma = x + y;
		System.out.format("O resultado da soma é: %.0f\n", soma);
		teclado.close();
		
	}
}
