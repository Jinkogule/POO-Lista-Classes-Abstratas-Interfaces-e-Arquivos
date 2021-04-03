package lista5.questao2_e_3;

import java.util.ArrayList;

public class Q2_e_Q3_Main {
    public static void main(String[] args) {
        Bicicleta b1 = new Bicicleta("Bicicleta 1",300);
        Bicicleta b2 = new Bicicleta("Bicicleta 2",2000);

        Carro c1 = new Carro("Carro 1", 200000);
        Carro c2 = new Carro("Carro 2", 0);

        Casa casa1 = new Casa("Casa 1",3, 10,true, false);
        Escola e1 = new Escola("Escola 1",100,50,true,true);

        ArrayList<CarbonFootprint> lista = new ArrayList<>();
        lista.add(b1);
        lista.add(b2);

        lista.add(c1);
        lista.add(c2);

        lista.add(casa1);
        lista.add(e1);

        for (int i = 0; i < lista.size(); i++){
            float q_carbon = lista.get(i).getCarbonFootprint();
            String emissor = lista.get(i).getIdentificador();
            System.out.println(emissor+" emitiu "+q_carbon+" gramas de gases de efeito estufa.");
        }
    }
}

/*
Resposta questão 3 - a):
Não, pois não se pode um instanciar um objeto de uma classe se ela for abstrata.
*/
