public class OperadoresComparacao{
	public static void main(String[] args){
		int pesoProdutos = 100;
		int capacidadeCaminhao = 200;

		boolean cargaExcedida = pesoProdutos > capacidadeCaminhao;
		System.out.printf("Carga foi excedida: %b %n", cargaExcedida);

		//Verificar se a carga pode ser liberada
		boolean cargaLiberada = pesoProdutos < capacidadeCaminhao;	
		System.out.printf("Carga foi liberada: %b", cargaLiberada);

		//Serve para verificar a lógica caso seja necessário falso ou verdadeiro.
	}
}