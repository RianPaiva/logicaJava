import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int cod;
		double h,v, s;
		System.out.println("$$$$CALCULO DE SALÁRIO$$$$");
		System.out.println("Informe seu código de funcionário:");
		cod =sc.nextInt();
		System.out.println("Informe o valor de sua hora de trabalho:");
		String r = sc.next();
		r = r.replace(",", ".");
		v=Double.parseDouble(r);
		System.out.println("Informe quantas horas trabalhadas");
		r = sc.next();
		r = r.replace(",", ".");
		h=Double.parseDouble(r);
		
		s= v * h;
		
		System.out.printf("%d seu salário será: R$%.2f",cod, s);
		
		
		
		
		sc.close();
		
		
	}

}
