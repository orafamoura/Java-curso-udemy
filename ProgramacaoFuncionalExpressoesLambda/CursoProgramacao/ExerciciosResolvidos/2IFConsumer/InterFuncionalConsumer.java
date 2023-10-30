package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;

import entities.Product;
import util.PriceUpdate;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);			
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));

		list.forEach(new PriceUpdate()); //forEach recebe um consumer como argumento		
		
		
		list.forEach(Product::staticPriceUpdate); // reference method static
		
		
		list.forEach(Product::nonStaticPriceUpdate); // reference method no static
		
		
		Consumer<Product> cons = p -> { //Expressao lambda declarada
			p.setPrice(p.getPrice() * 1.1);
		};		
		//OU	
		Consumer<Product> cons1 = p -> p.setPrice(p.getPrice() * 1.1);
		
			
		list.forEach(p -> p.setPrice(p.getPrice() * 1.1)); // Expressao lambda inline
		
		
		
		list.forEach(System.out::println); // reference method ---	
	}

}
