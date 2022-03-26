import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int h1, h2,d;
		System.out.println("infome a hora inicial do jogo");
		h1 = sc.nextInt();
		
		System.out.println("Infome a hora final do jogo");
		h2 =sc.nextInt();
		
		if(h1 < h2){
			
			d = h2 - h1;
			
		}else {
		
			d = 24- h1 + h2;
		}
		
		System.out.printf("O jogo durou %d hora(s)", d);
		
		
		
		
		sc.close();
		
		

	}

}
