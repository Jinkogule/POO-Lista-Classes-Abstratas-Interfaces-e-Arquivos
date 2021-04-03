package lista5.questao4;

public class Comissionados extends Funcionarios{


    public Comissionados(int vendas) {
        this.vendas = vendas;
        this.salario = this.salario();
    }

    @Override
    public float salario() {
        this.salario = this.vendas*5; //5 reais para cada venda
        return this.salario;
    }
}
