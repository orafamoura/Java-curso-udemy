package CursoObservacoes;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterAndBufferedWriter {

	public static void main(String[] args) {
		
		String[] lines = new String[] {"Good morning", "Good afternoon", "AulaFileWriter"};
		
		String path = "D:\\programação\\criandoArquivos.txt";
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){ //o argumento true serve para nao criar um arquivo novo
			for(String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}

}
