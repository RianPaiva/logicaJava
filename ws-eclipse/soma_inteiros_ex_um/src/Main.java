import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("SOMA SIMPLES (NÚMEROS INTEIROS)");
		System.out.println("insira dois números inteiros:");
		int n1 =sc.nextInt();
		int n2 =sc.nextInt();
		
		int res = n1 + n2;
		
		System.out.println("SOMA = " + res);
		
		sc.close();
	}

}
