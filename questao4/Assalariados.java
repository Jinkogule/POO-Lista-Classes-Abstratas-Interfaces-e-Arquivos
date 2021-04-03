package lista5.questao4;

public class Assalariados extends Funcionarios{

    public Assalariados(float salario_base) {
        this.salario_base = salario_base;
        this.salario = this.salario();
    }

    @Override
    public float salario() {
        this.salario = this.salario_base;
        return this.salario;
    }
}
