package Ejercicio35;

import java.util.Scanner;

public class Ejercicio {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if(n<10){
					System.out.print(n++ + " ");
				}
				 System.out.print(n++ + " ");
			}
			System.out.println();
		}
	}
}
