package lista5.questao4;

public class Q4_Main {
    public static void main(String[] args) {
        TrabalhamPorHora joao = new TrabalhamPorHora(150,2,43);
        Assalariados lucas = new Assalariados(100);
        Comissionados conan = new Comissionados(35);
        AssalariadosComissionados marco = new AssalariadosComissionados(200,35);

        System.out.println(joao.getSalario());
        System.out.println(lucas.getSalario());
        System.out.println(conan.getSalario());
        System.out.println(marco.getSalario());
    }
}
