package CursoObservacoes;

import java.io.File;
import java.util.Scanner;

public class ManipulandoPastasComFile {

	public static void main(String[] args) {
				
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a folder path: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		File[] folders = path.listFiles(File::isDirectory); //para ver as pastas de um local
		System.out.println(folders);
		
		for(File folder : folders) {
			System.out.println(folder);
		}
			
		File [] files = path.listFiles(File::isFile); // para ver os arquivos de um local
		System.out.println("Files: ");
		for(File file : files) {
			System.out.println(file);
		}
		
		boolean sucess = new File(strPath + "\\Teste").mkdir(); // criando uma sub pasta chamada teste
		System.out.println("Directory created sucessfully " + sucess);
		
		
		
		sc.close();
	}
}
