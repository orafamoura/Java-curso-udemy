package cursoProgramacao;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class OOPForEachANDList {
	public static void main(String[] args) {
		String[] vect = new String[] {"Maria", "Bob", "Alex"};

		for (int i=0; i<vect.length; i++) {
			System.out.println(vect[i]);
		}	
		System.out.println("------------------------");
		for(String obj : vect) {
			System.out.println(obj);
		}
		System.out.println("------------------------");
		
		List<String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("Alex");
		list.add("Joao"); // marco vem pra ca
		list.add("Anna");
		list.add(2,"Marco");
		list.add("Anabela");
		list.add("Antonio");
		
		System.out.println(list.size());
		
		list.remove("Anna"); // Remove por comparacao
		list.remove(1); //Remove por posicao
		list.removeIf(x -> x.charAt(0) == 'M'); //Remove por caracteres // remover se caracter na posicao 0 for igual M
		
		for(String x: list) { //for each
			System.out.println(x);
		}
		System.out.println("------------------------");
		
		System.out.println("Index of Joao: " + list.indexOf("Joao"));
		System.out.println("------------------------");
		
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList()); //filtra e separa pelo caracter inicial
		for (String x : result) {
			System.out.println(x);
		}
		System.out.println("------------------------");
		
		String name = list.stream().filter(x -> x.charAt(0) == 'T').findFirst().orElse(null); //Filtra o primeiro nome com o caracter, se nao tem retorna null
		System.out.println(name);
	}
}
