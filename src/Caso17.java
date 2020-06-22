import java.util.Scanner;
public class Caso17 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Ingrese el número de aprobados: ");
		int aprobados= sc.nextInt();
		
		System.out.print("Ingrese el número de desaprobados: ");
		int desaprobados= sc.nextInt();
		
		System.out.print("Ingrese el número de retirados: ");
		int retirados= sc.nextInt();
		
		int total= aprobados+desaprobados+retirados;
		
		float porcentaje1= (float) ((aprobados*100)/total);
		float porcentaje2= (float) ((desaprobados*100)/total);
		float porcentaje3= (float) ((retirados*100)/total);
		
		System.out.println("Aprobados: " + porcentaje1 + "%");
		System.out.println("Desaprobados: " + porcentaje2 + "%");
		System.out.println("Retirados: " + porcentaje3 + "%");
	}

}
