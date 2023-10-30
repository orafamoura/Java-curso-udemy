package application;

import java.util.HashSet;
import java.util.Set;
import model.entities.Product;

public class ExemploDeSetComHashCodeEEquals {
	
	public static void main(String[] args) {
	
		Set<Product> set = new HashSet<>();
		set.add(new Product("TV", 900.0));
		set.add(new Product("Notebook", 1200.0));
		set.add(new Product("Tablet", 400.0));
		
		Product prod = new Product("Notebook", 1200.0);
	
		System.out.println(set.contains(prod)); //sem a implementacao de equals e hashCode ele vai pela referencia de ponteiros
		// e ja que eles sao instancias diferentes, por mais que estao iguals, vai dar false
	}
}
