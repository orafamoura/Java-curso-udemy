package exercicios;

import java.util.Locale;
import java.util.Scanner;
import entities.Employee2;
import java.util.List;
import java.util.ArrayList;

public class ExercicioPraticoLista {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee2> list = new ArrayList<>();
		
		System.out.print("How many employees will be registered? ");
		
		int N = sc.nextInt();
		
		for (int i=0;i<N;i++) {
			System.out.println("Employee #"+ (i+1)+":");
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			while (hasId(list, id)) { // while pra nao ter id repetido;
				System.out.println("Id already taken! Try again: ");
				id = sc.nextInt();
			}
			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			Double salary = sc.nextDouble();
			System.out.println();
			Employee2 emp = new Employee2(id, name, salary);
			
			list.add(emp);
		}

		System.out.print("Enter the employee id that will have salary increase: ");
		int idSalary = sc.nextInt();
		Integer pos = position(list, idSalary);
		
		if(pos == null) {
			System.out.println("This iod does not exist!");
		} else {
			System.out.print("Enter the percentage: ");
			double percent = sc.nextDouble();
			list.get(pos).increasedSalary(percent);
		}
		
		System.out.println();
		
		System.out.println("List of employees:");
		for (Employee2 e: list) {
			System.out.println(e);
		}
		/*Employee2 emp = list.stream().filter(x -> x.getId() == idSalary).findFirst().orElse(null);
		// transforma a lista em stream, filtra, os x funcionarios pega o getId e se for igual ao idSalary, pega o primeiro(findFirst) se nao tiver retorna null
		
		if(emp == null) {
			System.out.println("This id does not exist!");
		} else {
			System.out.print("Enter the percentage: ");
			double percent = sc.nextDouble();
			emp.increaseSalary(percent);
		}*/
		sc.close();
	}

	public static Integer position(List<Employee2> list, int id) {
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}
	public static boolean hasId(List<Employee2> list, int id) { // while pra nao ter id repetido
		Employee2 emp = list.stream().filter(x -> x.getId()== id).findFirst().orElse(null);
		return emp != null;
	}
	
	
	
}
