package org.example.apps;


import org.example.vetores.VetorEstatico;

public class App_VetEstatico {
    static void main() {

        VetorEstatico vetor = new VetorEstatico(10);

        vetor.inserir("A");
        vetor.inserir("B");
        vetor.inserir("C");
        vetor.inserir("D");
        vetor.inserir("E");
        vetor.inserir("F");

        vetor.inserir(2,"J");
        vetor.inserir("J");
        vetor.inserir("J");
        vetor.inserir("J");

        vetor.imprimir();
        vetor.obterTamanho();

        System.out.println("//-------------------Removendo por Indice------------------//");

        vetor.remover(2);

        vetor.imprimir();
        vetor.obterTamanho();

        System.out.println("//-------------------Removendo por Elemento------------------//");

        vetor.removerElemento("J");

        vetor.imprimir();
        vetor.obterTamanho();

        System.out.println("//-----------------Removendo Ultimo------------------//");

        vetor.removerFinal();

        vetor.imprimir();
        vetor.obterTamanho();
    }
}
