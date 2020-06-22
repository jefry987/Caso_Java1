import java.util.Scanner;
public class Caso22 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese el nombre del alumno: ");
		String nombre= sc.nextLine();
		
		System.out.print("Ingrese la primera nota: ");
		float nota1 = sc.nextFloat();
		
		System.out.print("Ingrese la segunda nota: ");
		float nota2 = sc.nextFloat();
		
		System.out.print("Ingrese la tercera nota: ");
		float nota3 = sc.nextFloat();
		
		float promedio= (float) ((nota1*0.2+nota2*0.3+nota3*0.5));
		
		System.out.println("El Promedio del alumno " + nombre + " es: " + promedio);

	}

}
