import java.util.Scanner;

public class EstruturaFor{

	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Quantidade de passageiros: ");
		int totalPassageiros = entrada.nextInt();

		for(int passageirosAtual = 0; passageirosAtual <= totalPassageiros; passageirosAtual++){
			System.out.println("passageirosAtual");
		}

		Scanner entrada2 = new Scanner(System.in);

		System.out.println("Capacidade maxima: ");
		int capacidadeMax = entrada2.nextInt();

		if(passageirosAtual < capacidadeMax){
			System.out.println("Capacidade maxima nao atingida");
		} else {
			if(passageirosAtual = capacidadeMax){
				System.out.println("Capacidade maxima atingida");
			} else {
				System.out.println("Capacidade maxima excedida");
			}
		}
	}
}