package lista5.questao2_e_3;

public class Bicicleta implements CarbonFootprint{
    private String identificador;
    private int km_percoridos;

    public Bicicleta(String identificador, int km_percoridos){
        this.identificador = identificador;
        this.km_percoridos = km_percoridos;
    }

    @Override
    public float getCarbonFootprint() {
        float q_carbon = 16; //quantidade de CO² emite na produção da bicicleta
        q_carbon += 16*km_percoridos; //pessoa andando de bicicleta emite 16g de CO² por km percorrido
        return q_carbon;
    }

    @Override
    public String getIdentificador() {
        return this.identificador;
    }
}
