package org.example.lab02;

import org.example.vetores.Vetor;

public class App {
    static void main() {

        Vetor<Integer> vetor1k = new Vetor<>(1000);
        Vetor<Integer> vetor10k = new Vetor<>(10000);
        Vetor<Integer> vetor100k = new Vetor<>(100000);

        vetor1k.inserirAleatorio(1000, 1000);
        vetor10k.inserirAleatorio(10000, 10000);
        vetor100k.inserirAleatorio(100000, 100000);

        // ==== VETOR 1K ====
        System.out.println("==== VETOR 1K ====");

        int inicioVetor1k = vetor1k.ler(0);
        int meioVetor1k   = vetor1k.ler(vetor1k.obterTamanho() / 2);
        int fimVetor1k    = vetor1k.ler(vetor1k.obterTamanho() - 1);

        // Linear 1k
        long inicio_posInicio1k = System.nanoTime();
        int posInicio1k = buscaLinear(vetor1k, inicioVetor1k);
        long fim_posInicio1k = System.nanoTime();
        long duracaoMs_posInicio1k = (fim_posInicio1k - inicio_posInicio1k) / 1000;
        System.out.println("Tempo Linear Inicio 1k: " + duracaoMs_posInicio1k + " us");

        long inicio_posMeio1k = System.nanoTime();
        int posMeio1k = buscaLinear(vetor1k, meioVetor1k);
        long fim_posMeio1k = System.nanoTime();
        long duracaoMs_posMeio1k = (fim_posMeio1k - inicio_posMeio1k) / 1000;
        System.out.println("Tempo Linear Meio 1k: " + duracaoMs_posMeio1k + " us");

        long inicio_posFim1k = System.nanoTime();
        int posFim1k = buscaLinear(vetor1k, fimVetor1k);
        long fim_posFim1k = System.nanoTime();
        long duracaoMs_posFim1k = (fim_posFim1k - inicio_posFim1k) / 1000;
        System.out.println("Tempo Linear Fim 1k: " + duracaoMs_posFim1k + " us");

        // Binária 1k
        long inicio_posInicio1kBi = System.nanoTime();
        int posInicio1kBi = buscaBinaria(vetor1k, inicioVetor1k);
        long fim_posInicio1kBi = System.nanoTime();
        long duracaoMs_posInicio1kBi = (fim_posInicio1kBi - inicio_posInicio1kBi) / 1000;
        System.out.println("Tempo Binaria Inicio 1k: " + duracaoMs_posInicio1kBi + " us");

        long inicio_posMeio1kBi = System.nanoTime();
        int posMeio1kBi = buscaBinaria(vetor1k, meioVetor1k);
        long fim_posMeio1kBi = System.nanoTime();
        long duracaoMs_posMeio1kBi = (fim_posMeio1kBi - inicio_posMeio1kBi) / 1000;
        System.out.println("Tempo Binaria Meio 1k: " + duracaoMs_posMeio1kBi + " us");

        long inicio_posFim1kBi = System.nanoTime();
        int posFim1kBi = buscaBinaria(vetor1k, fimVetor1k);
        long fim_posFim1kBi = System.nanoTime();
        long duracaoMs_posFim1kBi = (fim_posFim1kBi - inicio_posFim1kBi) / 1000;
        System.out.println("Tempo Binaria Fim 1k: " + duracaoMs_posFim1kBi + " us");


        // ==== VETOR 10K ====
        System.out.println();
        System.out.println("==== VETOR 10K ====");

        int inicioVetor10k = vetor10k.ler(0);
        int meioVetor10k   = vetor10k.ler(vetor10k.obterTamanho() / 2);
        int fimVetor10k    = vetor10k.ler(vetor10k.obterTamanho() - 1);

        // Linear 10k
        long inicio_posInicio10k = System.nanoTime();
        int posInicio10k = buscaLinear(vetor10k, inicioVetor10k);
        long fim_posInicio10k = System.nanoTime();
        long duracaoMs_posInicio10k = (fim_posInicio10k - inicio_posInicio10k) / 1000;
        System.out.println("Tempo Linear Inicio 10k: " + duracaoMs_posInicio10k + " us");

        long inicio_posMeio10k = System.nanoTime();
        int posMeio10k = buscaLinear(vetor10k, meioVetor10k);
        long fim_posMeio10k = System.nanoTime();
        long duracaoMs_posMeio10k = (fim_posMeio10k - inicio_posMeio10k) / 1000;
        System.out.println("Tempo Linear Meio 10k: " + duracaoMs_posMeio10k + " us");

        long inicio_posFim10k = System.nanoTime();
        int posFim10k = buscaLinear(vetor10k, fimVetor10k);
        long fim_posFim10k = System.nanoTime();
        long duracaoMs_posFim10k = (fim_posFim10k - inicio_posFim10k) / 1000;
        System.out.println("Tempo Linear Fim 10k: " + duracaoMs_posFim10k + " us");

        // Binária 10k
        long inicio_posInicio10kBi = System.nanoTime();
        int posInicio10kBi = buscaBinaria(vetor10k, inicioVetor10k);
        long fim_posInicio10kBi = System.nanoTime();
        long duracaoMs_posInicio10kBi = (fim_posInicio10kBi - inicio_posInicio10kBi) / 1000;
        System.out.println("Tempo Binaria Inicio 10k: " + duracaoMs_posInicio10kBi + " us");

        long inicio_posMeio10kBi = System.nanoTime();
        int posMeio10kBi = buscaBinaria(vetor10k, meioVetor10k);
        long fim_posMeio10kBi = System.nanoTime();
        long duracaoMs_posMeio10kBi = (fim_posMeio10kBi - inicio_posMeio10kBi) / 1000;
        System.out.println("Tempo Binaria Meio 10k: " + duracaoMs_posMeio10kBi + " us");

        long inicio_posFim10kBi = System.nanoTime();
        int posFim10kBi = buscaBinaria(vetor10k, fimVetor10k);
        long fim_posFim10kBi = System.nanoTime();
        long duracaoMs_posFim10kBi = (fim_posFim10kBi - inicio_posFim10kBi) / 1000;
        System.out.println("Tempo Binaria Fim 10k: " + duracaoMs_posFim10kBi + " us");


        // ==== VETOR 100K ====
        System.out.println();
        System.out.println("==== VETOR 100K ====");

        int inicioVetor100k = vetor100k.ler(0);
        int meioVetor100k   = vetor100k.ler(vetor100k.obterTamanho() / 2);
        int fimVetor100k    = vetor100k.ler(vetor100k.obterTamanho() - 1);

        // Linear 100k
        long inicio_posInicio100k = System.nanoTime();
        int posInicio100k = buscaLinear(vetor100k, inicioVetor100k);
        long fim_posInicio100k = System.nanoTime();
        long duracaoMs_posInicio100k = (fim_posInicio100k - inicio_posInicio100k) / 1000;
        System.out.println("Tempo Linear Inicio 100k: " + duracaoMs_posInicio100k + " us");

        long inicio_posMeio100k = System.nanoTime();
        int posMeio100k = buscaLinear(vetor100k, meioVetor100k);
        long fim_posMeio100k = System.nanoTime();
        long duracaoMs_posMeio100k = (fim_posMeio100k - inicio_posMeio100k) / 1000;
        System.out.println("Tempo Linear Meio 100k: " + duracaoMs_posMeio100k + " us");

        long inicio_posFim100k = System.nanoTime();
        int posFim100k = buscaLinear(vetor100k, fimVetor100k);
        long fim_posFim100k = System.nanoTime();
        long duracaoMs_posFim100k = (fim_posFim100k - inicio_posFim100k) / 1000;
        System.out.println("Tempo Linear Fim 100k: " + duracaoMs_posFim100k + " us");

        // Binária 100k
        long inicio_posInicio100kBi = System.nanoTime();
        int posInicio100kBi = buscaBinaria(vetor100k, inicioVetor100k);
        long fim_posInicio100kBi = System.nanoTime();
        long duracaoMs_posInicio100kBi = (fim_posInicio100kBi - inicio_posInicio100kBi) / 1000;
        System.out.println("Tempo Binaria Inicio 100k: " + duracaoMs_posInicio100kBi + " us");

        long inicio_posMeio100kBi = System.nanoTime();
        int posMeio100kBi = buscaBinaria(vetor100k, meioVetor100k);
        long fim_posMeio100kBi = System.nanoTime();
        long duracaoMs_posMeio100kBi = (fim_posMeio100kBi - inicio_posMeio100kBi) / 1000;
        System.out.println("Tempo Binaria Meio 100k: " + duracaoMs_posMeio100kBi + " us");

        long inicio_posFim100kBi = System.nanoTime();
        int posFim100kBi = buscaBinaria(vetor100k, fimVetor100k);
        long fim_posFim100kBi = System.nanoTime();
        long duracaoMs_posFim100kBi = (fim_posFim100kBi - inicio_posFim100kBi) / 1000;
        System.out.println("Tempo Binaria Fim 100k: " + duracaoMs_posFim100kBi + " us");
    }


    public static <T> int buscaLinear(Vetor<T> vetor, T valor) {
        int comparacoes = 0;
        for (int i = 0; i < vetor.obterTamanho(); ++i) {
            T elementoAtual = vetor.ler(i);
            comparacoes++;

            if (elementoAtual != null && elementoAtual.equals(valor)) {
                System.out.println("Comparacoes: " + comparacoes);
                return i;
            }

        }

        System.out.println("Comparacoes: " + comparacoes);
        return -1;
    }


    public static int buscaBinaria(Vetor<Integer> vetor, Integer valor) {
        int inicio = 0;
        int fim = vetor.obterTamanho() - 1;
        int comparacoes = 0;

        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;
            Integer valorMeio = vetor.ler(meio);

            comparacoes++;
            if (valorMeio != null && valorMeio.equals(valor)) {
                System.out.println("Comparacoes: " + comparacoes);
                return meio;
            }

            comparacoes++;
            if (valorMeio != null && valorMeio > valor) {
                fim = meio - 1;
            } else {
                inicio = meio + 1;
            }
        }

        System.out.println("Comparacoes: " + comparacoes);
        return -1;
    }
}
