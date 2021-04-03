package lista5.questao4;

public class TrabalhamPorHora extends Funcionarios{

    public TrabalhamPorHora(float salario_base, float salario_hora, int horas_trabalhadas) {
        this.salario_base = salario_base;
        this.salario_hora = salario_hora;
        this.horas_trabalhadas = horas_trabalhadas;
        this.salario = this.salario();
    }

    @Override
    public float salario() {
        this.salario = this.salario_base;
        if (horas_trabalhadas > 40){
            this.salario += (float) ((this.horas_trabalhadas-40)*(this.salario_hora*1.5));
        }
        return this.salario;
    }
}
