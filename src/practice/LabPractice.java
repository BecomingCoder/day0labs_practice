package practice;

import java.util.Scanner;

public class LabPractice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
/*		int z = sc.nextInt();
		
		z = add1(z);
		
		System.out.println(z); */
		
		double x, y;
		
		x = sc.nextDouble();
		y = sc.nextDouble();
		diffLessThan5(x, y);

	}

	public static int add1(int x) {
		x = x + 1;
		
		return x;
	}
	
	public static boolean diffLessThan5(double x, double y) {
		double diff = Math.abs(x - y);
			return diff < 5;
	}
	
}



