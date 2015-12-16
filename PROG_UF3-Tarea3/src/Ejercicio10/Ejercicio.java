package Ejercicio10;

import java.util.Scanner;

public class Ejercicio {
	public void menoresDiez(){
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		if(num1<10&&num2<10&&num3<10){
			System.out.println("Todos son menores que diez");
		}	
	}
	public static void main(String[] args) {
		Ejercicio ej = new Ejercicio();
		ej.menoresDiez();
	}
}