package org.example.apps;

import org.example.vetores.VetorDinamico;

public class App_VetDinamico {
    static void main() {

        VetorDinamico vetor = new VetorDinamico(2);

        vetor.inserir("A");
        vetor.inserir("B");
        vetor.imprimir();


        vetor.inserir("C");
        vetor.imprimir();

        vetor.inserir("D");
        vetor.inserir("E");
        vetor.inserir("F");
        vetor.inserir("G");
        vetor.imprimir();

        vetor.remover(0);
        vetor.remover(0);
        vetor.remover(0);
        vetor.remover(0);
        vetor.remover(0);
        vetor.imprimir();
    }
}
