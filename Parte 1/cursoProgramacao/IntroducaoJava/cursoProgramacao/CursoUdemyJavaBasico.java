package cursoProgramacao;
import java.util.Locale; // para tranformar o ponto do double ou em , ou em .
import java.util.Scanner; // para entrada de dados

public class CursoUdemyJavaBasico {

	
	public static void main(String[] args) {

		//System.out.println("QUEBRA DE LINHA"); System.out.print("SEM QUEBRA DE LINHA"); 
		double e = 4.35678;
		System.out.printf("%.2f\n",e);
		
		// MARCADORES
		// %f - ponto flutuante
		// %d - inteiro
		// %s - texto
		// %n - quebra de linha
		
		
		// se coloca f no float, pois um ponto flutuante ele ja se considera double, e .0 no double por boas praticas.
		float a = 6f;
		double b = 6.0;
		
		int c,d;
		double result;
		
		result = (double) a/b; // para trocar variaveis obrigatoriamente tem que colocar entre parenteses, poderia ser de double pra int etc...
	
		// ENTRADA DE DADOS
		
		
		Locale.setDefault(Locale.US); // para double ser . ou ,
		
		//import java.util.Scanner; // colocar no comeco do programa;
		Scanner sc = new Scanner(System.in);
		// para fechar a entrada de dados sc.close();
		
		String f;
		f = sc.next(); 
		System.out.println("Voce digitou: " + f);
		
		String j;
		j = sc.nextLine(); // USANDO NEXT VOCE LE UMA PALAVRA, USANDO sc.nextLine ele le a linha
		System.out.println(j);
		
		int g;
		g = sc.nextInt();
		System.out.println(g);
		
		double h;
		h = sc.nextDouble();
		System.out.println(h); // se le 4,5
		System.out.printf("%.2f%n",h); // se le 4,50
		
		char i;
		i = sc.next().charAt(0);
		
		// FUNCOES MATEMATICAS DO JAVA
		
		double k, l = 5;
		k = Math.sqrt(l); // K recebe raiz quadrada de L
		k = Math.pow(k, l); // K recebe o resultado de K elevado a L 
		k = Math.abs(l); // K recebe o valor absoluto de L - valor absoluto tira o sinal negativo
	
		//SWITCH
		
	/*
		 switch(expressao){
		 case VALOR1:
		 	COMANDO1
		 	COMANDO2
		 	BREAK;
		 case VALOR2:
		 ...	
		 }
		 
		//WHILE
		 
		 while (condição) {
			comando 1
			comando 2
		}
		 */
	
		//EXPRESSAO CONDICIONAL TERNARIA - so funciona se tiver if e else nao mais que isso
		
		//(condicao) ? valor_se_verdadeiro : valor_se_falso
		int m = 4;
		m = (2 > 4) ? 50 : 80;
		
		//mesma coisa de :
		if(2 > m) {
			m = 50;
		} else {
			m = 80;
		}
		
	}
}
