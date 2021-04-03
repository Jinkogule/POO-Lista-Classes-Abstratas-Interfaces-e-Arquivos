package lista5.questao1;

public class Q1_Main {
    public static void main(String[] args) {
        System.out.println("\nCirculo:");
        Circulo c1 = new Circulo(6);
        c1.calcularArea();
        System.out.println("Área: "+c1.getArea());
        c1.calcularPerimetro();
        System.out.println("Perímetro: "+c1.getPerimetro());

        System.out.println("\nRetângulo:");
        Retangulo r1 = new Retangulo(2, 5);
        r1.calcularArea();
        System.out.println("Área: "+r1.getArea());
        r1.calcularPerimetro();
        System.out.println("Perímetro: "+r1.getPerimetro());

        System.out.println("\nQuadrado:");
        Quadrado q1 = new Quadrado(5);
        q1.calcularArea();
        System.out.println("Área: "+q1.getArea());
        q1.calcularPerimetro();
        System.out.println("Perímetro: "+q1.getPerimetro());

        System.out.println("\nTriângulo:");
        Triangulo t1 = new Triangulo(6,7,6);
        t1.calcularArea();
        System.out.println("Área: "+t1.getArea());
        t1.calcularPerimetro();
        System.out.println("Perímetro: "+t1.getPerimetro());
    }
}
