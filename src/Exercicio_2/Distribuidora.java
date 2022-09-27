package Exercicio_2;

public class Distribuidora {

    public static void main(String[] args) {
        Produto[] listaProdutos = {
                new Pereciveis("Arroz branco",15,2),
                new Pereciveis("Carne", 30, 5),
                new Pereciveis("Pao Frances", 3.50, 1),
                new Pereciveis("Laranja", 1.25, 4),
                new Pereciveis("Pacote de leite", 10, 3),
                new NaoPereciveis("Computador", 1200, "Escritorio"),
                new NaoPereciveis("Cadeira de plastico", 120, "Praia"),
                new NaoPereciveis("Torneira", 40, "Cozinha"),
                new NaoPereciveis("Shampoo", 4.50, "Beleza"),
                new NaoPereciveis("Escova de dentes", 3, "Saude dental")
        };

        for(Produto produto: listaProdutos){
            System.out.println(produto);
            System.out.println("\tPreco de 5 unidades=" + produto.calcular(5));
            System.out.println();

        }
    }
}
