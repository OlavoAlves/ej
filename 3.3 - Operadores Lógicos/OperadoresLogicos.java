import java.util.Scanner;

public class OperadoresLogicos{
	public static void main(String[] args){
		Scanner entrada = new Scanner (System.in);
		System.out.printf("Digite seu Cortisol: ");
		double cortisol = entrada.nextDouble();

		boolean cortisolNormal = cortisol >= 6.0 && cortisol <= 18.4;
		boolean cortisolAlto = cortisol > 18.4;
		boolean cortisolBaixo = cortisol < 6.0;
		
		System.out.printf("Cortisol baixo: %b %n", cortisolBaixo);
		System.out.printf("Cortisol Normal: %b %n", cortisolNormal);
		System.out.printf("Cortisol Alto: %b %n", cortisolAlto);

		// EXTRA: && = "E" || = "OU"
	}
}