package Ejercicio33;

import java.util.Scanner;

public class Ejercicio {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int divisor = 0, n = scan.nextInt();
		for (int i = 2; n>0; i++) {
			for (divisor = 2; divisor < i && i % divisor != 0; divisor++);
			if (divisor == 1) {
				if (i != 2) {
					System.out.println(", ");
				}
				System.out.println(i);
				n--;
			}
			
		}
	}
}
