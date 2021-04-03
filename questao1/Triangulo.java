package lista5.questao1;
import java.lang.Math;
public class Triangulo extends FormaGeometrica{
    private float lado1;
    private float lado2;
    private float lado3;
    protected float altura;
    protected float base;

    public Triangulo(float lado1, float lado2, float lado3){
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    @Override
    public void calcularArea() {
        if (this.lado1 == this.lado2 && this.lado2 == this.lado3){//equilatero
            this.base = lado1;
            this.altura = (float) ((this.lado1/2)*1.732);
        }
        else if (this.lado1 == this.lado2 && this.lado1 != this.lado3){//isosceles
            this.base = this.lado3;
            this.altura = (float) Math.sqrt(this.lado1*this.lado1 - this.lado3/2);
        }
        else if (this.lado1 == this.lado3 && this.lado1 != this.lado2){//isosceles
            this.base = this.lado2;
            this.altura = (float) Math.sqrt(this.lado1*this.lado1 - this.lado2/2);
        }
        else if (this.lado2 == this.lado3 && this.lado2 != this.lado1){//isosceles
            this.base = this.lado1;
            this.altura = (float) Math.sqrt(this.lado2*this.lado2 - this.lado1/2);
        }
        else{//escaleno
            //não implementei escaleno
            //tambpem não implementei verificação se os valores do triângulo são possíveis
        }
        this.area = (this.base*this.altura)/2;
    }

    @Override
    public void calcularPerimetro() {
        this.perimetro = this.lado1+this.lado2+this.lado3;
    }
}
