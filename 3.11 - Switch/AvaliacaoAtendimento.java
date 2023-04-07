import java.util.Scanner;

public class AvaliacaoAtendimento{
	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Avalie nosso atendimento( 1 ate 5): ");
		int nota = entrada.nextInt();
		String descricaoNota;

		//Switch usado para tomar decisão baseado em uma variável.
		// Substituto de if e else if.
		switch (nota) {
			case 1: 
				descricaoNota = "Muito ruim";
				break;
			case 2: 
				descricaoNota = "Ruim";
				break;
			case 3: 
				descricaoNota = "Mediana";
				break;
			case 4: 
				descricaoNota = "Bom";
				break;
			case 5:
				descricaoNota = "Otima";
				break;
			default:
				descricaoNota = "Opcao invalida";
				break;
		}
		System.out.printf("Nota: %s", descricaoNota);
	}
}