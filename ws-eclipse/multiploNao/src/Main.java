import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		double n1, n2, div;
		
		System.out.println("Informe 2 n�meros e direi se s�o multiplos");
		n1= sc.nextDouble();
		n2=sc.nextDouble();
		if(n1>n2) {
			
			div= n1 % n2;  
			if(div == 0) {
				
				System.out.println("S�o multiplos");
			}else {
				System.out.println("N�o s�o multiplos");
			}
			
		}else {
			
			div = n2 % n1;
			if(div == 0) {
				
				System.out.println("S�o multiplos");
				
			}else {
			
				System.out.println("N�o s�o multiplos");
			}
			
		}
		
		
		
		sc.close();		
		
	}

}
