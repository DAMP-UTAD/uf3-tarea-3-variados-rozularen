package Ejercicio22;

import java.util.Scanner;

public class Ejercicio {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;
		int suma = 0;
		do{
			n = scan.nextInt();
			if(n!=9999){
				suma += n;;
			}
		}
		while(n != 9999);	
		if(suma>0){
			System.out.println("positivo");
		}
		else if(suma == 0){
			System.out.println("Cero");
		}
		else{
			System.out.println("negativo");
		}
	}
}
