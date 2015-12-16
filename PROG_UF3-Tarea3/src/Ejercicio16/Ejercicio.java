package Ejercicio16;

import java.util.Scanner;

public class Ejercicio {
	public void medioAlturas() {
		Scanner scan = new Scanner(System.in);
		float altura, alturaMedia = 0, n = scan.nextInt();
		float num = n;
		while(n!=0){
			altura = scan.nextInt();
			alturaMedia += altura;
			n--;
		}
		alturaMedia = alturaMedia / num;
		System.out.println(alturaMedia);

	}
	public static void main(String[] args) {
		Ejercicio ej = new Ejercicio();
		ej.medioAlturas();
	}
}