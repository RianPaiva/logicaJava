import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		Double raio, area;
		
		System.out.println("AREA DO CIRCULO");
		System.out.println("informe o raio da circunferência:");
		String r= sc.next();
		r = r.replace(",", ".");
		raio = Double.parseDouble(r);
		
		area= 3.14159 * (Math.pow(raio, 2));
		//printf usa virgula para concatenar
		System.out.printf("A area é igual a : %.4f" , area);
		
		sc.close();
	}

}
