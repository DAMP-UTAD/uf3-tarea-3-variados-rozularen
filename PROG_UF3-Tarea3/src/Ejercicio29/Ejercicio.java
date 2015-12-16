package Ejercicio29;

import java.util.Scanner;

public class Ejercicio {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for(int i = 0; i<n;i++){
			int a=scan.nextInt(),b=scan.nextInt(),c=scan.nextInt();
			if(a==b && a==c){
				System.out.println("es equilatero");
			}
			else if(a!=b && a==c){
				System.out.println("es isosceles");
			}
			else{
				System.out.println("es escaleno");
			}
		}
	}
}
