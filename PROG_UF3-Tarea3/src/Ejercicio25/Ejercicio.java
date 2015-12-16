package Ejercicio25;

import java.util.Scanner;

public class Ejercicio {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;
		int suma = 0;
		for(int i = 0;i<10;i++){
			
			if(i>=5){
				suma += scan.nextInt();
			}
			else{
				n = scan.nextInt();
			}
		}
		System.out.println(suma);
	}
}
