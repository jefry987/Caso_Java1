import java.util.Scanner;
public class Caso24 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Ingrese el primer monto: ");
		float monto1 = sc.nextFloat();
		
		System.out.print("Ingrese el segundo monto: ");
		float monto2 = sc.nextFloat();
		
		System.out.print("Ingrese el tercer monto: ");
		float monto3 = sc.nextFloat();
		
		float total = monto1+monto2+monto3;
		
		float rspta1 = (float) (monto1/5+monto2*0.2);
		float rspta2 = (float) ((monto3+monto3*0.6)/3);
		float rspta3 = (float) (total-(total*0.08));
		
		
		System.out.println("Respuesta 1: " + rspta1);
		System.out.println("Respuesta 2: " + rspta2);
		System.out.println("Respuesta 3: " + rspta3);

	}

}
