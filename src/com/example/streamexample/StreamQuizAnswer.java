package com.example.streamexample;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamQuizAnswer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Animal> animals = new ArrayList<>();
		
		Animal butters = new Animal("Butters",3,"dog");
		Animal lizzy = new Animal("Lizzy",6,"dog");
		Animal red = new Animal("Red",1,"cat");
		Animal joey = new Animal("Joey",3,"dog");
		
		animals.add(butters);
		animals.add(lizzy);
		animals.add(red);
		animals.add(joey);
		
		
		// Stream operation starts here
		
		Integer sum = animals.stream()
		 // Performing filter to get only the dog [{name,type,age},{},{}]
		 .filter(animal->animal.getType().equals("dog"))
		 //[3,6,3]
		.map(animal-> animal.getAge()*7)
		// Performing a sum operation on the item in the array
		// another way of writing reduce = 0 (initial value)
		.reduce(0, (subtotal, element)-> subtotal + element);
	
		System.out.println(sum);

	}

}
