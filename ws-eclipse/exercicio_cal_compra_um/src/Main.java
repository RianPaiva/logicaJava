import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int codprod1,  qtd1;
		int codprod2, qtd2;
		double val1, val2, res;
		System.out.println("#####CAIXA SIMPLES#####");
		System.out.println("informe o código do produto 1: ");
		codprod1 = sc.nextInt();
		System.out.println("informe o valor: ");
		String recebe = sc.next();
		recebe = recebe.replace(",",".");
		val1 = Double.parseDouble(recebe);
		System.out.println("informe a quantidade:");
		qtd1= sc.nextInt();
		
		
		
		System.out.println("informe o código do produto 2: ");
		codprod2 = sc.nextInt();
		System.out.println("informe o valor: ");
		recebe = sc.next();
		recebe = recebe.replace(",", ".");
		val2 = Double.parseDouble(recebe);
		System.out.println("informe a quantidade:");
		qtd2= sc.nextInt();
		
		res = (val1 * qtd1) + (val2 * qtd2);
		
		
		System.out.printf("Valor : %.2f", res);	
		
		
		sc.close();
		
	}

}
