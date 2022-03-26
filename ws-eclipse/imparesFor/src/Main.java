import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int x;
		System.out.println("Informe um número");
		x = sc.nextInt();
		
		for(int i=1; i<=x;i++) {
			
			double teste;
			teste = i % 2;
			if(teste != 0) {
				System.out.println(i);
			}
			
		}
		
		
		sc.close();
	}

}
