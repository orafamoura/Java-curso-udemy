package CursoObservacoes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderAndBufferedReader {

	public static void main(String[] args) {
		
		String path = ("D:\\programação\\in.txt");
		FileReader fr = null;
		BufferedReader br = null;
		//FORMA GROSSEIRA DE ABRIR E FECHAR AS STREAMS, SO PARA ESTUDO
		try
		{
			fr = new FileReader(path); // pode ser assim ou o exemplo de baixo
			br = new BufferedReader(/* new FileReader(path) */fr);

			String line = br.readLine();
			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}

		}catch(
		IOException e)
		{
			System.out.println("Error: " + e.getMessage());
		}finally
		{
			try {
			if(br != null) {
				br.close();
			}
			if(fr != null) {
				fr.close();
			}
		}
			catch(IOException e) {
				e.printStackTrace();
			}
		}

	}

}
