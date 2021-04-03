package lista5.questao4;

public class AssalariadosComissionados extends Assalariados{

    public AssalariadosComissionados(float salario_base, int vendas) {
        super(salario_base);
        this.vendas = vendas;
        this.salario = salario();
    }

    @Override
    public float salario() {
        this.salario = (float) (1.1*this.salario_base + this.vendas*5); //salário base com 10% de aumento + 5 reais para cada venda
        return this.salario;
    }
}
