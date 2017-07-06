package me.sumitkawatra.java8.lambda;

import java.util.Arrays;
import java.util.List;

public class App1 {
	
	public static void main(String[] args) {
		fun4();
		
	}
	
	
	public static void fun1() {
		System.out.println("Start");
		new Thread( () -> System.out.println("Hello World") ).start();;
		System.out.println("End");
	}
	
	
	
	public static void fun2() {
		String [] array = {"Sumit", "Coder", "Learner", "React"};
		List<String> list = Arrays.asList(array);
		
		//iterate list
		list.forEach(e -> System.out.println(e));
		
		//iterate Array
		Arrays.stream(array).forEach(a -> {
			System.out.println(a);
		});
		
	}
	
	
	public static void fun3() {
		int [] array = {1,2,3,4,5,6,7,8,9,10};
		
		Arrays.stream(array).filter(e -> e%2==0).forEach(e -> System.out.println(e));
		
//		Arrays.stream(array).forEach(e -> {
//			if(e%2 == 0) {
//				System.out.println("Even " + e);
//			}
//		});
		
	}
	
	
	public static void fun4() {
		
		String [] array = {"Sumit", "Coder", "Learner", "React"};
		List<String> list = Arrays.asList(array);
		
		list.sort((a,b) -> {
			return b.compareTo(a);
		});
		
		list.forEach(e -> System.out.println(e));
		
		
	}
	

}
