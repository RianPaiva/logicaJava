import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int opc;
		int sa = 0, sg = 0, sd = 0;

		opc = sc.nextInt();
		while (opc != 4) {
			if (opc == 1) {
				sa = sa + 1;
			} else if (opc == 2) {
				sg = sg + 1;
			} else if (opc == 3) {
				sd = sd + 1;
			}
			opc = sc.nextInt();

		}
		
		System.out.println("Obrigado");
		System.out.println("Alcool " + sa);
		System.out.println("Gasolina " + sg);
		System.out.println("Diesel " + sd);

		sc.close();
	}

}
