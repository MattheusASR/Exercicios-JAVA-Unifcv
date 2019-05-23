package br.edu.unifcv.model;

public class ContaCorrente extends Banco {

	public ContaCorrente(Double saldo) {
		super(saldo);
		
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

