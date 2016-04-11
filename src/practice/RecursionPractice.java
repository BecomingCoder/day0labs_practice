package practice;

import java.util.Scanner;

public class RecursionPractice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt();
		long number = getFact(input);
		System.out.println(number);
		
//		long result = userFactored(sc);
				
//				System.out.println(result);
sc.close();
	}

	public static long getFact(int number) {
		if(number == 1)
			return 1;
		return number * getFact(number - 1);
	}
/*	public static long userFactored(Scanner sc) {
		int input = sc.nextInt();
		long result = 1;
				
				for (int i = 1; i <= input; i++) {
					result = result * i;
				}
		return result;
	}*/

}
