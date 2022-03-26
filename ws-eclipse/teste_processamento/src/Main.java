
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//DECLARANDO VARIAVEIS
		int x, y;
		double z;
		//ATRIBUINDO OPERAÇÕES NAS VARIAVEIS(PROCESSAMENTO)
		x = 5;
		y= 2*x;
		
		//ESCREVENDO NA TELA(SAIDA)
		System.out.println(x);
		System.out.println(y);
		
		
		//EXEMPLO 2
		z= 2*x;
		
		//ESCREVENDO NA TELA(SAIDA)
		System.out.println("exemplo 2: \n");
		System.out.println(x);
		System.out.println("variavel com double:");
		System.out.println(z);
		
		
		//AREA DO TRAPÉZIO
		
		System.out.println("======ÁREA DO TRAPÉZIO======");
		double b, B, h, area;
		//ATRIBUIÇÃO:
	    b =6.0;
	    B = 8.0;
	    h = 5.0;
	    
	    area= (b+B)/2*h;
	    
	    System.out.println(area);
	    
	    
	    //DIVISÃO
	    int a1, b1;
	    double r1;
	    
	    a1=5;
	    b1=2;
	    System.out.println("======DIVISÃO======");
	    //PARA QUE O COMPILADOR ENTENDA QUE O RESULTADO É DOUBLE PRECISA COLOCAR "(DOUBLE)" ANTES DA OPERAÇÃO COM NUMEROS DO TIPO INT
	    r1= (double) a1/b1;
	    System.out.println(r1);
	    
	    //ATRIBUIÇÃO DE UMA VARIAVEL DOUBLE PARA INT:
	    
	    double a2;
	    int b2;
	    
	    System.out.println("===ATRIBUINDO DOUBLE EM INT===");
	    
	    a2=5.0;
	    //TRATAMENTO DE ERRO AO ATRIBUIR DOUBLE EM INT (USANDO CASTING QUE É COLOCOAR O TIPO DA VARIAVEL ANTES DA OPERAÇÃO)
	    b2= (int)a2;
	    
	    System.out.println(b2);
	    
	    
	    
	    
		
		
		
		
	}

}
