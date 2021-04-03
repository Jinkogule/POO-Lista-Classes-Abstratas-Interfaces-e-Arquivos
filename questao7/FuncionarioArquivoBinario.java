package lista5.questao7;

import java.io.*;
import java.util.Scanner;

public class FuncionarioArquivoBinario {
    public static void leArquivoBinario(String path) throws IOException {
        String nome;
        int n_reg;
        int n_depart;
        int n_depart_ger;

        FileInputStream arq = new FileInputStream(path);
        DataInputStream lerArq = new DataInputStream(arq);

        nome = lerArq.readUTF();
        n_reg = lerArq.readInt();
        n_depart = lerArq.readInt();
        n_depart_ger = lerArq.readInt();

        System.out.println("\n|||--Funcionário--|||");
        System.out.printf("Nome: "+nome+"\n");
        System.out.printf("Número de registro: "+n_reg+"\n");
        System.out.printf("Número do departamento: "+n_depart+"\n");
        System.out.printf("Número do departamento gerenciado: "+n_depart_ger+"\n");

        arq.close();
    }

    public static void criaArquivoBinario(String nome_do_arquivo) throws IOException {
        Scanner input = new Scanner(System.in);

        FileOutputStream arq = new FileOutputStream("C:\\Users\\lucas\\Documents\\ArquivosTeste\\"+nome_do_arquivo+".dat");
        DataOutputStream gravarArq = new DataOutputStream(arq);

        System.out.println("|||--Funcionário--|||");
        System.out.printf("Nome: ");
        String nome = input.nextLine();
        gravarArq.writeUTF(nome);

        System.out.printf("Número de registro: ");
        int n_reg = input.nextInt();
        gravarArq.writeInt(n_reg);

        System.out.printf("Número do departamento: ");
        int n_depart = input.nextInt();
        gravarArq.writeInt(n_depart);

        System.out.printf("Número do departamento gerenciado: ");
        int n_depart_ger = input.nextInt();
        gravarArq.writeInt(n_depart_ger);

        arq.close();
    }
}