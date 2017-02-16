package br.unipe.java.unidade1;

import java.util.Scanner;

public class Cervejas {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Informe a quantidade de cervejas no freezer: ");
		int cerva = teclado.nextInt();
		
		while(0 < cerva){
			System.out.println(cerva + " cervejas no freezer.\n");
			cerva = cerva - 1;
			System.out.println("Pego uma cerveja, passo pra frente.");
			System.out.println("Agora são " + cerva + " cervejas no freezer.");
			
			if (cerva == 0){
				System.out.println("Quantas cervejas deseja adicionar: ");
				cerva = teclado.nextInt();
				System.out.println(cerva + " Adicionadas");
			}
		}
		
		
		teclado.close();
	}
}
