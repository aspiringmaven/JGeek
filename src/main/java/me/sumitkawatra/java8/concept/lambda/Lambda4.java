package me.sumitkawatra.java8.concept.lambda;

import java.util.function.Consumer;

public class Lambda4 {

	public static void main(String[] args) {

		/**
		 * Just Another Functional interface like Predicate that Consume object and
		 * apply operations.
		 */
		Consumer<Person> printer = (Person p) -> {
			System.out.println(p.name);
		};

		printer.accept(new Person("Hello"));
		

	}

}

class Person {
	public String name;

	public Person(String name) {
		super();
		this.name = name;
	}

}