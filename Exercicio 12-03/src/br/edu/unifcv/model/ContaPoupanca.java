package br.edu.unifcv.model;

public class ContaPoupanca extends Banco{


	private Double rendimento;
	public ContaPoupanca(Double saldo, Double rendimento) {
		super(saldo);
		this.rendimento = rendimento;
		
	}

	public void CalculaRendimento() {
		Double saldo = this.getSaldo();
		double valor = saldo + saldo * rendimento;
		System.out.println("seu saldo com rendimento: " + valor);
	}

	@Override
	protected Boolean TemSaldo(Double valor) {
		Double saldo = this.getSaldo();

		if (saldo > valor && saldo - valor > 0) {
			return true;
		}
		return false;
	}

	@Override
	protected Boolean SaldoMenosRetiradaMaiorQueZero(Double valor) {

		Double saldo = this.getSaldo();
		if (saldo - valor > 0) {
			return true;
		}
		return false;
	}
}

