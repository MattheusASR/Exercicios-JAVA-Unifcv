package br.edu.unifcv;

public class Principal2 {

	public static void main(String[] args) {
		MediaAluno ma = new MediaAluno();
		
		double n = ma.AdcNotas(8,10,5,5);
		double m = ma.Media();
		System.out.println("A nota eh: " + n);
		System.out.println("A media eh: " + m);
	}

}
