package com.example.streamexample;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamCreation {

	public static void main(String[] args) {
		List<String> fruits = Arrays.asList("Papaya","Apple","Banana","Cherry","Date","Fig","Grape");
		
		// From the Array, .stream -> Stream
		// forEach item in the Stream (Take note of the argument type (Consumer))
		// print it in the log
		fruits.stream().forEach(System.out::println);
		
		
		// When this run this operation, it will not change the data source
		// If you want to keep the data after the operation
		// Assigned it to a new List
		// use collect(Collectors.toList()) to transform stream -> Collection
		
		System.out.println("Filtering the stream");
		List<String> filteredFruits = fruits.stream().filter(fruit-> 
		fruit.startsWith("A") || fruit.startsWith("B")).collect(Collectors.toList());
		
		System.out.println(filteredFruits);
		
		
		// Example of Map
		// Transform the list in stream
		// For each item in the stream, transform it to uppercase, and show it in println 
		fruits.stream().map(String::toUpperCase).sorted().forEach(System.out::println);
		
		
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);
		Optional<Integer> sum = numbers.stream().reduce(Integer::sum);
		sum.ifPresent(System.out::println);
		
		

	}

}
