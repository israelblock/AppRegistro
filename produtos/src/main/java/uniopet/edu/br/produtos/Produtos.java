package uniopet.edu.br.produtos;

public class Produtos {

    private String nome;
    private String categoria;
    private int quantidade;
    private double valor_unitario;
    private double valor_total;

    public Produtos(){}

    public Produtos(String nome, String categoria, int quantidade, double valor_unitario, double valor_total){
        this.setNome(nome);
        this.setCategoria(categoria);
        this.setQuantidade(quantidade);
        this.setValor_unitario(valor_unitario);
        this.setValor_total(valor_total);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValor_unitario() {
        return valor_unitario;
    }

    public void setValor_unitario(double valor_unitario) {
        this.valor_unitario = valor_unitario;
    }

    public double getValor_total() {
        return valor_total;
    }

    public void setValor_total(double valor_total) {
        this.valor_total = valor_total;
    }
}
