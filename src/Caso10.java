import java.util.Scanner;
public class Caso10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		float pi = (float) (3.1416);
		
		System.out.print("Ingrese el radio del c�rculo: ");
		int radio = sc.nextInt();
		
		float area = (float) (pi*Math.pow(radio, 2));
		
		System.out.println("El �rea del c�rculo es: " + area);
	}

}
