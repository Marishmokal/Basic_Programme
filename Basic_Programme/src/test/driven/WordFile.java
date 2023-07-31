package test.driven;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WordFile {
public static void main(String[] args) {
	
	
	List<Integer>list=Arrays.asList(15,3,72,48,55,3,9);
	
	//even number
	List<Integer> collect = list.stream().filter(a->a%2==0).collect(Collectors.toList());
	System.out.println(collect);
	
	//odd number
	List<Integer> collect2 = list.stream().filter(a->a%2!=0).collect(Collectors.toList());
	System.out.println(collect2);
	
	//max number
	OptionalInt max = list.stream().mapToInt(Integer::intValue).max();
	System.out.println(max);
	
	//min
	OptionalInt min = list.stream().mapToInt(Integer::intValue).min();
	System.out.println(min);
	
	//average
	OptionalDouble average = list.stream().mapToInt(Integer::intValue).average();
	System.out.println(average);
	
	//sort
	List<Integer> collect3 = list.stream().sorted().collect(Collectors.toList());
	System.out.println(collect3);
	
	List<Integer> collect4 = list.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
	System.out.println(collect4);
	
	//descending
	List<Integer> collect5 = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
	System.out.println(collect5);
	
	//find duplicate
	HashSet<Integer>hs=new HashSet();
	Set<Integer> collect6 = list.stream().filter(a->!hs.add(a)).collect(Collectors.toSet());
	System.out.println(collect6);
	
	//starts with
	List<Integer> collect7 = list.stream().filter(a->String.valueOf(a).startsWith("4")).collect(Collectors.toList());
	System.out.println(collect7);
	
	//count
	long count = list.stream().count();
	System.out.println(count);
	
	//add 5
	List<Integer> collect8 = list.stream().map(a->a+5).collect(Collectors.toList());
	System.out.println(collect8);
	//ends with
	List<Integer> collect9 = list.stream().filter(a->String.valueOf(a).endsWith("5")).collect(Collectors.toList());
	System.out.println(collect9);
	
	
	String name="Marish is my name my surname is mokal";
	Map<String, Long> collect10 = Arrays.asList(name.split("")).stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	System.out.println(collect10);
	
	Map<String, Long> collect11 = Arrays.asList(name.split(" ")).stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	System.out.println(collect11);
	
	List<Integer> collect12 = list.stream().distinct().collect(Collectors.toList());
	System.out.println(collect12);
	
}
}
