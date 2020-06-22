import java.util.Scanner;
public class Caso23 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Ingrese el nombre del producto: ");
		String producto = sc.nextLine();
		
		System.out.print("Ingrese el precio del producto: ");
		float precio = sc.nextFloat();
		
		System.out.print("Ingrese la cantidad de productos: ");
		int cantidad = sc.nextInt();
		
		float importe= precio*cantidad;
		float igv = (float) (importe*0.18);
		float descuento= (float) (importe*0.03);
		float total= importe-descuento+igv;
		
		System.out.println("El importe es de: " + importe);
		System.out.println("El igv es de: " + igv);
		System.out.println("El descuento es de: " + descuento);
		System.out.println("El total es de: " + total);
		
		
		
	}

}

