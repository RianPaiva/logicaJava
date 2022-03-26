import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int hora;
		System.out.println("Qual a hora?");
		hora = sc.nextInt();
		
		if(hora<12) {
			
			System.out.println("Bom Dia!");
			
		}else {
			
			if(hora>=12 && hora < 18) {
				
				System.out.println("Boa tarde");
				
				
			}
			else {
				
				System.out.println("Boa noite");
				
			}
			
			
		}	
		
		
		
		sc.close();
				
	}

}
