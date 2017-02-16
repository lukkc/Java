package br.unipe.java.unidade1;

import java.util.Scanner;

public class MediaNota {
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe a primeira nota: ");
		float nota1 =  teclado.nextFloat();
		
		System.out.println("Informe a segunda nota: ");
		float nota2 =  teclado.nextFloat();
		
		System.out.println("Informe a terceira nota: ");
		float nota3 =  teclado.nextFloat();
		
		float media = (nota1+nota2+nota3)/3;
		
		if(media >= 7){
			System.out.println("Você foi aprovado com média: " + media);
		}
		else if(media >= 5 && media < 7){
			System.out.println("Você vai para a recuperação");
		}
		else if(media < 5){
			System.out.println("Você foi reprovado");
		}
		
		teclado.close();
	}
}
