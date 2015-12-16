package Ejercicio27;

import java.util.Scanner;

public class Ejercicio {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for(int i = 1; i<=12;i++){
			System.out.print(n*i + " ");
		}
	}
}
