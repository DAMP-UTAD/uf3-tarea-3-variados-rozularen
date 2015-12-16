package Ejercicio34;

import java.util.Scanner;

public class Ejercicio {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int l = scan.nextInt();
		for (int i = 0; i < l; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
