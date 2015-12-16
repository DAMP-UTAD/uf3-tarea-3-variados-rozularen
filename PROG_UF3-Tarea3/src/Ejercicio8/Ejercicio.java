package Ejercicio8;
import java.util.*;
public class Ejercicio {
	public void fecha() {
		Scanner scanner = new Scanner(System.in);
		int dia = scanner.nextInt(), mes = scanner.nextInt(), año = scanner.nextInt();
		if(dia == 25 && mes == 12){
			System.out.println("es navidad");
		}
		else {
			System.out.println("no es navidad");
		}
		
	}
	public static void main(String[] args) {
		Ejercicio ej = new Ejercicio();
		ej.fecha();
	}
}