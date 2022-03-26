import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		
		int n =0;
		char decisao;

	do {
			System.out.println("Digite um numero");
			try {
			n= sc.nextInt();
			System.out.println("Número digitado: " + n);
			}catch(java.util.InputMismatchException e) {
				
				System.out.println("Digite um valor valido");
				sc.next();
			}
			
			System.out.println("deseja repetir? [s/n]");
			decisao = sc.next().charAt(0);
			
	}while(decisao != 'n');
		

			

			sc.close();
			
	
	}			
}
