package Ejercicio14;

import java.util.Scanner;

public class Ejercicio {
	public void numeros() {
		Scanner scan = new Scanner(System.in);
		int num1, num2, num3, mayor, menor;
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		if(num1!=num2){
			num3 = scan.nextInt();
		}
		else{
			System.out.println("Ha introducido dos numeros iguales, por favor vuelva a introducir otro numero.");
			num2 = scan.nextInt();
			num3 = scan.nextInt();
		}
		if(num1>num2){
			if(num1>num3){
				mayor=num1;
			}
			else{
				mayor=num3;
			}
		}
		else if(num2>num1){
			if(num2>num3){
				mayor = num2;
			}
			else{
				mayor = num3;
			}
		}
	}
	public static void main(String[] args) {
		Ejercicio ej = new Ejercicio();
		ej.numeros();
	}
}