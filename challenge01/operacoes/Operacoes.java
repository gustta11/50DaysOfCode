package challenge01.operacoes;


import java.util.ArrayList;
import java.util.Collections;

public class Operacoes {
    private ArrayList<Integer> lista = new ArrayList<Integer>();

    public void adicionar(int numero){
        lista.add(numero);
    }

    public int soma(){
        int resultado = 0;
        for(int numero:lista){
            resultado += numero;
        }
        return resultado;
    }

    public double media(){
        int media;
        int resultado = 0;
        for(int numero:lista){
            resultado += numero;
        }
        return media = resultado/lista.size();
    }

    public int maiorNumero(){
        return Collections.max(lista);
    }

    public int menorNumero(){
        return Collections.min(lista);
    }

    public int validarLista(){
        return lista.size();
    }


}
