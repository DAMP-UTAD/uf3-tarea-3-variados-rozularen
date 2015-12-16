package Ejercicio4;

import java.util.Scanner;

public class Ejercicio {
	static Scanner scanner = new Scanner(System.in);
	public void mayor(){
		int num1 = scanner.nextInt();//5
		int num2 = scanner.nextInt();//7
		int num3 = scanner.nextInt();//6
		int mayor = 0;
		
		if(num1>num2){
			if(num1>num3){
				mayor = num1;
			}
			else{
				mayor = num3;
			}
		}
		else{
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
		ej.mayor();
	}
}
