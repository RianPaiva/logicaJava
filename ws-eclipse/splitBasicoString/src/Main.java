
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "potato apple lemon";
		//split divide uma string a partir de um marcador que voce declarar no caso espaço vazio
		String[] vect = s.split(" ");
		String word1 = vect[0];
		String word2 = vect[1];
		String word3 = vect[2];
		
		System.out.println(s);
		System.out.println(word1);
		System.out.println(word2);
		System.out.println(word3);
	}

}
