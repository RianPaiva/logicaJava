import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int rep =0;
		double v1=0.0, v2=0.0, v3=0.0;
		double med = 0.0;
		rep = sc.nextInt();
		
		for(int i = 1; i <= rep; i++) {
			System.out.println("Informe 3 valores para média");
			v1= sc.nextDouble();
			v2= sc.nextDouble();
			v3=sc.nextDouble();
			
			med = (v1*2 + v2*3 + v3*5) / 10;
			System.out.printf("%.1f \n", med);
			
		}
		
		
		sc.close();
	}

}
