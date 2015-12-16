package Ejercicio9;
import java.util.*;
public class Ejercicio {
	public void tresNum(){
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		if(num1 == num2 && num2 == num3){
			System.out.println("Resultado: "+ ((num1+num2)*num3));
		}
		else{
			System.out.println("Los numeros no son iguales");
		}
	}
	public static void main(String[] args) {
		Ejercicio ej = new Ejercicio();
		ej.tresNum();
		
	}
}