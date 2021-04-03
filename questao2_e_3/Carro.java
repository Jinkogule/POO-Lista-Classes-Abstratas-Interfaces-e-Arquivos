package lista5.questao2_e_3;

public class Carro implements CarbonFootprint{
    private String identificador;
    private float km_percoridos;

    public Carro(String identificador, float km_percorridos){
        this.identificador = identificador;
        this.km_percoridos = km_percorridos;
    }

    @Override
    public float getCarbonFootprint() {
        float q_carbon = 313; //quantidade de CO² emite na produção do carro
        q_carbon += 33*km_percoridos; //carro emite 33g de CO² por km percorrido
        return q_carbon;
    }

    @Override
    public String getIdentificador() {
        return this.identificador;
    }
}
