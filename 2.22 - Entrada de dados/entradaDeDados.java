import java.util.Scanner;
public class entradaDeDados{
	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite seu nome: ");
		
		String nome= entrada.nextLine();
		// caso utilizasse int seria necessario um "nextInt" ao invés de "nextLine";
		// aplica-se para outras variaveis !;

		System.out.printf("Bom dia/noite, %s !", nome)
		
	}
}