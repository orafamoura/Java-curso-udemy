package CursoObservacoes;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {

	public static void main(String[] args) {
		
		//OPERACOES INTERMEDIARIAS
		/*
		filter
		map
		flatmap
		peek
		distinct
		sorted
		skip
		limit(*)  		
		-- short-circuit *
		
		//OPERACOES TERMINAIS
		forEach
		forEachOrdered
		toArray - toArray converte uma stream para vetor
		reduce - reduce pega elemento inicial/neutro e depois uma funcao que recebe 2 argumentos
		collect
		min
		max
		count
		anyMatch(*)
		allMatch(*)
		noneMatch(*)
		findFirst(*)
		findAny(*)		
		-- short-circuit *
		
		*/
		
		List<Integer> list = Arrays.asList(3, 4, 5, 10, 7);
	
		Stream<Integer> st1 = list.stream(); //criar uma stream a partir da list
		System.out.println(Arrays.toString(st1.toArray())); // toArray converte uma stream para vetor
		
		Stream<String> st2 = Stream.of("Maria", "Alex", "Bob");	//stream.of permite colocar diretamente 	
		System.out.println(Arrays.toString(st2.toArray()));
		
		Stream<Integer> st3 = Stream.iterate(0, x -> x + 2); // iterate vai somando 2 + 2 infinitamente
		System.out.println(Arrays.toString(st3.limit(10).toArray())); //para acabar com o ciclo .limit(quantidade limite)
		
		Stream<Long> st4 = Stream.iterate(new long[]{ 0L, 1L }, p->new long[]{ p[1], p[0]+p[1] }).map(p -> p[0]);//sequencia de fibonacci
		System.out.println(Arrays.toString(st4.limit(10).toArray()));
		
		Stream<Integer> st5 = list.stream().map(x -> x * 10);
		System.out.println(Arrays.toString(st5.toArray()));
		
		int sum = list.stream().reduce(0, (x, y) -> x + y); // reduce pega elemento inicial/neutro e depois uma funcao que recebe 2 argumentos
		System.out.println("Sum = " + sum);
		
		List<Integer> newList = list.stream()
				.filter(x -> x % 2 == 0) // filtra tudo que for par
				.map(x -> x * 10) // .map percorre a lista e multiplica por 10
				.collect(Collectors.toList()); // transforma em list
		System.out.println(Arrays.toString(newList.toArray()));
	}
}
