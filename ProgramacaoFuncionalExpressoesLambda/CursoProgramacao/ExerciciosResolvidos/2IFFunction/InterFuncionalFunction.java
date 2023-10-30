package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;
import java.util.stream.Collectors;

import entities.Product;
import util.UpperCaseName;

public class InterFuncionalFunction {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);			
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));

		// LIST PARA STREAM = .stream();
		// STREAM PARA LIST = .collect(Collectors.toList());
		
		List<String> names = list.stream().map(new UpperCaseName()).collect(Collectors.toList());
		// Function, na classe sao 2 implements, Product e uma String nesse exemplo
		//.stream para virar stream, .map para aplicar uma funcao para todos os elementos de uma stream
		// function UpperCase e .collect para transformar de volta para list, isso tudo dentro do segundo implements da classe function List<String>
		
		
		List<String> names1 = list.stream().map(Product::staticUpperCaseName).collect(Collectors.toList()); // reference method static
		
		
		List<String> names2 = list.stream().map(Product::nonStaticUpperCaseName).collect(Collectors.toList()); // reference method no static
			
		
		Function<Product, String> func = p -> p.getName().toUpperCase(); //Expressao lambda declarada
		List<String> names3 = list.stream().map(func).collect(Collectors.toList()); //Expressao lambda declarada
		
		
		List<String> names4 = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList()); //Expressao lambda inline
		
		
		names.forEach(System.out::println); //reference method
	}

}
