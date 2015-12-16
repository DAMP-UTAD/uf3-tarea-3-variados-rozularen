package Ejercicio13;
import java.util.*;
public class Ejercicio {
	public void operario(){
		float sueldo, antiguedad;
		Scanner scanner = new Scanner(System.in);
		sueldo = scanner.nextInt();
		antiguedad = scanner.nextFloat();
		if(sueldo<500 && antiguedad > 10){
			sueldo = (float) (sueldo * 1.2);
			System.out.println("Sueldo a pagar: " + sueldo);
		}
		else if(sueldo < 500 && antiguedad < 10){
			sueldo = (float) (sueldo * 1.05);
			System.out.println("Sueldo a pagar: "+sueldo);
		}
		else{
			System.out.println("Sueldo a pagar: "+sueldo);
		}
		
		
	}
	public static void main(String[] args) {
		Ejercicio ej = new Ejercicio();
		ej.operario();
	}
}