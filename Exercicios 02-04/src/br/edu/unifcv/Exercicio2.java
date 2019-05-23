package br.edu.unifcv;

public class Exercicio2 {
	
	public Exercicio2() {
		
	}
	int[] i = new int []{10,2,25,62,85,87,1,33,22};
	int par;
	int impar;
	int maior;
	int menor;
	

		public void buscarMaiorMenor(){
	         menor = i[6];
	         maior = i[5];
	         for(int valor: i){
	            if(valor<menor)
	                menor = valor;
	            
	            System.out.println(menor);
	            if(valor>maior)
	                maior = valor;
	            
	            System.out.println(maior);
	         }
		}
	
	
	public void ImprimaValores() {
				
		for (int j = 0; j <=100 ; j++) {
			
            if (Par(i[j])) { 
               System.out.println(i[j]  + " eh par"); 
            } else { 
               System.out.println( i[j] + " eh impar.");     
	  } 
	 }
	}



	public static boolean Par(int numero) {   
	     return (numero % 2 == 0);   
	   } 
	

}


