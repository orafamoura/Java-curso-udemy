package entities; // pacote da classe

public class Triangle { // nome da classe
	
	public double a;
	public double b;  // atributos da classe
	public double c;
	
	public double area() { // prefixo public indica que o atributo pode ser usado em outros arquivos, area e o nome do metodo, () lista de parametros do metodo
		double p = (a + b + c) / 2.0;
		return Math.sqrt(p * (p - a) * (p - b) * (p - c)); // corpo do metodo
	}
}
// o beneficio para fazer isso seria o reaproveitamento de codigo e a delegacao de responsabilidades; principio da coesao;