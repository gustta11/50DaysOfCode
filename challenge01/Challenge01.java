package challenge01;

import challenge01.operacoes.Operacoes;
import java.util.Scanner;

public class Challenge01 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Operacoes lista = new Operacoes();
        int opcao;
        int numero;

        System.out.println(lista.validarLista());

        do{
            System.out.println("Escolha uma opção:");
            System.out.println("-------MENU--------");
            System.out.println("[1] Inserir um número");
            System.out.println("[2] Consultar a soma total");
            System.out.println("[3] Consultar a média");
            System.out.println("[4] Consultar o maior número");
            System.out.println("[5] Consultar o menor número");
            System.out.println("[6] Sair");
            System.out.println("---------------------");
            opcao= scan.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("Informe um número:");
                    numero = scan.nextInt();
                    lista.adicionar(numero);
                    break;
                case 2:
                    if(lista.validarLista() == 0){
                        System.out.println("Lista vazia, impossível definir a soma");
                        continue;
                    }
                    int soma = lista.soma();
                    System.out.println(soma);
                    break;
                case 3:
                    if(lista.validarLista() == 0){
                        System.out.println("Lista vazia, impossível definir a média");
                        continue;
                    }
                    double media = lista.media();
                    System.out.println(media);
                    break;
                case 4:
                    if(lista.validarLista() == 0){
                        System.out.println("Lista vazia, impossível definir o maior número");
                        continue;
                    }
                    int maiorNumero = lista.maiorNumero();
                    System.out.println(maiorNumero);
                    break;
                case 5:
                    if(lista.validarLista() == 0){
                        System.out.println("Lista vazia, impossível definir o menor número");
                        continue;
                    }
                    int menorNumero = lista.menorNumero();
                    System.out.println(menorNumero);
                    break;
                case 6:
                    System.out.println("Saindo....");
                    break;
                default:
                    System.out.println("Opção inválida");
            }

        } while (opcao != 6);

    }
}