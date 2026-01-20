package challenge01;

import java.util.ArrayList;
import java.util.Scanner;

public class Challenge01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int opcao;
        int numero;
        ArrayList<Integer> lista = new ArrayList<Integer>();

        do{
            System.out.println("Escolha uma opção:");
            System.out.println("-------MENU--------");
            System.out.println("[1] Inserir um número");
            System.out.println("[2] Sair");
            System.out.println("---------------------");
            opcao= scan.nextInt();

            if(opcao == 1){
                System.out.println("Informe um número");
                numero = scan.nextInt();
                lista.add(numero);
            }
        } while (opcao != 2);
    }
}
