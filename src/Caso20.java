import java.util.Scanner;
public class Caso20 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Ingrese el valor de la venta: ");
		float venta = sc.nextFloat();
		
	
		float rspta= (float) (venta+(venta*0.42));
		
		System.out.println("La respuesta es: " + rspta);
		

	}

}
