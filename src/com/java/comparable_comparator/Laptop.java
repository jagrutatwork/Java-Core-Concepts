package com.java.comparable_comparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Laptop implements Comparable<Laptop>{

	private String brand;
	private int ram;
	private int price;

	
	public Laptop(String brand, int ram, int price) {
		super();
		this.brand = brand;
		this.ram = ram;
		this.price = price;
	}


	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public int getRam() {
		return ram;
	}


	public void setRam(int ram) {
		this.ram = ram;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	@Override
	public String toString() {
		return "Laptop [brand=" + brand + ", ram=" + ram + ", price=" + price + "]";
	}


	public static void main(String [] Args)
	{
		
		//Consider a list of wrapper or String class
		List<Integer> codes = new ArrayList<>(Arrays.asList(10, 555, 54, 738, 11, 32));
				
		List<String> names = new ArrayList<>(Arrays.asList("Jagrut", "Mrunmayi", "Anuja", "Pratitya", "Kalpana", "Mohan"));
		
		Collections.sort(codes);
		System.out.println(codes.toString());
		
		Collections.sort(names);
		System.out.println(names.toString());
		
		
		//the above code works fine and prints the following:
		//[10, 11, 32, 54, 555, 738]
		//[Anuja, Jagrut, Kalpana, Mohan, Mrunmayi, Pratitya]

		// This is because it knows how to sort them as these classes Wrappers(Integer)
		// and String implement Comparable and hence compareTo() method
		
		
		
		//Now consider the custom class Laptop:
			
		List<Laptop> laps = new ArrayList<>();
		laps.add(new Laptop("Dell", 16, 800));
		laps.add(new Laptop("Apple",8,1200));
		laps.add(new Laptop("Acer",12,700));		
        // Collections.sort(laps);
		//The above line wont work directly,
		//as long as the Laptop class doesn't implement Comparable
		
		
		//Now that we Laptop class implements Comparable
		// we need to give define the logic of comparison 
		//inside the compareTo() method as below after which we can:
		Collections.sort(laps);
		
		for(Laptop l: laps)
		{
			System.out.println(l);
		}
		//Above code works as expected
		//What will you do if you are not allowed 
		//or it is not possible to implement Comparable?
		//OR
		//What if Comparable does your job for most of the part
		//but you need another way of sorting just for a specific use cases?

		//THAT IS WHERE COMPARATOR COMES IN

		//Comparator can be used by passing the comparator object/instance inside 
		//the sort() method 
		//Since Comparator is an interface it must be instantiated using
		//an anonymous inner class
		//further we need to override the compare() method
		//to define the custom sorting logic
		
		Comparator<Laptop> com = new Comparator<Laptop>() {

			@Override
			public int compare(Laptop o1, Laptop o2) {
				if(o1.getPrice()>o2.getPrice())
					return 1;	
				else 
					return -1;
			}
			
		};
		
		
		Collections.sort(laps, com);
		
		for(Laptop l: laps)
		{
			System.out.println(l);
		}

	
	}


	@Override
	public int compareTo(Laptop o) {
		
		if(this.getRam()>o.getRam())
			return 1;	
		else 
			return -1;
		
	}
}















