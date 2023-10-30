package application;

import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class ExemploDeTreeSetComparaElementos {
	public static void main(String[] args) {
		/*
		Set<Product> set = new TreeSet<>();
		
		set.add(new Product("TV", 900.0));
		set.add(new Product("Notebook", 1200.0));		
		set.add(new Product("Tablet", 400.0));
		
		for (Product p : set) {
			System.out.println(p);
			*/
		}
	}
	
	public class Product implements Comparable<Product>{ // para comparar tem que colocar o implemento
		private String name;
		private Double price;

		public Product(String name, Double price) {
			this.name = name;
			this.price = price;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Double getPrice() {
			return price;
		}

		public void setPrice(Double price) {
			this.price = price;
		}

		@Override
		public int hashCode() {
			return Objects.hash(name, price);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Product other = (Product) obj;
			return Objects.equals(name, other.name) && Objects.equals(price, other.price);
		}

		@Override
		public int compareTo(Product other) {			
			return name.toUpperCase().compareTo(other.getName().toUpperCase());
		}
	}
}