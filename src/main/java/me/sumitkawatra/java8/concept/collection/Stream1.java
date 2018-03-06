package me.sumitkawatra.java8.concept.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Stream1 {
	
	public static void main(String[] args) {

		List<Apple> inventory = new ArrayList<>();
		
		inventory.add(new Apple("yelow", 30));
		inventory.add(new Apple("green", 20));
		inventory.add(new Apple("red", 30));
		
		/**
		 * stream on collection and filter and  collect as new List.
		 */
		System.out.println(inventory.stream().filter(Apple::isHeavy).collect(Collectors.toList()));
		
		
		/**
		 * To sort collection with sort method
		 */
		inventory.sort((Apple a1, Apple a2)-> {return a1.weight - a2.weight; });
		
		System.out.println(inventory);
		
	}

}


class Apple {

	public String color;
	public int weight;

	public Apple(String color, int weight) {
		super();
		this.color = color;
		this.weight = weight;
	}
	
	public static boolean isGreen(Apple apple) {
		return "green".equals(apple.color);
	}
	
	public static boolean isHeavy(Apple apple) {
		return apple.weight > 25;
	}

	@Override
	public String toString() {
		return "Mango [color=" + color + ", weight=" + weight + "]";
	}

}
