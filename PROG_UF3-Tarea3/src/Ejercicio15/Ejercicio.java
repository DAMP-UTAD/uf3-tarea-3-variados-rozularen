package Ejercicio15;

import java.util.Scanner;

public class Ejercicio {
	public void notas(){
		Scanner scan = new Scanner(System.in);
		int num= 10;
		int mayor =0,menor=0;
		while(num!=0){
			int nota = scan.nextInt();
			if(nota>7){
				mayor++;
 			}
			else{
				menor++;
 			}
			num--;
		}
		System.out.println("mayores que siete: " + mayor  + " " + "menores que siete: "+menor);

	}
	public static void main(String[] args) {
		Ejercicio ej = new Ejercicio();
		ej.notas();
	}
}