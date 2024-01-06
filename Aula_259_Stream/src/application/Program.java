package application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Program {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(3,4,5,10,7);
		
		Stream<Integer> st1 = list.stream().map(x -> x * 10); 
		// Stream de inteiros
		// Criei stream a partir de uma lista
		
		System.out.println(Arrays.toString(st1.toArray()));
		// [30, 40, 50, 100, 70]
		
		Stream<String> st2 = Stream.of("Maria","Alex","Bob");
		// Criei stream a partir dela mesma, StreamOf
		System.out.println(Arrays.toString(st2.toArray()));
		// [Maria, Alex, Bob]
		
		Stream<Integer> st3 = Stream.iterate(0, x -> x + 2);
		
		System.out.println(Arrays.toString(st3.limit(10).toArray()));
		// [0, 2, 4, 6, 8, 10, 12, 14, 16, 18]
		
		Stream<Long> st4 = Stream.iterate(new long[]{ 0L, 1L }, p->new long[]{ p[1], p[0]+p[1] }).map(p -> p[0]);
		System.out.println(Arrays.toString(st4.limit(10).toArray()));

	}

}
