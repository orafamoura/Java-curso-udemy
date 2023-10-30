package application;

import model.entities.Client;

public class ExemploHashCodeEEquals {

	public static void main(String[] args) {		
		
		Client c1 = new Client("Maria", "maria@gmail.com");
		Client c2 = new Client("Maria", "maria@gmail.com");
		
		String s1 = "Test";
		String s2 = "Test";
				
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1.equals(c2));// true por que nome e email sao iguais	
		System.out.println(c1 == c2); // false por ter posicoes de memoria diferente, por mais que tenham o mesmo conteudo
		System.out.println(s1 == s2); // true pois para literais ele da um tratamento especial, diferente de uma criacao de um objeto
	}	
}