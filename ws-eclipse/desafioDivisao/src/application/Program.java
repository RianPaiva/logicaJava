package application;


import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		
		int x = sc.nextInt();
		sc.nextLine();
		
		String bin = Integer.toBinaryString(x);
		
		
		
	
		String[] vect = new String[bin.length()];
		
		for (int i = 0; i < vect.length; i++) {
			vect[i] = bin.substring(i, i+1);
			
			
		}
		
		int[] vetInt = new int[vect.length];
		
		int cont=0;
		
		for(int i = 0; i < vect.length; i++) {
			
			vetInt[i] = Integer.parseInt(vect[i]);
			
			if(vetInt[i] == 1) {
				
				cont += 1;
				
			}
			
		}
		
		if(cont == 1) {
			
			System.out.println("True: Potência de 2");
			
		}else {
			
			System.out.println("False: Não é potência de 2");
			
		}
		
		sc.close();
		
		
	}

}
