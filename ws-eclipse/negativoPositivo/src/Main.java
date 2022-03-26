import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int num ;
		
		num = 0;
		System.out.println("POSITIVO/NEGATIVO/NULO");
		System.out.println("Informe um número \n");
		num = sc.nextInt();
		
		
		if(num>0) {
			System.out.printf("%d é positivo", num);
			
		}else {
			
			if(num == 0){
				System.out.printf("%d é nulo", num);
				
				
			}
			else {
				
				
				System.out.printf("%d é negativo", num);
				
			}
			
		}
		
		sc.close();
				
	}

}
