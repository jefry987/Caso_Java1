import java.util.Scanner;
public class Caso5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		float n1=0, n2 = 0;
		
		System.out.print("Ingrese el primer número: ");
		n1 = sc.nextFloat();
		
		System.out.print("Ingrese el segundo número: ");
		n2 = sc.nextFloat();
		
		float promedio = (n1+n2)/2;
		float aumento = (float) (n1+n1*0.2);
		float resta = (float) (n2-n2*0.3);
		
		System.out.println("El promedio de los dos números es: " + promedio);
		System.out.println("El aumento del primer número es: " + aumento);
		System.out.println("La disminución del segundo número es: " + resta);
	}

}
