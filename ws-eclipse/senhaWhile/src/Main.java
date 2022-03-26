import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int senha;
		
		System.out.println("Digite a Senha");
		senha = sc.nextInt();
		
		while(senha != 2002) {
			
			System.out.println("Senha invalida, digite novamente:");
			senha= sc.nextInt();
			
			
		}
		
		System.out.println("Acesso permitido");
		
		sc.close();
	}

}
