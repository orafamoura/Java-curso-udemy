package application;

import java.util.ArrayList;
import java.util.List;
import model.entities.Circle;
import model.entities.Rectangle;
import model.entities.Shape;

public class GenericsCuringasDelimitados {

	public static void main(String[] args) {
		
		List<Shape> myShapes = new ArrayList<>(); //criada lista de shape
		myShapes.add(new Rectangle(3.0, 2.0)); 
		myShapes.add(new Circle(2.0));
		//criada 2 figuras
		
		
		//List<Circle> myCircle = new ArrayList<>();
		//myCircle.add(new Circle(2.0));
		//System.out.println("Total area: " + totalArea(myCircle)); erro de casting pois o list shape nao e um supertipo de circle
		// o casting so funciona se a linha 28 estiver dessa forma : <? extends a classe>
		
		System.out.println("Total area: " + totalArea(myShapes));

	}
	
	public static double totalArea(List<? extends Shape> list) {
	//public static double totalArea(List<Shape> list) { //implementado uma lista de Shape
		double sum = 0.0; 
		for(Shape s : list) { //percorre a lista acumulando a soma e no final retorna a soma
			sum += s.area();
		}
		return sum;
	}
	
	
}
