import java.util.Scanner;
public class Caso18 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Ingrese la altura del tri�ngulo: ");
		int altura = sc.nextInt();
		
		System.out.print("Ingrese la base del tri�ngulo: ");
		int base = sc.nextInt();
		
		float area= (float) ((base*altura)/2);
		
		System.out.println("El �rea del tri�ngulo es: " + area);

	}

}
