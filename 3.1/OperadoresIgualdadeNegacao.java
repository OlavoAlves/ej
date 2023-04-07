public class OperadoresIgualdadeNegacao{

	public static void main(String[] args){
		// boolean numerosIguais = 10 == 10;
		boolean numerosIguais = 4 + 6 == 5*2;

		// negação de boolean:
		boolean numerosDiferentes = !numerosIguais;
		System.out.printf("Numeros iguais: %b", numerosIguais);
	}
}