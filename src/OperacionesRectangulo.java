import java.util.Scanner;
/* Programa para calcular el area y el perimetro de un rectangulo. */

public class OperacionesRectangulo {

	public static void main (String args[]) {


		double altointroducido, baseintroducida, area, perimetro;

		Rectangulo rectangulo1 = new Rectangulo();
	
		Scanner sc = new Scanner(System.in);
		System.out.print("\nIntroduce el alto del rectangulo: ");
		altointroducido = sc.nextDouble();


		System.out.print("\nIntroduce la base del rectangulo: ");
		baseintroducida = sc.nextDouble();


		rectangulo1.setAlto(altointroducido);
		rectangulo1.setBase(baseintroducida);


		area = rectangulo1.area();
		perimetro = rectangulo1.perimetro();


		System.out.println("\nEl area del rectangulo es: " + area + "m2");
		System.out.println("\nEl perimetro del rectangulo es: " + perimetro + "m");
	}
}
