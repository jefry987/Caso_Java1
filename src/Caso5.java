import java.util.Scanner;
public class Caso5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		float n1=0, n2 = 0;
		
		System.out.print("Ingrese el primer n�mero: ");
		n1 = sc.nextFloat();
		
		System.out.print("Ingrese el segundo n�mero: ");
		n2 = sc.nextFloat();
		
		float promedio = (n1+n2)/2;
		float aumento = (float) (n1+n1*0.2);
		float resta = (float) (n2-n2*0.3);
		
		System.out.println("El promedio de los dos n�meros es: " + promedio);
		System.out.println("El aumento del primer n�mero es: " + aumento);
		System.out.println("La disminuci�n del segundo n�mero es: " + resta);
	}

}
