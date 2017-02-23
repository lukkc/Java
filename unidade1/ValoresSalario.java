package br.unipe.java.unidade1;

import java.util.Scanner;

public class ValoresSalario {
	public static void main(String[] args){
		Salario novo_salario = new Salario();
		Salario percentual_salario = new Salario();
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe o salario: ");
		novo_salario.salario = teclado.nextFloat();
		
		System.out.println("Informe o percentual de aumento: ");
		percentual_salario.percentual = teclado.nextFloat();
		
		novo_salario.calculo(novo_salario.salario, percentual_salario.percentual);
		
		teclado.close();
	}
}
