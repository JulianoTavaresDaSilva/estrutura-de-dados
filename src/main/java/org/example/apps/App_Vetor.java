package org.example.apps;

import org.example.vetores.Vetor;

public class App_Vetor {
    static void main() {


        Vetor<Integer> vetor = new Vetor<>(2);


        vetor.imprimir();

        vetor.inserir(10);
        vetor.inserir(20);
        vetor.imprimir();

        vetor.inserir(30);
        vetor.imprimir();

        vetor.inserir(40);
        vetor.imprimir();

        vetor.inserir(50);
        vetor.imprimir();

        vetor.remover(0);
        vetor.imprimir();

        vetor.remover(1);
        vetor.imprimir();

        vetor.remover(2);
        vetor.imprimir();

        vetor.remover(1);
        vetor.imprimir();

        vetor.remover(0);
        vetor.imprimir();
    }
}
