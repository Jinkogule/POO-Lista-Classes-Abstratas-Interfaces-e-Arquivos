package lista5.questao2_e_3;

public abstract class Construcao implements CarbonFootprint{
    private String identificador;
    private int n_pessoas;
    private boolean usaEnergiaRenovavel;
    private int n_lampadas;
    private boolean usaArCondicionado;

    public Construcao(String identificador, int n_pessoas, int n_lampadas, boolean usaArCondicionado, boolean usaEnergiaRenovavel){
        this.identificador = identificador;
        this.n_pessoas = n_pessoas;
        this.n_lampadas = n_lampadas;
        this.usaArCondicionado = usaArCondicionado;
        this.usaEnergiaRenovavel = usaEnergiaRenovavel;
    }

    @Override
    public float getCarbonFootprint() { //nesse caso inventei os dados
        float q_carbon = 0;
        q_carbon += n_pessoas*2;
        if (usaEnergiaRenovavel == true){
            q_carbon += n_lampadas*3;
        }
        else{
            q_carbon += n_lampadas+6;
        }
        if (usaArCondicionado == true){
            q_carbon += 20*n_pessoas;
        }

        return q_carbon;
    }

    @Override
    public String getIdentificador() {
        return this.identificador;
    }
}
