public class Caso6 {

	public static void main(String[] args) {
		int rpta1 = (int) Math.pow(5, 3);
		float rpta2 = (float) Math.pow(81, 1/2.0);
		float rpta3 = (float) Math.pow(125, 1/3.0);
		float rpta41 = (float) Math.pow(256, 1/4.0);
	    float rpta42 = (float) Math.pow(25, 1/2.0);
		float rpta4 = rpta41 + rpta42;
		
		System.out.println("----------");
		System.out.println("Resultados");
		System.out.println("----------");
		System.out.println("Respuesta 1: " + rpta1);
		System.out.println("Respuesta 2: " + rpta2);
		System.out.println("Respuesta 3: " + rpta3);
		System.out.println("Respuesta 4: " + rpta4);

	}

}
