package com;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Set;

public class Resturant {

	public static void main(String[] args) throws IOException {
		
		
		Dish d1 = new Dish(1, "Salad", 20);
		Dish d2 = new Dish(2, "Tawa-Roti", 120);
		Dish d3 = new Dish(3, "Chicken", 280);
		Dish d4 = new Dish(4, "Salad-2", 40);
		
		
		ArrayList<Dish> dishes = new ArrayList<Dish>();
		
		
		dishes.add(d1);
		dishes.add(d2);
		dishes.add(d3);
		dishes.add(d4);
		
		LinkedHashMap<Dish, Integer> ordered = new LinkedHashMap<Dish , Integer>();
		
		Scanner sc = new Scanner(System.in);
		int input;
		boolean exit = false;
		
		int dish1Quantity = 0;
		int dish2Quantity = 0;
		int dish3Quantity = 0;
		int dish4Quantity = 0;
		
		do {
			System.out.println("Please select a dish to order . Press 0 to exit");
			System.out.println(d1.getsNo()+ " "+ d1.getDishName()+" "+ d1.getPrice());
			System.out.println(d2.getsNo()+ " "+ d2.getDishName()+" "+ d2.getPrice());
			System.out.println(d3.getsNo()+ " "+ d3.getDishName()+" "+ d3.getPrice());
			System.out.println(d4.getsNo()+ " "+ d4.getDishName()+" "+ d4.getPrice());
			input = sc.nextInt();
			
			switch (input) {
			case 1: {
				dish1Quantity++;
				ordered.put(d1, dish1Quantity);
				System.out.println(d1.getDishName()+" Added Successfully");
				System.out.println();
				break;
			}
			case 2: {
				dish2Quantity++;
				ordered.put(d2, dish2Quantity);
				System.out.println(d2.getDishName()+" Added Successfully");
				System.out.println();
				break;
			}
			case 3: {
				dish3Quantity++;
				ordered.put(d3, dish3Quantity);
				System.out.println(d3.getDishName()+" Added Successfully");
				System.out.println();
				break;
			}
			case 4: {
				dish4Quantity++;
				ordered.put(d4, dish4Quantity);
				System.out.println(d4.getDishName()+" Added Successfully");
				System.out.println();
				break;
			}
			case 0 : {
				exit=true;
			
			}
			
			}
			
			
		
			
		}while(!exit) ;
		{
			System.out.println("You have Ordered : ");
			double billingAmount = 0;
			Set<Dish> keys = ordered.keySet();
			FileWriter writer = new FileWriter(new File("bill.txt"));
			writer.write("\t"+"------------------Chanu Veer Da Dhabha--------------------"+"\t"+"\n"+"\n");
			writer.write("\t"+"GST NO : 1392084028G"+"\t\t"+"Address: NH_14 , SofturRood"+"\n");
			writer.write(" "+"\n");
			writer.write( "\t"+"----------------------------------------------------------"+"\n");
			writer.write(" \t"+"Your Bill "+"\n");
			for(Dish dish : keys) {
				writer.write("\t"+dish.getDishName() );
				for(int i = dish.getDishName().length() ; i<=25 ; i++) {
					
					writer.write(" ");
				};
				writer.write("\t"+" X "+ ordered.get(dish)+"\t\t"+ dish.getPrice()+"\n");
				billingAmount = billingAmount + (dish.getPrice()*ordered.get(dish));
			}
			writer.write(" "+"\n");
			writer.write( "\t"+"----------------------------------------------------------"+"\n");
			writer.write(" "+"\n");
			writer.write("\t"+"Amount Payable is "+ billingAmount + " RS ");
			writer.write(" "+"\n");
			writer.write( "\t"+"----------------------------------------------------------"+"\n");
			writer.write(" "+"\n");
			writer.flush();
			System.out.println("Please Visit AGain...||");
		}
		}
	}

	
		
