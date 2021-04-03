package lista5.questao5;

public class ItemVenda implements Registros{
    private String produto;
    protected int  quantidade;
    private double precoUnitario;

    public ItemVenda(String produto, int quantidade, double precoUnitario){
        this.produto = produto;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
    }

    @Override
    public double getPrecoUnitario() {
        return precoUnitario;
    }

    @Override
    public String getProduto() {
        return produto;
    }

    @Override
    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public double totalizarReceita() {
        return quantidade*precoUnitario;
    }


    @Override
    public double getPrecoHora() {
        return 0;
    }

    @Override
    public int getHoras() {
        return 0;
    }

    @Override
    public String getDescricao() {
        return null;
    }
}
