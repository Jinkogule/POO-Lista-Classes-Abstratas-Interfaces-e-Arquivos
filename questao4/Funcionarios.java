package lista5.questao4;

public abstract class Funcionarios {
    protected float salario;
    protected float salario_hora;
    protected float salario_base;
    protected float horas_trabalhadas;
    protected int vendas;

    public abstract float salario();

    public float getSalario() {
        return salario;
    }
}
