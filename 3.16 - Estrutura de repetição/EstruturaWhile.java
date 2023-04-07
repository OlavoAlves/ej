import java.util.Scanner;

public class EstruturaWhile{
	public static void main (String[] args){
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o numero de voltas: ");
		int voltas = entrada.nextInt();
		int incremento = 1;

		while(voltas >= incremento){
			incremento++;
			System.out.printf("%n Voltando");
		}
		// Diferença do While para do While:

		//	executa o código 
		//		e depois verifica se
		//			a condição para continuar
		//				o codigo esta correta
	}
}