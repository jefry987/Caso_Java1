import java.util.Scanner;
public class Caso19 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Ingrese el primer lado del tri�ngulo: ");
		int lado1= sc.nextInt();
		
		System.out.print("Ingrese el segundo lado del tri�ngulo: ");
		int lado2= sc.nextInt();
		
		System.out.print("Ingrese el tercer lado del tri�ngulo: ");
		int lado3= sc.nextInt();
		
		int perimetro= lado1+lado2+lado3;
		
		System.out.println("El Per�metro del tri�ngulo es: " + perimetro);
		
	}

}
