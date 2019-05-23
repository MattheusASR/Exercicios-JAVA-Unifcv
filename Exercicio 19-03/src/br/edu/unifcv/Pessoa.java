package br.edu.unifcv;

public class Pessoa {

	public Pessoa() {
		
	}
	
	public int Calcula(int dia, int mes, int ano) {
		ano = ano *365;
		
		mes = mes * 30;
		
		int resposta = ano + mes + dia;
		return resposta;
		
	}
}
