public class formatandoComPrintf{
	public static void main(String[] args){
	String nome = "Olavo";
	int quantidade = 48;
	
	System.out.printf("Olá, %s", nome);  // PrintLN -> LINHA 
					//PrintF -> SEM QUEBRA DE LINHA
	System.out.printf("Quantidade: %d itens", quantidade);
	String peso = "70Kg";
	System.out.printf("Peso: %s", peso);
	// Para formatar a quantidade de caracteres -> %.numero.
	}
}