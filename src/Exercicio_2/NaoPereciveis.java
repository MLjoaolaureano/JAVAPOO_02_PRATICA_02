package Exercicio_2;

public class NaoPereciveis extends Produto {

    String tipo;

    public NaoPereciveis(String nome, double preco, String tipo) {
        super(nome, preco);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "\tProduto nao-perecivel" +
                "\n\tnome='" + nome + '\'' +
               "\n\ttipo='" + tipo + '\'' +
                "\n\tpreco=" + preco;
    }
}
