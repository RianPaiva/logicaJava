import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int opc, qtd;
		double valor;
		
		System.out.println("           ===CARD�PIO===");
		System.out.println("C�DIGO        ALIMENTO       PRE�O");
		System.out.println("  1           Hot-Dog       R$ 4.00");
		System.out.println("  2           X-salada      R$ 4.50");
		System.out.println("  3           X-Bacon       R$ 5.00");
		System.out.println("  4           Torrada       R$ 2.00");
		System.out.println("  5         Refrigerante    R$ 1.50");
		System.out.println("Selecione uma op��o: ");
		opc = sc.nextInt();
		System.out.println("Quantidade: ");
		qtd = sc.nextInt();
		
		
		switch (opc) {
		
		case 1:
			valor = qtd * 4.00;
			System.out.printf("Total %.2f", valor);
			
			break;
		case 2:
			
			valor = qtd * 4.50;
			System.out.printf("Total %.2f", valor);
			
			break;
		case 3:
			valor = qtd *5.00;
			System.out.printf("Total %.2f", valor);
			
			break;
		case 4:
			
			valor = qtd * 2.00;
			System.out.printf("Total %.2f", valor);
			
			break;
		case 5: 
			
			valor = qtd * 1.50;
			System.out.printf("Total %.2f", valor);
			
			break;
		default:
			
			System.out.println("ERRO NA OPERA��O");
			
			break;
		
		}
		
		
		sc.close();
	}

}
