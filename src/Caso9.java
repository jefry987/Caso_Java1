import java.util.Scanner;
public class Caso9 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Ingrese la altura del rect�ngulo: ");
		int altura = sc.nextInt();
		
		System.out.print("Ingrese la base del rect�ngulo: ");
		int base = sc.nextInt();
		
		int area = altura*base;
		int perimetro = (altura+base)*2;
		
		System.out.println("El �rea del rect�ngulo es: " + area);
		System.out.println("El per�metro del rect�ngulo es: " + perimetro);

	}

}
