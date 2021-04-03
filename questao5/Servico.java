package lista5.questao5;

public class Servico implements Registros{
    private String descricao;
    private int horas;
    private double precoHora;

    public Servico(String descricao, int horas, double precoHora){
        this.descricao = descricao;
        this.horas = horas;
        this.precoHora = precoHora;
    }

    @Override
    public double totalizarReceita() {
        return horas*precoHora;
    }

    @Override
    public String getDescricao() {
        return descricao;
    }

    @Override
    public double getPrecoHora() {
        return precoHora;
    }

    @Override
    public int getHoras() {
        return horas;
    }

    @Override
    public double getPrecoUnitario() {
        return 0;
    }

    @Override
    public String getProduto() {
        return null;
    }

    @Override
    public int getQuantidade() {
        return 0;
    }
}
