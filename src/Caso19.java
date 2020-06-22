import java.util.Scanner;
public class Caso19 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Ingrese el primer lado del triángulo: ");
		int lado1= sc.nextInt();
		
		System.out.print("Ingrese el segundo lado del triángulo: ");
		int lado2= sc.nextInt();
		
		System.out.print("Ingrese el tercer lado del triángulo: ");
		int lado3= sc.nextInt();
		
		int perimetro= lado1+lado2+lado3;
		
		System.out.println("El Perímetro del triángulo es: " + perimetro);
		
	}

}
