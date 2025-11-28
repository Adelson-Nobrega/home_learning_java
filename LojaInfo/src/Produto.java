public class Produto {
    private final String nome;
    private final double preco;
    private int quantidadeEmEstoque;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        if (preco > 0) {
            this.preco = preco;
        } else {
            this.preco = 0;
        }
        this.quantidadeEmEstoque = Math.max(quantidade, 0);
    }

    public void adicionarAoEstoque(int quantidade) {
        if (quantidade <= 0) {
            System.out.println("Quantidade a adicionar inválida!");
        } else {
            this.quantidadeEmEstoque += quantidade;
        }
    }

    public void removerDoEstoque(int quantidade) {
        if (quantidade <= 0 || quantidade > quantidadeEmEstoque) {
            System.out.println("Quantidade a remover inválida!");
        } else {
            this.quantidadeEmEstoque -= quantidade;
        }
    }

    public double getValorTotalEmEstoque() {
        return preco * quantidadeEmEstoque;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }
}
