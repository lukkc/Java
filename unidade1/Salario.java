package br.unipe.java.unidade1;

public class Salario {
	float salario, percentual;
	float novo_salario, aumento_percentual;
	
	public void calculo(float salario, float percentual){	
		aumento_percentual = salario*(percentual/100);
		novo_salario += aumento_percentual + salario;
		System.out.printf("O Valor do seu aumento foi de: %.0f\n", aumento_percentual);
		System.out.printf("O seu novo salario é de: %.0f\n", novo_salario);
		
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public float getPercentual() {
		return percentual;
	}

	public void setPercentual(float percentual) {
		this.percentual = percentual;
	}
	
	
}
