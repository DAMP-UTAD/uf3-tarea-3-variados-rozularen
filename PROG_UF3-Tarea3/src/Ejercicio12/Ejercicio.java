package Ejercicio12;

import java.util.Scanner;

public class Ejercicio {
	public void cuadrante() {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int y = scan.nextInt();
		if(x!=0&&y!=0){
			if(x>0 && y>0){
				System.out.println("primer cuadrante");
			}
			else if(x>0 && y<0){
				System.out.println("tercer cuadrante");
			}
			else if(x<0 && y>0){
				System.out.println("segundo cuadrante");
			}
			else if(x<0 && y<0){
				System.out.println("cuarto cuadrante");
			}
		}
		
	}
	public static void main(String[] args) {
		Ejercicio ej = new Ejercicio();
		ej.cuadrante();
	}
}