package com.javaeight;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class JavaEight {
public static void main(String[] args) {
	
	List<Integer>list=Arrays.asList(12,3,96,55,40,35,20,5,96);
	
	//Even Numbers
	List<Integer> collect = list.stream().filter(n->n%2==0).collect(Collectors.toList());
	System.out.println(collect);
	
	//Odd Numbers
	List<Integer> collect2 = list.stream().filter(a->a%2!=0).collect(Collectors.toList());
	System.out.println(collect2);
	
	//add+5
	List<Integer> collect3 = list.stream().map(f->f+5).collect(Collectors.toList());
	System.out.println(collect3);
	
	//sort
	 List<Integer> collect4 = list.stream().sorted().collect(Collectors.toList());
	System.out.println(collect4);
	
	//sort by ascending
	List<Integer> collect5 = list.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
	System.out.println(collect5);
	
	//sort by descending
	List<Integer> collect6 = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
	System.out.println(collect6);
	
	//min
	OptionalInt min = list.stream().mapToInt(Integer::intValue).min();
	System.out.println(min);
	
	//max
	OptionalInt max = list.stream().mapToInt(Integer::intValue).max();
	System.out.println(max);
	
	//average
	OptionalDouble average = list.stream().mapToInt(Integer::intValue).average();
	System.out.println(average);
	
	//sum
	int sum = list.stream().mapToInt(Integer::intValue).sum();
	System.out.println(sum);
	
	//distinct
	List<Integer> collect7 = list.stream().distinct().collect(Collectors.toList());
	System.out.println(collect7);
	
	//count
	long count = list.stream().count();
	System.out.println(count);
	
	
	//remove duplicate
	HashSet<Integer>hs=new HashSet<>();
	Set<Integer> collect8 = list.stream().filter(a->!hs.add(a)).collect(Collectors.toSet());
	System.out.println(collect8);
	
	//startsWith
	List<Integer> collect9 = list.stream().filter(a->String.valueOf(a).startsWith("3")).collect(Collectors.toList());
	System.out.println(collect9);
	
	//endsWith
	List<Integer> collect10 = list.stream().filter(s->String.valueOf(s).endsWith("0")).collect(Collectors.toList());
	System.out.println(collect10);
	
	//character count
	String name="Marish Mokal";
	 Map<String, Long> collect11 = Arrays.asList(name.split("")).stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	System.out.println(collect11);
	
	//word count
	Map<String, Long> collect12 = Arrays.asList(name.split(" ")).stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	System.out.println(collect12);
	
	
	
	
}
}
