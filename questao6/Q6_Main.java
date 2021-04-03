package lista5.questao6;

import java.io.IOException;

public class Q6_Main {
    public static void main(String[] args) throws IOException {
        RepresentaArquivo.representaArquivo("arquivoteste");
        LeAdicionaDados.leArquivo("C:\\Users\\lucas\\Documents\\ArquivosTeste\\arquivoteste.txt");
        LeAdicionaDados.novaEntrada("C:\\Users\\lucas\\Documents\\ArquivosTeste\\arquivoteste.txt");
        LeAdicionaDados.leArquivo("C:\\Users\\lucas\\Documents\\ArquivosTeste\\arquivoteste.txt");
    }
}

