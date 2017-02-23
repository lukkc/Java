package br.unipe.java.unidade1;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		//definindo um obejto Scanner, para capturar a digitação do teclado
		Scanner leitor = new Scanner(System.in);
		
		Cachorro pitbull = new Cachorro();
		Cachorro pastor = new Cachorro();
		
		System.out.println("Informe o nome do cachorro: ");
		pitbull.nome = leitor.nextLine();
		pitbull.late();
		
		System.out.println("Informe o nome do cachorro: ");
		pastor.nome = leitor.nextLine();
		pastor.late();
		
		leitor.close();
		
		/*
		Carro ferrari = new Carro();
		ferrari.avancar();
		ferrari.retroceder();
		
		Carro fusca = new Carro();
		fusca.abastacer();
		fusca.parar();
		*/
	}

}
