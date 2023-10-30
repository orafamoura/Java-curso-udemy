package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import model.entities.LogEntry;

public class ExercicioHashSetEBufferedReader {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		/* tinha que estar dentro de um txt
		 * 
				"amanda 2018-08-26T20:45:08Z\r\n"
				+ "alex86 2018-08-26T21:49:37Z\r\n"
				+ "bobbrown 2018-08-27T03:19:13Z\r\n"
				+ "amanda 2018-08-27T08:11:00Z\r\n"
				+ "jeniffer3 2018-08-27T09:19:24Z\r\n"
				+ "alex86 2018-08-27T22:39:52Z\r\n"
				+ "amanda 2018-08-28T07:42:19Z"
		*/
		
		System.out.print("Enter file full path: ");
		String path = sc.nextLine();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
				
			Set<LogEntry> set = new HashSet<>();
				
			String line = br.readLine();
			while (line != null) {
				
				String[] fields = line.split(" ");
				String username = fields[0];
				Date moment = Date.from(Instant.parse(fields[1]));
				
				set.add(new LogEntry(username, moment));
				line = br.readLine();
			}
			System.out.println("Total users: " + set.size());
			
		} catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		sc.close();
	}

}
