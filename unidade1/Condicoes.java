package br.unipe.java.unidade1;

import java.util.Scanner;

public class Condicoes {
	public static void main(String[] args) {
//		int z = 0;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe um numero: ");
		int z = teclado.nextInt();
		
		if(z == 10){
			System.out.println("z é igual a 10 :)");
		}else{
			System.out.println("z não é igual a 10");
		}
		teclado.close();
	}
}
