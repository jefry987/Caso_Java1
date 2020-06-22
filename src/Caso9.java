import java.util.Scanner;
public class Caso9 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Ingrese la altura del rectángulo: ");
		int altura = sc.nextInt();
		
		System.out.print("Ingrese la base del rectángulo: ");
		int base = sc.nextInt();
		
		int area = altura*base;
		int perimetro = (altura+base)*2;
		
		System.out.println("El área del rectángulo es: " + area);
		System.out.println("El perímetro del rectángulo es: " + perimetro);

	}

}
