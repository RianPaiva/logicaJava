import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num;
		
		
		System.out.println("==PAR OU IMPAR==");
		System.out.println("informe um número para saber se é par ou impar");	
		num = sc.nextInt();
		if(num%2 == 0){
			
			System.out.printf("%d é par", num);
			
		}else {
			System.out.printf("%d é impar", num);
			
		}
		
		
		
		
		sc.close();
		
	}

}
