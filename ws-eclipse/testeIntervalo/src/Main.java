import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int intervalo, num=0, in=0, out=0;
		System.out.println("Informe o tamanho do intervalo");
		intervalo =sc.nextInt();
		
		for(int i = 0; i < intervalo; i++) {
			
			num = sc.nextInt();
			if(num>=10 && num<=20) {
			in += 1;	
			}else {
				
				out += 1;
			}
			
		}
		
		System.out.println("in: " + in);
		System.out.println("out: " + out);
		
		sc.close();
	}

}
