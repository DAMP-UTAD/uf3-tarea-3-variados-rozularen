package Ejercicio3;
import java.util.*;
public class Ejercicio {
	static Scanner scanner = new Scanner(System.in);
			
	public void numDosDigitos(){
		int x = scanner.nextInt();
		if (x >= 10 && x <= 99) {
		   System.out.println("Tiene dos digitos");
		}
		else if(x>0 && x<10){
			System.out.println("Tiene un digito");
		}
	}
	public static void main(String[] args) {
		Ejercicio ej = new Ejercicio();
		ej.numDosDigitos();
	}
}
