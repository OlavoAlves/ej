public class ConversaoLongParaInt {
	public static void main(String[] args){
		//long x = 10;
		//int y = x;
		//Isso não daria certo, pois a variável long contém mais espaço que a int.
		
		long x = 10;
		int y = (int) x; //CASTING.
		System.out.println(x);
		System.out.println(y);

		//caso o valor de long for maior que a capacidade de int, o valor de 
		// int será != o de long.

		//Ao contrário

		//int y = 10000;
		//long x = y;
		//CASTING automático pois int < long.

	}
}