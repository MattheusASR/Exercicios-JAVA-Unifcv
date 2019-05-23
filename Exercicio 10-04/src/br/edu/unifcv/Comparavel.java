package br.edu.unifcv;

public class Comparavel {
	
	int valor;
	
	
	public Comparavel(int v) {
	this.valor = v;
	}
	
	public boolean MaiorOuIgual( int v) {
		if(this.valor <= v) {
			return true;
		}else {
			return false;
		}
		
	}
	
	public boolean MenorOuIgual( int v) {
		if(this.valor >= v) {
			return true;
		}else {
			return false;
		}
	}
		
	public boolean Diferente( int v) {
			if(this.valor != v) {
				return true;
			}else {
				return false;
			}
	}
	
	
}
