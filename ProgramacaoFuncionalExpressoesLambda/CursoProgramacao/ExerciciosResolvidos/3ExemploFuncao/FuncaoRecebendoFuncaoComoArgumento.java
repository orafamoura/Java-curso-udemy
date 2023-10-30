package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Product;
import services.ProductServices;

public class FuncaoRecebendoFuncaoComoArgumento {

	public static void main(String[] args) {
				
		Locale.setDefault(Locale.US);				
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));

		ProductServices ps = new ProductServices();
		double sum = ps.filteredSum(list, p -> p.getName().charAt(0) == 'T'); //DEPOIS DO PREDICATE, agora productService nao fica dependo de algo, ela fica generica e o parametro colocamos aqui
		double sum1 = ps.filteredSum(list, p -> p.getPrice() < 100.0);
		
		System.out.println("Sum = " + String.format("%.2f", sum));
		System.out.println("Sum = " + String.format("%.2f", sum1));
		
		
		}	
	}

