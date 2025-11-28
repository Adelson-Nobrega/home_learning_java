void main() {

    Produto produto1 = new Produto("Notebook", 2850.50, 12);
    Produto produto2 = new Produto("Mouse", 127.80, 28);

    produto1.adicionarAoEstoque(3);
    produto2.adicionarAoEstoque(9);

    produto1.removerDoEstoque(20);
    produto1.removerDoEstoque(4);
    produto2.removerDoEstoque(7);

    System.out.println("Produto " + produto1.getNome());
    System.out.println("Valor total em estoque: R$ " + produto1.getValorTotalEmEstoque() + "\n");
    System.out.println("Produto " + produto2.getNome());
    System.out.println("Valor total em estoque: R$ " + produto2.getValorTotalEmEstoque() + "\n");
}
