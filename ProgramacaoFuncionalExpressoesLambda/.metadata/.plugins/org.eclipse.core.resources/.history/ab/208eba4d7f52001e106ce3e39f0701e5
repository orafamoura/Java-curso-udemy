import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Exercicio {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Product> list = new ArrayList<>();
		
		//System.out.print("Enter file path: ");
		//String destino = sc.nextLine();
		String path = ("D:\\programação\\Programacao\\java\\ExemplosFile\\vendas.txt"); // extracao dos arquivos
		
		boolean sucess = new File("D:\\programação\\Programacao\\java\\ExemplosFile\\out").mkdir(); // criacao da pasta
		System.out.println("Directory created sucessfully " + sucess);

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String lines = br.readLine();
			

			while (lines != null) {
				String[] aux = lines.split(",");
				String name = aux[0];
				//double value = Double.valueOf(aux[1]);
				//int quantit = Integer.valueOf(aux[2]);
				double price = Double.parseDouble(aux[1]);
				int quantity = Integer.parseInt(aux[2]);				
				list.add(new Product(name, price, quantity));
				
				lines = br.readLine();
			}
			System.out.println(list);

		} 
		catch (IOException e) {
			System.out.println("Error" + e.getMessage());
		} 
		
		String outPath = "D:\\programação\\Programacao\\java\\ExemplosFile\\out\\summary.csv"; // criacao do arquivo
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(outPath, true))){
			
			for(Product item : list) {
				bw.write(item.toString());				
				bw.newLine();
			}
			
		} 
		catch(IOException e) {
			e.printStackTrace();
		}
	sc.close();
	} 
	
}	
