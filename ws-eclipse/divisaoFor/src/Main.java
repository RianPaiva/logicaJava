import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int rep;
		double n1, n2, res;
		rep=sc.nextInt();
		
		for(int i = 0; i < rep; i++) {
			
			System.out.println("Informe 2 numeros para divisão \n");
			n1=sc.nextDouble();
			n2=sc.nextDouble();
			if(n2 == 0.0) {
				
				System.out.println("Divisão imposivel");
				
			}else {
				
				res= n1 / n2;
				System.out.print(res);
				
			}
			
		}		
				
				
				
		sc.close();
	}

}
