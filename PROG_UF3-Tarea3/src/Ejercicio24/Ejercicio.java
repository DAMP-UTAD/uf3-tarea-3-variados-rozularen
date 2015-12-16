package Ejercicio24;

import java.util.Scanner;

public class Ejercicio {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for(int i = 0; i < n; i++){
			int h = scan.nextInt();
			int b = scan.nextInt();
			int mayor12 = 0;
			System.out.println("Altura: "+h+" "+"Base: "+b + " " + "Superficie: "+((h*b)/2f));
			if((h*b)/2f>12){
				mayor12++;
			}
		}
	}
}
