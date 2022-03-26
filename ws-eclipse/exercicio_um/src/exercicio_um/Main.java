package exercicio_um;


//chamando bibliotecas:

import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//EXERCICIO DE CONCATENAÇÃO
		//DECLARANDO VARIAVEIS DE TEXTO:
		String product1 = "Computer";
		String product2 = "Office desk";
		//DECLARANDO VARIAVEIS DE TIPO INTEIRO:
		int age= 30;
		int code= 5290;
		//DECLARANDO VARIAVEL DE TIPO UNICODE:
		char gender = 'F';
		
		//DECLARANDO VARIAVEIS DE TIPO DECIMAL:
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		
		//PRINTANDO NA TELA:
		System.out.println("Products:");
		System.out.printf("%s, which price is $ %.2f \n", product1, price1);
		System.out.printf("%s, which price is $ %.2f \n \n", product2, price2);
		System.out.printf("Record: %d years old, code %d and gender: %s \n \n", age, code, gender);
		System.out.printf("Measue with eigth decimal places: %f \n", measure);
		System.out.printf("Rouded (three decimal places): %.3f\n", measure);
		// MUDANDO REGIÃO DO IDIOMA
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.2f", measure);
		
		
		
		
		
		
		
		
		
	}

}
