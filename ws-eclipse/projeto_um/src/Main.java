import java.util.Locale;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("PRINTANDO MENSAGENS E N�MEROS INT");
		int y=32;
		double x=10.35784; 
		
		System.out.println(y);
		
		
		System.out.println("Bom dia.");
		
		
		System.out.println("PRINTANDO DOUBLE");
		
		System.out.println(x);
		//para declarar uma quebra de linha depois de %.2f coloca-se \n ou %n 
		//com tratamento de casas decimais:
		System.out.println("Com tratamento de casas decimais:");
		System.out.printf("%.2f\n", x);
		System.out.printf("%.4f%n", x);
		//importando classe de regi�o de idioma:
		Locale.setDefault(Locale.US);
		
		System.out.println("PADR�O AMERICANO:");
		System.out.printf("%.4f%n", x);
		//CONCATENANDO:
		System.out.println("Resultado = " + x + " metros.");
		//CONCATENANDO PRINTF
		System.out.printf("Resultado = %.2f metros. %n" , x);
		//declarando variaveis
		String nome= "Maria";
		int idade = 31;
		double renda = 4000.0;
		//concatenando variaveis
		System.out.printf("%s tem %d anos de idade e ganha R$%.2f reais", nome, idade, renda);
		
		
		
	}

}
