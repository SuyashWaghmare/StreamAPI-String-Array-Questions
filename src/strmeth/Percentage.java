package strmeth;

import java.util.Scanner;

public class Percentage {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter marks a");
		int a = sc.nextInt();
		
		System.out.println("Enter marks b");
		int b = sc.nextInt();
		
		
		System.out.println("Enter marks c");
		int c = sc.nextInt();
		
		System.out.println("Enter marks d");
		int d = sc.nextInt();
		
		System.out.println("Enter marks e");
		int e = sc.nextInt();
		
		
		int totalMarks = a+b+c+d+e;
		
		System.out.println(totalMarks);
		
		 double totalPercentage = ((double) totalMarks / 500) * 100;
		
		System.out.println("Obtained Percentage "+totalPercentage);
	
		
		
		
			
		
		
		
		
		
	}

}
