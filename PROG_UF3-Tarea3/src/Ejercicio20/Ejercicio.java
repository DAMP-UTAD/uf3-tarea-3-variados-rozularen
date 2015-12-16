package Ejercicio20;

import java.util.Scanner;

public class Ejercicio {
	
	public static void main(String[] args) {
		int lista1=0,lista2=0;
		int res1 =0,res2=0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Lista 1");
		while(lista1<15){
			res1+=scan.nextInt();
			
			lista1++;
		}
		System.out.println("Lista 2");
		while(lista2<15){
			res2+=scan.nextInt();
 			lista2++;
		}
		if(res1>res2){
			System.out.println("lista 1 mayor");
		}
		else if(res1==res2){
			System.out.println("listas iguales");
		}
		else{
			System.out.println("lista 2 mayor");	
		}
		
	}
}
