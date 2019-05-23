package br.edu.unifcv.model;

public abstract class Banco {
	private String nome;
	private Integer numero;
	private String agencia;
	private String dataAbertura;
	private Double saldo;
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getDataAbertura() {
		return dataAbertura;
	}

	public void setDataAbertura(String dataAbertura) {
		this.dataAbertura = dataAbertura;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public Banco(Double saldo) {
		this.saldo = saldo;
	}

	public void depositar(Double valor) {
		if (valor <= 0) {
			System.out.println("Voce nao pode efetuar um deposito menor ou igual a zero ");
		} else {
			double saldo = this.getSaldo();
			saldo = saldo + valor;
			this.setSaldo(saldo);
			System.out.println("Voce efetuou um deposito, seu saldo atual: R$"  + saldo);
			
		}
	}

	public void sacar(Double valor) {
		if (TemSaldo(valor)) {
			double saldo = this.getSaldo();
			saldo = saldo - valor;
			this.setSaldo(saldo);
			System.out.println("Voce realizou um saque, seu saldo atual: R$" + saldo);
		} else {
			System.out.println("Saldo insuficiente!!!");
		}
		
	}

	protected abstract Boolean TemSaldo(Double valor);

	protected abstract Boolean SaldoMenosRetiradaMaiorQueZero(Double valor);

}


