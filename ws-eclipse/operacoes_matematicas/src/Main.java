
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//declarando vari�veis
		double x = 3.0;
		double y = 4.0;
		double z = -5.0;
		double A, B, C;
		//comando Math.sqrt(x) faz a raiz quadrada de x
		A = Math.sqrt(x);
		B = Math.sqrt(y);
		C = Math.sqrt(25.0);
		System.out.println("Raiz quadrada de " + x + " = " + A);
		System.out.println("Raiz quadrada de " + y + " = " + B);
		System.out.println("Raiz quadrada de 25 = " + C);
		
		//comando Math.pow(x,y) faz x elevado a y
		A = Math.pow(x, y);
		B = Math.pow(x, 2.0);
		C = Math.pow(5.0, 2.0);
		System.out.println(x + " elevado a " + y + " = " + A);
		System.out.println(x + " elevado ao quadrado = " + B);
		System.out.println("5 elevado ao quadrado = " + C);
		
		//comando Math.abs(y) retorna o valor absoluto de y(retorna positivo)
		A = Math.abs(y);
		B = Math.abs(z);
		System.out.println("Valor absoluto de " + y + " = " + A);
		System.out.println("Valor absoluto de " + z + " = " + B);
		
		//java.lang.Math -> informa��es sobre opera��es em java
		
		
	}

}
