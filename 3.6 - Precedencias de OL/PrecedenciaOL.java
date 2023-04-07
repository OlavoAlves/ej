public class PrecedenciaOL{
	public static void main(String[] args){
		int x = 10;
		int y = 15;
		boolean resultado = (x == 11 && x == 1) || y== 15;
		//Retorna TRUE;

		System.out.printf("Resultado : ", resultado);
		// MOTIVO: OPERADORES && SÃO AVALIADOS ANTES DE OPERADORES ||;
	}
}