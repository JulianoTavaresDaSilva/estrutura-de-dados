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

        vetor.inserir(2, 99);
        vetor.imprimir();

        System.out.println("Elemento no índice 2: " + vetor.ler(2));

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

        vetor.inserirOrdenado(50);
        vetor.inserirOrdenado(10);
        vetor.inserirOrdenado(30);
        vetor.inserirOrdenado(10);
        vetor.imprimir();

        System.out.println("Tamanho atual: " + vetor.obterTamanho());

        System.out.println("Busca linear pelo 30: índice " + vetor.buscaLinear(30));
        System.out.println("Busca binária pelo 30: índice " + vetor.buscarBinaria(30));

        Vetor<Integer> vetorAleatorio = new Vetor<>(5);
        vetorAleatorio.inserirAleatorio(10, 50);
        vetorAleatorio.imprimir();

        Vetor<Integer> vetorDesordenado = new Vetor<>(5);
        vetorDesordenado.inserir(40);
        vetorDesordenado.inserir(10);
        vetorDesordenado.inserir(30);
        vetorDesordenado.inserir(20);
        vetorDesordenado.inserir(50);
        vetorDesordenado.imprimir();

        vetorDesordenado.ordenar();
        vetorDesordenado.imprimir();
    }
}
