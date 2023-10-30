package CursoObservacoes;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;

import entities.Product;
import util.ProductPredicate;

public class InterfaceFuncionalPredicate {

	public static void main(String[] args) {
				
		Locale.setDefault(Locale.US);				
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));

		
		
		//list.removeIf(p -> p.getPrice() >= 100);
		
		list.removeIf(new ProductPredicate()); //IMPLEMENTACAO DA INTERFACE
		
		list.removeIf(Product::staticProductPredicate);//REFERENCE METHOD // metodo estatico
		
		list.removeIf(Product::nonStaticProductPredicate); // REFERENCE METHOD // nao estatico
		
		Predicate<Product> pred = p -> p.getPrice() >= 100.0; // EXPRESSAO LAMBDA DECLARADA
		list.removeIf(pred); // EXPRESSAO LAMBDA DECLARADA
		
		list.removeIf(p -> p.getPrice() >= 100.0); // EXPRESSAO LAMBDA INLINE
		
		
		
		
		for(Product p : list) {
			System.out.println(p);
		}
		
	}

}
