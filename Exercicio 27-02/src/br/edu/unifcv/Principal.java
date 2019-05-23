package br.edu.unifcv;

public class Principal {

	public static void main(String[] args) {

		Conta conta = new Conta();
		conta.setNome("matheus");
		conta.setAgencia("Caixa");
		conta.setNumero(123456);
		conta.setSaldo(50.0);
		conta.setDataDeAbertura("02/02/2000");
		
		System.out.println("Saldo atual sem rendimento: " + conta.getSaldo());
		
		
		conta.depositar(100.00);
		conta.sacar(50.00);
		
		
	}

}
