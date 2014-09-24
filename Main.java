import java.util.Scanner;

/*
 *Programa para visualizar en pantalla el resultado 
 * del area y circunferencia de un circulo.
 */
public class Main {

	public static void main (String args[]) {

		double radio, resultadoArea, resultadoCircunferencia;
		Circulo operaciones = new Circulo();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("\ningresa un número para el radio: ");
		radio = sc.nextDouble();



		resultadoArea = operaciones.area(radio);
		resultadoCircunferencia = operaciones.circunferencia(radio);
	

		System.out.println("\nEl resultado de la Area es: " + resultadoArea);
		System.out.println("\nEl resultado de la Circunferencia es: " + resultadoCircunferencia);
	}
}
