package com.masai;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		 int number[] = new int[500];
		
		 String[] name = new String[500];
		 String[] type = new String[500];
		 int[] year = new int[500];
		
		
		 
		 System.out.println("Enter the id of the movie");
			int id =sc.nextInt();
			number[id]=id;
			
			
			
			System.out.println("Enter the name of the movie");
			String nami =sc.next();
			name[id]=nami;
			
			
			System.out.println("Enter the type of the movie");
			String gendi =sc.next();
			type[id]=gendi;
			
			
			System.out.println("Enter the year of the movie");
			int agi =sc.nextInt();
			year[id]=agi;
			
			
			
			System.out.println("Enter the ID of the Id to know his information");
			
			int ide =sc.nextInt();
			System.out.println("Name" + "="+name[ide]);
			System.out.println("Type" + "="+type[ide]);
			
			System.out.println("Year" + "="+year[ide]);
			System.out.println("IMDB Rating" + "="+"*****");
			
		
			

	}

}
