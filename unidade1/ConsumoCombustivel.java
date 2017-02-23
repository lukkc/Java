package br.unipe.java.unidade1;

import java.util.Scanner;

public class ConsumoCombustivel {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe a distancia percorrida em km: ");
		float distancia = teclado.nextFloat();
		
		System.out.println("Informe a quantidade de gasolina consumida: ");
		float gasolina = teclado.nextFloat();
		
		float consumo = distancia / gasolina;
		
		System.out.format("O consumo médio do seu carro é: %.0f", consumo);
		teclado.close();
	}
}
