package map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Long, Produto> estoqueProdutos;

    public EstoqueProdutos(){
        this.estoqueProdutos = new HashMap<>();

    }


    public void adicionarProduto( Long cod, String nome, double preco, int quantidade){
        estoqueProdutos.put(cod, new Produto(nome, preco, quantidade));
    }


    public void exibirProdutos(){
        System.out.println(estoqueProdutos);
    }

    public double calcularValorTotalEstoque(){
        double valorTotalEstoque = 0d;
        if (!estoqueProdutos.isEmpty()){
            for (Produto p : estoqueProdutos.values()){
                valorTotalEstoque = p.getQuantidade() * p.getPreco();
            }
        }

        return valorTotalEstoque;
    }


    public Produto obterProdutoMaisCaro(){
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if (!estoqueProdutos.isEmpty()){
            for (Produto p : estoqueProdutos.values()){
                if (p.getPreco() > maiorPreco){
                    produtoMaisCaro = p;
                }
            }
        }
        return produtoMaisCaro;
    }


    public static void main(String[] args) {
        EstoqueProdutos estoque = new EstoqueProdutos();
        estoque.exibirProdutos();

        estoque.adicionarProduto(1L,"Produto A",5.0,10);
        estoque.adicionarProduto(3L,"Produto B",10.0,5);
        estoque.adicionarProduto(4L,"Produto C",15.0,2);

        estoque.exibirProdutos();

        System.out.println("Valor total do estoque: R$ " + estoque.calcularValorTotalEstoque());
        System.out.println("Produto mais caro: " + estoque.obterProdutoMaisCaro());
    }

}
