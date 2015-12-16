package Ejercicio7;
import java.util.*;
public class Ejercicio {
	static Scanner scanner = new Scanner(System.in);
	
	public void test(){
		float numPreguntas = scanner.nextInt(), numRespuestas = scanner.nextInt();
		float porcentaje = 100*(numRespuestas / numPreguntas);
		if(porcentaje <50f){
			System.out.println("Fuera de nivel");
		}
		else if(porcentaje >= 50f && porcentaje < 75f){
			System.out.println("Nivel regular");
		}
		else if(porcentaje >= 75f && porcentaje < 90f){
			System.out.println("Nivel medio");
		}
		else if(porcentaje >90){
			System.out.println("Nivel máximo");
		}
	}
	
	public static void main(String[] args) {
		Ejercicio ej = new Ejercicio();
		ej.test();
	}
}