
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String original = "abcde FGHIJ ABC abc DEFG ";
		//Tudo minusculo
		String s01 = original.toLowerCase();
		//Tudo minusculo
		String s02 = original.toUpperCase();
		//retira espaços nas extremidades
		String s03 = original.trim();
		//faz uma nova string com um trecho selecionado neste caso a string nova começa a 
		//partir da posição 2
		String s04 = original.substring(2);
		//faz uma nova string agora com trecho de inicio e fim selecionados
		String s05 = original.substring(2, 9);
		//altera um caracter selecionado por outro
		String s06 = original.replace('a', 'x');
		//mesma coisa com mais caracteres 
		String s07 = original.replace("abc", "xy");
		//retorna a  primeira posicao de um ou mais caracteres 
		int i = original.indexOf("bc");
		//retorna a ultima posição de um caractere selecionado
		int j = original.lastIndexOf("bc");

		System.out.println("Original: -" + original + "-");
		System.out.println("toLowerCase: -" + s01 + "-");
		System.out.println("toUpperCase: -" + s02 + "-");
		System.out.println("trim: -" + s03 + "-");
		System.out.println("substring(2): -" + s04 + "-");
		System.out.println("substring(2, 9): -" + s05 + "-");
		System.out.println("replace('a', 'x'): -" + s06 + "-");
		System.out.println("replace('abc', 'xy'): -" + s07 + "-");
		System.out.println("Index of 'bc': " + i);
		System.out.println("Last index of 'bc': " + j);
		
	}

}
