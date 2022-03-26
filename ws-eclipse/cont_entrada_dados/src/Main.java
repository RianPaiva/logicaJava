import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc= new Scanner(System.in);
		
		int n1;
		String s1, s2, s3;
		
		System.out.println("====DIGITE  1 NUMERO E  3 LINHAS====");
		//QUANDO SE TENTA LER UM NUMERO E DEPOIS USA NEXTLINE PARA LER AS DEMAIS LINHAS ACONTECE UM ERRO
		//AO APERTAR ENTER O JAVA RECONHECE MAIS UMA QUEBRA DE LINHA QUE É ATRIBUIDA AUTOMATICAMENTE A PROXIMA VARIAVEL A SER ATRIBUIDA
		n1=sc.nextInt();
		//POR ISSO COLOCA ESSE OUTRO NEXT LINE, ELE IRA CONSUMIR ESSA QUEBRA DE LINHA :)
		sc.nextLine();
		//o comando nextLine, le a primeira linha digitada completa e pula para a proxima
		s1=sc.nextLine();
		s2=sc.nextLine();
		s3=sc.nextLine();
		
		System.out.println("OS DADOS DIGITADOS FORAM:");
		System.out.println(n1);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		
		sc.close();
		
		
	}

}
