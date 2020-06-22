import java.util.Scanner;
public class Caso18 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Ingrese la altura del triángulo: ");
		int altura = sc.nextInt();
		
		System.out.print("Ingrese la base del triángulo: ");
		int base = sc.nextInt();
		
		float area= (float) ((base*altura)/2);
		
		System.out.println("El Área del triángulo es: " + area);

	}

}
