package Ejercicio6;

import java.util.Scanner;

public class Ejercicio {
	static Scanner scanner = new Scanner(System.in);
	
			
	public void digitos(){
		int num = scanner.nextInt();
		if(num>0 && num<9){
			System.out.println("Tiene un digito");
		}
		else if(num>=10 && num<99){
			System.out.println("Tiene dos digitos");
		}
		else if(num>=100 && num<999){
			System.out.println("Tiene tres digitos");
		}
		else{
			System.err.println("Tiene mas de tres digitos");
		}
	}
	public static void main(String[] args) {
		Ejercicio ej = new Ejercicio();
		ej.digitos();
	}
}