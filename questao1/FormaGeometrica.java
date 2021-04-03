package lista5.questao1;

public abstract class FormaGeometrica {
    protected float area;
    protected float perimetro;

    public float getPerimetro() {
        return this.perimetro;
    }

    public float getArea() {
        return this.area;
    }

    public abstract void calcularArea();
    public abstract void calcularPerimetro();
}
