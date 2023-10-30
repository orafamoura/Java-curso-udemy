package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ExercicioHashSet {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Set<Integer> a = new HashSet<>();
		Set<Integer> b = new HashSet<>();
		Set<Integer> c = new HashSet<>();
		
		System.out.print("How many students for course A?");		
		int n = sc.nextInt();
		
		for(int i=0;i<n;i++) {
			int number = sc.nextInt();
			a.add(number);
		}
		
		System.out.print("How many students for course B?");		
		n = sc.nextInt();
		
		for(int i=0;i<n;i++) {
			int number = sc.nextInt();
			b.add(number);
		}
		
		System.out.print("How many students for course C?");		
		n = sc.nextInt();
		
		for(int i=0;i<n;i++) {
			int number = sc.nextInt();
			c.add(number);
		}
		
		Set<Integer> d = new HashSet<>();
		d.addAll(a);
		d.addAll(b);
		d.addAll(c);
		
		System.out.println("Total students: "+ d.size());
		
		sc.close();
	}

}
