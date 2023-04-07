public class Principal {
    public static void main(String[] args){
        Carro meuCarro;
        // construção de objeto
        meuCarro = new Carro();
        // construindo outro carro de maneira direta
        Carro seuCarro = new Carro();

        //definindo valores
        meuCarro.anoFabricacao = 2020;
        meuCarro.cor = vermelho;
        meuCarro.fabricante = Volkswagen;
        meuCarro.modelo = Jetta;

        //printando
        System.out.println("Fabricante: %s%n, meuCarro.fabricante");
        System.out.println("Modelo: %s%n, meuCarro.modelo");
        System.out.println("Ano de Fabricacao: %s%n, meuCarro.anoFabricacao");
        System.out.println("Cor: %s%n, meuCarro.cor");
    }
}
