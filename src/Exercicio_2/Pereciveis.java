package Exercicio_2;

public class Pereciveis extends Produto{
    int diasParaVencer;

    public Pereciveis(String nome, double preco,int diasParaVencer) {
        super(nome, preco);
        this.diasParaVencer = diasParaVencer;
    }

    public int getDiasParaVencer() {
        return diasParaVencer;
    }

    public void setDiasParaVencer(int diasParaVencer) {
        this.diasParaVencer = diasParaVencer;
    }

    @Override
    public String toString() {
        return  "\tProduto perecivel" +
                "\n\tnome='" + nome + '\'' +
                "\n\tdiasParaVencer=" + diasParaVencer +
                "\n\tpreco=" + preco;
    }

    public double calcular(int quantidadeDeProdutos){
        double precoFinal = this.preco * quantidadeDeProdutos;
        int divisao = 1;
        switch (diasParaVencer){
            case 1:
                divisao = 4;
                break;
            case 2:
                divisao = 3;
                break;
            case 3:
                divisao = 2;
                break;
        }
        return precoFinal / divisao;
    }
}
