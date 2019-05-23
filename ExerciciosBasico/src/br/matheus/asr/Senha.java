package br.matheus.asr;

import java.util.Scanner;

public class Senha {
	
	
	public static void main( String[ ] args ) {
		
		int senhaMestre, senhaTentativa;
		double n1, n2, soma;

	Scanner salva = new Scanner (System.in);
	
	System.out.println("Cadastre uma senha (Apenas Numeros): ");
	senhaMestre = salva.nextInt();
	
	System.out.println("Digite um numero: ");
	n1 = salva.nextDouble();
	
	System.out.println("Digite outro numero: ");
	n2 = salva.nextDouble();
	
	soma = n1 + n2;
	
	
	System.out.println("Digite sua senha para desbloquear a soma: ");
	senhaTentativa = salva.nextInt();
	
	if(senhaTentativa == senhaMestre) {
		System.out.println("A soma eh: "+soma);
	}else {
		System.out.println("Erro! Senha errada!");
	}
	
	}
}
