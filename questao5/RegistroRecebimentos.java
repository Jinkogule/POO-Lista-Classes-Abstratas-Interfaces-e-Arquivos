package lista5.questao5;

import java.util.ArrayList;
import java.util.Scanner;

public class RegistroRecebimentos{
    private static ArrayList<Registros> Recebivel = new ArrayList();

    public static void main(String[] args) {
        usuarioRegistra();
    }

    public static void usuarioRegistra(){
        Scanner input = new Scanner(System.in);
        System.out.print("Registrar novo recebimento?(S/N): ");
        String verifRegistra = input.next();

        if (verifRegistra.equals("S") || verifRegistra.equals("s")) {
            System.out.print("Item ou serviço?(I/S): ");
            String verifTipo = input.next();
            if (verifTipo.equals("I") || verifTipo.equals("i")){
                usuarioRegistraItemVenda();
                System.out.println("*--Registrado novo item--*\n");
                usuarioRegistra();
            }
            else if (verifTipo.equals("S") || verifTipo.equals("s")){
                usuarioRegistraServico();
                System.out.println("*--Registrado novo serviço--*\n");
                usuarioRegistra();
            }
            else{
                System.out.println("entrada inválida");
                usuarioRegistra();
            }
        }
        else if(verifRegistra.equals("N") || verifRegistra.equals("n")){
            if (Recebivel.isEmpty()){
            System.out.println("Nenhum recebimento foi registrado.");
            }
            else{
                System.out.println("Foram registrados "+Recebivel.stream().count()+" recebimentos no total.\n");
                System.out.print("Imprimir registros?(S/N): ");
                String verifImprime = input.next();
                System.out.println();
                if (verifImprime.equals("S") || verifImprime.equals("s")){
                    imprimeRegistros();
                }
            }
        }
        else{
            System.out.println("Entrada inválida");
            usuarioRegistra();
        }
    }
    public static void usuarioRegistraItemVenda(){
        System.out.println("\nNOVO ITEM:");
        Scanner input = new Scanner(System.in);

        System.out.print("Produto: ");
        String prod = input.nextLine();

        System.out.print("Quantidade: ");
        int quan = input.nextInt();

        System.out.print("Preço da unidade: ");
        double precUni = input.nextDouble();
        Recebivel.add(new ItemVenda(prod,quan,precUni));
    }

    public static void usuarioRegistraServico() {
        System.out.println("\nNOVO SERVIÇO:");
        Scanner input = new Scanner(System.in);

        System.out.print("Descrição: ");
        String descri = input.nextLine();

        System.out.print("Horas: ");
        int hor = input.nextInt();

        System.out.print("Preço por hora: ");
        double precHor = input.nextDouble();
        Recebivel.add(new Servico(descri,hor,precHor));
    }

    public static void imprimeRegistros(){
        System.out.println("RECEBIMENTOS REGISTRADOS:\n");
        for (int i=0; i<Recebivel.size(); i++){
            if (Recebivel.get(i).getDescricao() != null){
                System.out.println("SERVIÇO:\nDescrição: "+Recebivel.get(i).getDescricao());
            }
            if (Recebivel.get(i).getHoras() != 0){
                System.out.println("Horas: "+Recebivel.get(i).getHoras());
            }
            if (Recebivel.get(i).getPrecoHora() != 0){
                System.out.println("Preço por hora: "+Recebivel.get(i).getPrecoHora());
                System.out.println("Receita total: "+Recebivel.get(i).totalizarReceita());
            }
            if (Recebivel.get(i).getProduto() != null){
                System.out.println("ITEM:\nProduto: "+Recebivel.get(i).getProduto());
            }
            if (Recebivel.get(i).getQuantidade() != 0){
                System.out.println("Quantidade: "+Recebivel.get(i).getQuantidade());
            }
            if (Recebivel.get(i).getPrecoUnitario() != 0){
                System.out.println("Preço da unidade: "+Recebivel.get(i).getPrecoUnitario());
                System.out.println("Receita total: "+Recebivel.get(i).totalizarReceita());
            }
            System.out.println();
        }
    }
}
