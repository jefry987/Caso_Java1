import java.util.Scanner;
public class Caso21 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Ingrese el valor del gasto: ");
		float gasto = sc.nextFloat();
		
		
		float rspta= (float) (gasto-(gasto*0.12));
		
		System.out.println("La respuesta es: " + rspta);

	}

}
