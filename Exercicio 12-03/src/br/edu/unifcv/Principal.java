package br.edu.unifcv;

import br.edu.unifcv.model.ContaCorrente;
import br.edu.unifcv.model.ContaPoupanca;

public class Principal {

	public static void main(String[] args) {
				
		
		ContaCorrente corrente = new ContaCorrente(500.00);
		ContaPoupanca poupanca = new ContaPoupanca(1000.00, 0.05);		
		
		corrente.sacar(200.00);
		System.out.println("Valor do saque em conta corrente: R$200,00");
		
		corrente.depositar(100.00);
		System.out.println("Valor do deposito: R$ 100,00");
		
		poupanca.sacar(50.00);
		System.out.println("Valor do saque em conta poupanca: R$50,00");
		
		poupanca.depositar(350.00);
		System.out.println("Valor do deposito: R$ 350,00");
		poupanca.CalculaRendimento();
	

	}

}
