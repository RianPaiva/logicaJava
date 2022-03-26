import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		double a,b,c,res;
		String r;
		
		
		System.out.println("Informe 3 números para calculos de geometria");
		r=sc.next();
		r= r.replace(",", ".");
		a=Double.parseDouble(r);
		
		r=sc.next();
		r= r.replace(",", ".");
		b=Double.parseDouble(r);
		
		r=sc.next();
		r= r.replace(",", ".");
		c=Double.parseDouble(r);
		
		
		res = (a*c)/2;
		System.out.printf("Triângulo = %.3f \n", res);
		
		res= 3.14159*(Math.pow(c,2));
		System.out.printf("Circulo = %.3f \n", res);
		
		res= ((a+b)*c)/2;
		System.out.printf("Trapezio = %.3f \n", res);
		
		res= Math.pow(b, 2);
		System.out.printf("Quadrado = %.3f \n", res);
		
		res= a*b;
		System.out.printf("Retângulo = %.3f", res);
		
		
		
		
		sc.close();
			
		
	}

}
