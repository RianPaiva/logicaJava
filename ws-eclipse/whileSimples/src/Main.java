import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int x;
		int soma = 0;
		System.out.println("Informe um numero:");
		x= sc.nextInt();
		//testa uma condição, se verdadeiro executa o que esta entre chaves, senao prossegue o app
		while(x != 0) {
			//+= diz para somar o que ja tem na variavel soma com valor de x
			//mesma coisa que (soma = soma + x;)
			soma += x;
			x = sc.nextInt();
			
		}
		
		System.out.printf("Soma = %d",soma);
		
		
		sc.close();
	}

}
