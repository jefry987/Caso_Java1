import java.util.Scanner;
public class Caso14 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Ingrese n�mero: ");
		int n= sc.nextInt();
		
		int sumatoria=(n*(n+1))/2;
		
		System.out.println("Resultados");
		System.out.println("==========");
		System.out.println("Sumatoria de " + n + " es: " + sumatoria);

	}

}
