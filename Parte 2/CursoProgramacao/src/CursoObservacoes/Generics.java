package CursoObservacoes;

import java.util.ArrayList;
import java.util.List;

public class Generics {

	public static void main(String[] args) {
		//uso comum: colecoes
		List<String> list = new ArrayList<>(); //generics permitem que classes, interfaces e metodos possam ser parametrizados por tipo
		list.add("Maria");
		String name = list.get(0);
		System.out.println(name);
	}
}
