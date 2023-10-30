package application;

import java.util.Comparator;

import entities.Product;

public class MyComparator implements Comparator<Product> { //implementando a interface comparator

	@Override
	public int compare(Product p1, Product p2) { //funciona igual o compareTo, retorna 1 ou 0
		return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()); // comparando .compareTo() os nomes getName(), independente se for maiusculo ou minusculo .toUpperCase();
	}
}