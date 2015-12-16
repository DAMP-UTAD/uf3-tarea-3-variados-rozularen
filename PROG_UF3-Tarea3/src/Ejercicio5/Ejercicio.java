package Ejercicio5;

import java.util.Scanner;

public class Ejercicio {
	static Scanner scanner = new Scanner(System.in);
	public void valorNum(){
		int num = scanner.nextInt();
		if(num > 0){
			System.out.println("Es positivo");
		}
		else if(num < 0){
			System.out.println("Es negativo");
		}
		else if(num==0){
			System.out.println("Es nulo");
		}
	}
	public static void main(String[] args) {
		Ejercicio ej = new Ejercicio();
		ej.valorNum();
		
	}
}