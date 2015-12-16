package Ejercicio31;

import java.util.Scanner;

public class Ejercicio {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int neg = 0, pos = 0, mult = 0, pares = 0;
		for (int i = 0; i < 10; i++) {
			int n = scan.nextInt();
			if (n > 0) {
				pos++;
			} else if (n < 0) {
				neg++;
			}
			if (n % 15 == 0) {
				mult++;
			}
			if (n % 2 == 0 && n != 0) {
				pares++;
			}
		}
		System.out
				.println("positivos: " + pos + " negativos: " + neg + " multiplos de 15: " + mult + " pares: " + pares);
	}
}
