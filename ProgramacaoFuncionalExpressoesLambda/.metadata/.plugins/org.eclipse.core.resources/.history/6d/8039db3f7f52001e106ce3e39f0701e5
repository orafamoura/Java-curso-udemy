package CursoObservacoes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import entities.EmployeeInterComp;

public class InterfaceComparable2 {
	public static void main(String[] args) {

		List<EmployeeInterComp> list = new ArrayList<>();
		String path = "D:\\programação\\Programacao\\java\\ExemplosFile\\in.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String employeeCsv = br.readLine();

			while (employeeCsv != null) {
				String[] fields = employeeCsv.split(","); //split cria vetor a partir da virgula
				list.add(new EmployeeInterComp(fields[0], Double.parseDouble(fields[1]))); //parseDouble pra converter de string para double
				employeeCsv = br.readLine();
			}
			Collections.sort(list);
			for (EmployeeInterComp emp : list) {
				System.out.println(emp.getName() + ", " + emp.getSalary());
			}

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
