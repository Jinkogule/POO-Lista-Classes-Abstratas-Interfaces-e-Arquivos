package lista5.questao1;

public class Retangulo extends FormaGeometrica{
    protected float altura;
    private float largura;

    public Retangulo(float altura, float largura) {
        this.altura = altura;
        this.largura = largura;
    }

    public Retangulo(float altura) {//aux pro quadrado
    }

    @Override
    public void calcularArea() {
        this.area = this.altura*this.largura;
    }

    @Override
    public void calcularPerimetro() {
        this.perimetro = (this.altura*2)+(this.largura*2);
    }
}
