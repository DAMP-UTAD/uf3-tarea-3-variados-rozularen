package Ejercicio11;

import java.util.Scanner;

public class Ejercicio {
	public void menorDiez(){
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		if(num1<10||num2<10||num3<10){
			System.out.println("Alguno de los numeros es menor que diez");
		}
	}
	public static void main(String[] args) {
		Ejercicio ej = new Ejercicio();
		ej.menorDiez();
	}
}