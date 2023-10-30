package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class ExercicioPropostoMaps {

	public static void main(String[] args) throws ParseException {

		Scanner sc = new Scanner(System.in);

		Map<String, Integer> votes = new LinkedHashMap<>(); //instanciado uma lista com string e int, mantem a ordem dos elementos inseridoso linkedHashSet

		System.out.print("Enter file full path: ");
		//D:\programação\Programacao\java\ExemplosFile\\ExerMapsProposto.txt
		String path = sc.nextLine();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String line = br.readLine();
			while (line != null) {
				
				String[] fields = line.split(","); //line.split para fazer a separacao dos 2 argumentos, nome e voto
				String name = fields[0];
				int count = Integer.parseInt(fields[1]); //integer.parse int para converter string para int

				if (votes.containsKey(name)) { // aqui ele compara o nome na lista toda, se for igual : 
					int votesSoFar = votes.get(name); //pega o nome e o valor
					votes.put(name, count + votesSoFar); // depois replica o nome e adiciona o valor atual mais o votesSoFar, servindo como um aux
				}
				else {
					votes.put(name, count); 
				}
				
				line = br.readLine();
			}
			
			for (String key : votes.keySet()) { //keySet retorna um set com as chaves do map
				System.out.println(key + ": " + votes.get(key));
			}
			
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

		sc.close();
	}
}
