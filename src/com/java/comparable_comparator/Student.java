package com.java.comparable_comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//In laptop class we learnt when comparable interfaces compareTo methos is used and when to use compare method using comparator 

//iN THIS EXAMPLE WE WILL JUST SEE DIFFERENT WAYS TO SORT USING COMPARATOR ONLY

public class Student {

	int id;
	String name;

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void main(String args[]) {

		List<Student> studentList = new ArrayList<>();
		studentList.add(new Student(1, "Jagrut"));
		studentList.add(new Student(2, "Mrunmayi"));
		studentList.add(new Student(3, "Anuja"));
		studentList.add(new Student(4, "Anushka"));

		System.out.println("Unsorted List :");
		studentList.stream().map(s -> s.getName()).forEach(System.out::println);

		//Traditional Comparator :
		Comparator<Student> com = new Comparator<Student>() {

			@Override
			public int compare(Student s1, Student s2) {
				return s1.getName().compareTo(s2.getName());
			}

		};

		Collections.sort(studentList, com);
		
		System.out.println("Using Traditional Comparator :");
		studentList.stream().map(s -> s.getName()).forEach(System.out::println);
		
		
		//Using anonymous inner class:
		Collections.sort(studentList, new Comparator<Student> () {

			@Override
			public int compare(Student s1, Student s2) {
				return s1.getName().compareTo(s2.getName());
			}
			
		});
		
		System.out.println("Using Anonymous Inner class :");
		studentList.stream().map(s -> s.getName()).forEach(System.out::println);
		
		//Using lambda expression:
		Collections.sort(studentList, (s1, s2) -> s1.getName().compareTo(s2.getName()));
		
		System.out.println("Using Lambda Expressions :");
		studentList.stream().map(s -> s.getName()).forEach(System.out::println);
		
		// Using Java 8+ Way — Comparator.comparing()
		Collections.sort(studentList, Comparator.comparing(Student::getName));
		
		System.out.println("Using Comparator.comparing():");
		studentList.stream().map(s -> s.getName()).forEach(System.out::println);
		
		// Using Streams API + Comparator.comparing() //.sorted()
		List<Student> sortedList = studentList.stream().sorted(Comparator.comparing(Student::getName)).collect(Collectors.toList());
		System.out.println("Using Streams API + Comparator.comparing() //.sorted() :");
		sortedList.stream().map(s -> s.getName()).forEach(System.out::println);
		
		}
		
}

