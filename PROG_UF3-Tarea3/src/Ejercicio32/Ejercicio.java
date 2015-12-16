package Ejercicio32;

import java.util.Scanner;

public class Ejercicio {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int man = 5, tarde = 6, noche = 11;
		float mediaMan = 0,mediaTarde = 0, mediaNoche = 0;
		System.out.println("Edades turno mañana");
		for (int i = 0; i < man; i++) {
			int n = scan.nextInt();
			mediaMan += n;
		}
		System.out.println("Media turno noche: " +(mediaMan /= man));
		System.out.println("Edades turno tarde");
		for (int i = 0; i < tarde; i++) {
			int n = scan.nextInt();
			mediaTarde += n;
		}
		System.out.println("Edades turno noche");
		System.out.println("Media turno noche: " +(mediaTarde /= tarde));
		for (int i = 0; i < noche; i++) {
			int n = scan.nextInt();
			mediaNoche += n;
		}
		System.out.println("Media turno noche: " +(mediaNoche /= noche));
		if(mediaMan > mediaTarde && mediaMan > mediaNoche){
			System.out.println("El turno con mayor media es el turno mañana");
		}
		else if(mediaTarde > mediaMan && mediaTarde > mediaNoche){
			System.out.println("El turno con mayor media es el turno tarde");
		}
		else{
			System.out.println("el turno con mayor media es el turno noche");
		}
	}
}
