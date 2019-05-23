package br.matheus.asr;

public class SalarioMinimo {
	
	public SalarioMinimo() {
		
	}
	
	int SalarioTotal;
	int SM = 998;
	
	public int Calcula(int qtSalarios) {
		
		SalarioTotal = SM * qtSalarios;
		
		System.out.println("O salario do funcionario eh: " + SalarioTotal);
		return 0;
		
	}
	
}
