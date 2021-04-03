package lista5.questao1;

public class Circulo extends FormaGeometrica{
    private float raio;

    public Circulo(int raio){
        this.raio = raio;
    }

    @Override
    public void calcularArea() {
        this.area = (float)(3.14*(this.raio*this.raio));
    }

    @Override
    public void calcularPerimetro() {
        this.perimetro = (float)(2*3.14*this.raio);
    }
}
