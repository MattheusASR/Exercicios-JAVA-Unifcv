package br.edu.unifcv;

public class Principal {

	public static void main(String[] args) {

		Pessoa ps = new Pessoa();
	
		int x = ps.Calcula(15, 2, 3);
		System.out.println("A idade da pessoa em anos é: " + x);
	}

}
