package CursoObservacoes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class InterfaceComparable1 {
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		String path = "D:\\programação\\Programacao\\java\\ExemplosFile\\in.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			//lendo um arquivo e criando uma lista com esses arquivos
			String name = br.readLine();
			while (name != null) {
				list.add(name);
				name = br.readLine();
			}
			Collections.sort(list); //operacao padrao para ordenar uma colecao 
			for (String s : list) {
				System.out.println(s);
			}

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}