public class CCOL{
	public static void main(String[] args){
		int x = 10;
		int y = 20;
		boolean resultado =  x == 15 && y++ == 20;
		
		System.out.printf("Valor de Y: ", y);

		// Numa checagem de boolean, caso seja "ou (||)" o primeiro elemento verdadeiro fará que o código
		//desconsidere o resto e pare de ler, o mesmo se aplica ao "e(&&)" no caso do elemento for falso.
	}
}