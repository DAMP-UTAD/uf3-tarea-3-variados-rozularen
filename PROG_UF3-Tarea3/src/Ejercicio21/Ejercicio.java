package Ejercicio21;

import java.util.Scanner;

public class Ejercicio {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int par = 0, impar = 0;
		while(n!=0){
			int y = scan.nextInt();
			if(y%2==0 && y!=0){
				par++;
			}
			else{
				impar++;
			}
			
			n--;
		}
		System.out.println("pares: "+par+"impares: "+impar);
	}
}
