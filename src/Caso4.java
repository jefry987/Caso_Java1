import java.util.Scanner;

public class Caso4 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int n1 =0, n2 = 0;

		System.out.print("Ingrese el primer numero: ");
		n1 = sc.nextInt();
	    
		System.out.print("Ingrese el segundo numero: ");
		n2 = sc.nextInt();
		
		//Procesamiento
		int suma= n1+n2;
		int resta= n1-n2;
		int producto = n1*n2;
		float division = n1/n2;
		int resto_entero = n1%n2;
		
		//Salida de resultados
		System.out.println("Suma es: " + suma);
		System.out.println("Resta es: " + resta);
		System.out.println("Producto es: " + producto);
		System.out.println("División es: " + division);
		System.out.println("Resto entero es: " + resto_entero);
		
	}

}
