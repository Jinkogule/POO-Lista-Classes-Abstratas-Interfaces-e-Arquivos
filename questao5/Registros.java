package lista5.questao5;

public interface Registros {
    double totalizarReceita();

    /*sei que não é certo colocar métodos aqui que não vão ser implementados em todas as classes que implementam essa interface,
     mas coloquei para conseguir fazer o programa funcionar 100% */
    String getProduto();
    String getDescricao();
    double getPrecoUnitario();
    double getPrecoHora();
    int getHoras();
    int getQuantidade();
}
