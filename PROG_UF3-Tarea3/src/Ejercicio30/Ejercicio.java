package Ejercicio30;

import java.util.Scanner;

public class Ejercicio {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for (int i = 0; i < n; i++) {
			int x = scan.nextInt();
			int y = scan.nextInt();
			System.out.println("coordenada ("+ x + "," + y + ")");
		}
	}
}
