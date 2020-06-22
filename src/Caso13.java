import java.util.Scanner;
public class Caso13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese el Nombre: ");
		String nombre= sc.nextLine();
		
		System.out.print("Ingrese el Apellido: ");
		String apellido= sc.nextLine();
		
		
        System.out.println("----------");
		System.out.println("Resultados");
		System.out.println("----------");
		System.out.println("" + nombre + " " + apellido);

	}

}
