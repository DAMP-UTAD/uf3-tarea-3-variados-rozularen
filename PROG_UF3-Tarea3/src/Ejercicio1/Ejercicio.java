package Ejercicio1;
import java.util.Scanner;

public class Ejercicio {
	static Scanner scanner = new Scanner(System.in);
	public void dosNumeros(){
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		if(num1 != num2){
			if(num1>num2){
				System.out.println("La suma de los numeros: " + (num1 + num2));
				System.out.println("La diferencia de los numeros: " + (num1 - num2));
			}
			else{
				System.out.println("El producto de los numeros: " + (num1 * num2));
				System.out.println("La division de los numeros: " + (num1 / num2));
			}
		}
	}
	
	public static void main(String[] args) {
		Ejercicio ej = new Ejercicio();
		ej.dosNumeros();
	}
}
