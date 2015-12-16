package Ejercicio2;
import java.util.Scanner;
public class Ejercicio {
	static Scanner scanner = new Scanner(System.in);
	public void notas(){
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		int num3 = scanner.nextInt();
		if((num1 + num2 + num3)/3 >7){
			System.out.println("Promocionado");
		}
		else{
			System.out.println("No promociona");
		}
	}
	public static void main(String[] args) {
		Ejercicio ej = new Ejercicio();
		ej.notas();
	}
}
