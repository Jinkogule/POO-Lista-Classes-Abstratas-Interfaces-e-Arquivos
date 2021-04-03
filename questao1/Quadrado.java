package lista5.questao1;

public class Quadrado extends Retangulo{
    public Quadrado(float altura) {
        super(altura);
        this.altura = altura;
    }

    @Override
    public void calcularArea() {
        this.area = this.altura*this.altura;
    }

    @Override
    public void calcularPerimetro() {
        this.perimetro = this.altura*4;
    }
}
