import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a,b,c,d,result;
		Scanner sc = new Scanner(System.in);
		System.out.println("DIFERENÇA ENTRE PRODUTOS");
		System.out.println("informe 4 numeros inteiros");
		String r = sc.next();
		r = r.replace(",",".");
		a = Double.parseDouble(r);
		
		r = sc.next();
		r = r.replace(",",".");
		b = Double.parseDouble(r);
		
		r = sc.next();
		r = r.replace(",",".");
		c = Double.parseDouble(r);
		
		r = sc.next();
		r = r.replace(",",".");
		d = Double.parseDouble(r);
		
		result = (a*b) - (c*d);
		
		System.out.println("Reusltado : " + result);
		
		
		sc.close();
		
		
	}

}
