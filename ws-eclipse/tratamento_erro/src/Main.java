import java.util.Scanner;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		Scanner sc = new Scanner(System.in);
		//double d1;
	
		System.out.println("==ATRIBUINDO DOUBLE==");
		System.out.println("Digite um número:");
		
	
		//AO ATRIBUIR NUMEROS DECIMAIS ENCONTREI ERRO RELACIONADO A "." E ",", UM ERRO RELACIONA AO IDIOMA, PARA 
		//TRATAR ISTO FIZ O SEGUINTE:
			// CRIE UMA VARIAVEL STRING E RECEBA O NUMERO NO FORMATO DE TEXTO	
			String r = sc.next();
			//USAR O COMANDO REPLACE VAI TROCAR VIRGULA POR PONTO, DEIXANDO NO FORMATO QUE O JAVA TRABALHA POR PADRÃO
			r = r.replace(',','.');
			//DEPOIS ATRIBUIR NA VARIAVEL DOUBLE O RESULTADO JA TRATADO QUE ESTÁ NA VARIAVEL STRING
			//USANDO parseDouble
			double num = Double.parseDouble(r);
			//AGORA É SÓ VAPO
			System.out.println("O número é: " +num);
		
			
			
		
	
		
		sc.close();
	
	}

}
