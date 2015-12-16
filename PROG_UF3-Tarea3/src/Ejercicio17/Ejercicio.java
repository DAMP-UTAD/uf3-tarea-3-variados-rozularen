package Ejercicio17;

import java.util.Scanner;

public class Ejercicio {
	public void empleados(){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt(),sueldos=0,mayor=0,menor=0;
		while(n!=0){
			sueldos = scan.nextInt();
			if(sueldos>300){
				mayor++;
			}
			else if(sueldos<300&&sueldos>100){
				menor++;
			}
			n--;
		}
		System.out.println("mayores que 300 "+mayor);
		System.out.println("entre 100 y 300 "+menor);
		
		
	}
	public static void main(String[] args) {
		Ejercicio ej = new Ejercicio();
		ej.empleados();
	}
} 