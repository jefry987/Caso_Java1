import java.util.Scanner;
public class Caso16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese las horas trabajas: ");
		int ht = sc.nextInt();
		
		System.out.print("Ingrese la tarifa por hora: ");
		float th = sc.nextFloat();
		
		float sueldo = ht*th;
	    float bono = (float)(sueldo*0.05);
	    float total = sueldo+bono;
	    float totaldolares= (float)(total/3.24);
	    
	    System.out.println("El sueldo es de : " + sueldo);
	    System.out.println("El bono es de: " + bono);
	    System.out.println("El total es de: " + total);
	    System.out.println("El total en dólares es: " + totaldolares);
			
	}

}
