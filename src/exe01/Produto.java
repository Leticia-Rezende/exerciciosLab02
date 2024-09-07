package exe01;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    //Construtor sem parametro
    public Produto(){
        this.nome = "Notebook";
        this.preco = 2.500;
        this.quantidade = 2;
    }
    //Construtor com parametro
    public Produto (String nome, double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    //Metodos sem parametro
    public double calcularValorEstoque(){ //double: tipo a ser retornado
        System.out.println( "O valor total do estoque é : " + this.quantidade);
        return this.quantidade*preco;
    }
    //Metodo com parametro
    public int adicionarEstoque(int qtdProduto){
        this.quantidade = this.quantidade + qtdProduto;
        System.out.println("A quantidade de produto no estoque é : " + this.quantidade);
        return this.quantidade;

    }
}
