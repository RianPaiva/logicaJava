import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		double delta, b = 0,a=0,c=0;
		double x1=0,x2=0;
		
		System.out.println("=====RESOLVENDO BHASKARA=====");
		
		System.out.println("informe a:");
		a= sc.nextDouble();
		System.out.println("Informe b:");
		b= sc.nextDouble();
		System.out.println("Informe c:");
		c=sc.nextDouble();
		
		delta = Math.pow(b, 2.0) - 4*a*c;
		x1 = (- b + Math.sqrt(delta)) / (2.0 * a);
		x2 = (- b - Math.sqrt(delta)) / (2.0 * a);
		
		System.out.println("=====RESULTADO=====");
		System.out.println("Delta = " + delta);
		System.out.println("X1 = " + x1);
		System.out.println("X2 = "+ x2);
		
		
		
		sc.close();
	}

}
