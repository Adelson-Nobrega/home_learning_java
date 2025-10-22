public class Produto {
    private String nome;
    private double preco;
    private int quantidadeEmEstoque;

    public Produto (String nome, double preco, int quantidade) {
        this.nome = nome;
        if (preco > 0) {
            this.preco = preco;
        } else {
            this.preco = 0;
        }
        this.quantidadeEmEstoque = Math.max(quantidade, 0);
    }

    public void adicionarAoEstoque (int quantidade) {
        this.quantidadeEmEstoque = quantidade;
    }

    public boolean removerDoEstoque (int quantidade) {
        if (quantidade <= 0) {
            System.out.println("Quantidade a remover inválida!");
            return false;
        } else {
            this.quantidadeEmEstoque -= quantidade;
            return true;
        }
    }
}
