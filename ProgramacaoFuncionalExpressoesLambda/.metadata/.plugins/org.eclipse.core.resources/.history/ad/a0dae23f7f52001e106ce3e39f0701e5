package CursoObservacoes;

import java.util.ArrayList;
import java.util.List;

public class GenericsTipoCuringa {

	public static void main(String[] args) {
		
		//List<Object> myObj = new ArrayList<>();
		//List<Integer> myInt = new ArrayList<>();
		
		//myObj = myInt; da erro pois o obj nao e um supertipo de qualquer tipo de lista
		
		List<?> myObj = new ArrayList<>(); //tipo curinga e funciona com qualquer tipo de supertipo de lista
		List<Integer> myInt = new ArrayList<>();
		
		myObj = myInt;
		
		
		/* EXEMPLO CLASSE: 
		public static void main(String[] args){
			List<Integer> myInt = Arrays.asList(5,2,10); //instancia uma lista de inteiros, arrays.aslist macete para colocar os valores
			printList(myInt);
			
			List <String> ... etc
		}
		
		public static void printList(List<?> list){ //com esse metodo ele funciona para qualquer tipo de lista
			for (Object obj : list){
				Sysout(obj);
			}
		}
						
		//NAO E POSSIVEL ADICIONAR DADOS A UMA COLECAO CURINGA
		
		public static void main(String[] args){
			List<?> list = new ArrayList<Integer>();
			list.add(3); // erro de compilacao		
		}
				
		 */
		
		
		
		
		//Princípio get/put - COVARIANCIA
		/*
		List<Integer> intList = new ArrayList<Integer>();
		intList.add(10);	
		intList.add(5);
		
		List<? extends Number> list = intList;
		
		Number x = list.get(0);
		
		list.add(20); //erro de compilacao
		*/
		
		
		
		//Princípio get/put - CONTRAVARIANCIA 
		/*
		List<Object> myObjs = new ArrayList<Object>();
		myObjs.add("Maria");		
		myObjs.add("Alex");
		
		List<? super Number> myNums = myObjs;
		
		myNums.add(10);
		myNums.add(3.14);
		
		Number x = myNums.get(0); // erro de compilacao
		*/
		
		
		
		
		
		
		
		
		
		
		
	}
}
