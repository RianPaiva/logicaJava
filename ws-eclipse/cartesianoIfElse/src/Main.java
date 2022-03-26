import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		double x, y;
		System.out.println("Informe as coordenadas");
		x=sc.nextDouble();
		y=sc.nextDouble();
		
		if(x == 0 && y==0) {
			
			System.out.println("Localização: origem");
			
		}else {
			
			if(x == 0 ) {
				
				System.out.println("Sobre o eixo X");
				
			}else {
				
				if(y==0) {
				
					System.out.println("Sobre o eixo Y");
					
					
				}else {
					
					if(x> 0 && y > 0) {
						
						System.out.println("Quadrante Q1");
						
					}else {
						
						if(x<0 && y > 0) {
							
							System.out.println("Quadrante Q2");
							
						}else {
							
							if(x < 0 && y < 0) {
								
								System.out.println("Quadrante Q3");
							
								
							}else {
								
								System.out.println("Quadrante Q4");
								 	
							}
							
							
						}			
						
						
					}
					
				}
				
			}
			
			
		}
		
		
		
		sc.close();
	}

}
