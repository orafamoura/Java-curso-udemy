package services;

import java.util.ArrayList;
import java.util.List;

public class PrintService<QualquerLetra> {
	
	//Object aceita qualquer tipo de variavel, mas o problema vai ser o tipeSafety
	private List<QualquerLetra> list = new ArrayList<>();
	
	public void addValue(QualquerLetra value) {
		list.add(value);
	}
	
	public QualquerLetra first() {
		if (list.isEmpty()) {
			throw new IllegalStateException("list is empty");
		}
		return list.get(0);
	}
	
	public void print() {
		System.out.print("[");
		if(!list.isEmpty()) {
			System.out.print(list.get(0));
		}
		for(int i = 1; i < list.size();i++) {
			System.out.print("," + list.get(i));
		}
		System.out.println("]");
	}
	
	
}
