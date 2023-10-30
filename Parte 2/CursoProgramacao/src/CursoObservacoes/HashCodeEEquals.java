package CursoObservacoes;

public class HashCodeEEquals {

	public static void main(String[] args) {
		//equals, metodo que compara se o objeto e igual ao outro retorna true ou false
		String a = "Maria";
		String b = "Alex";
		System.out.println(a.equals(b));

		
		//HashCode, metodo que retorna um numero inteiro representando um codigo gerado
		//se o code de dois objs for diferente, entao os dois objetos com certeza sao diferentes
		
		//mas forem iguais tem uma possibilidade de serem diferentes ainda sim
		
		String c = "Maria";
		String d = "Alex";
		
		System.out.println(c.hashCode());
		System.out.println(d.hashCode());
						
	}
}
