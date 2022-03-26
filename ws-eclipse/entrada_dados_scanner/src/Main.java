//IMPORTANDO BIBLIOTECA DE IDIOMA
import java.util.Locale;
//IMPORTANDO BIBLIOTECA SCANNER
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//idioma
		Locale.setDefault(Locale.US);
		
		//DECLARANDO OBJETO SCANNER ("SC" NO CASO )
		Scanner sc = new Scanner(System.in);
		// ENTÃO PROSSEGUIR O CÓDIGO
		
		//DECLARANDO VARIAVEL
		String x;
		int n1;
		//ATIBUINDO INFORMAÇÕES DIGITADAS:
		x = sc.next();
		System.out.println("DIGITE UM NUMERO AGORA:");
		n1= sc.nextInt();
		//MOSTRANDO NA TELA
		System.out.println("Você digitou: " + x + " e  o numero: " + n1);	
		
		//ATRIBUINDO DOUBLE
		double d1;
		System.out.println("==ATRIBUINDO DOUBLE==");
		System.out.println("Digite um número:");
		d1=sc.nextDouble();
		System.out.println("O número é: " + d1);
		
		
		//ATRIBUINDO CHAR
		
		char c1;
		
		System.out.println("==ATRIBUINDO CHAR==");
		System.out.println("Digite UM TEXTO");
		//charAt(0) faz com que a variavel receba o primeiro caractere da frase que for digitada, o caractere da posição 0.
		c1=sc.next().charAt(0);
		System.out.println("O primeiro caractere da frase é: " + c1);
		
		
		//ATRIBUINDO MAIS DE UMA VARIAVEL NA MESMA LINHA
		String x1;
		int y1;
		double z1;
		
		System.out.println("DIGITE UM NOME UM NUMERO INTEIRO E UM NUMERO DECIMAL");
		x1= sc.next();
		y1 = sc.nextInt();
		z1 = sc.nextDouble();
		System.out.println("Dados digitados:");
		System.out.println(x1);
		System.out.println(y1);
		System.out.println(z1);
		
				
		//FECHANDO OBJETO SC, AO NÃO PRECISAR MAIS USAR
		sc.close();
		
		
	}

}
