package br.edu.unifcv;

public class Conta {

	private String Nome;
	private Integer Numero;
	private String Agencia;
	private Double Saldo = 0.0;
	private String DataDeAbertura;
	
	public Conta() {
	
	}
	
	public Conta(String nome, Integer numero, String agencia, Double saldo, String dataDeAbertura) {
		Nome = nome;
		Numero = numero;
		Agencia = agencia;
		Saldo = saldo;
		DataDeAbertura = dataDeAbertura;
	}
	
	public void sacar(Double valor) {
		double saldo = this.getSaldo();
		saldo = saldo - valor;
		this.setSaldo(saldo);
		System.out.println("Voce efetuou um saque, seu saldo atual é: " + this.getSaldo());
	}
	public void depositar(Double valor) {
		this.setSaldo(valor);
		System.out.println("Voce recebeu um deposito de: " + this.getSaldo());
	}
	public Double calcularRendimento() {
		Double rendimento = this.Saldo * 0.5;
		return this.Saldo + rendimento;
	
		
	}
	
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		this.Nome = nome;
	}
	public Integer getNumero() {
		return Numero;
	}
	public void setNumero(Integer numero) {
		this.Numero = numero;
	}
	public String getAgencia() {
		return Agencia;
	}
	public void setAgencia(String agencia) {
		this.Agencia = agencia;
	}
	public Double getSaldo() {
		return Saldo;
	}
	public void setSaldo(Double saldo) {
		this.Saldo = saldo;
	}
	public String getDataDeAbertura() {
		return DataDeAbertura;
	}
	public void setDataDeAbertura(String dataDeAbertura) {
		this.DataDeAbertura = dataDeAbertura;
	}
	
	
	
}
