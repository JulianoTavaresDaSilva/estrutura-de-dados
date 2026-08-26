package org.example.vetores;

import java.util.Random;

public class Vetor<T> {
    private T[] elementos;
    private int tamanho;

    @SuppressWarnings("unchecked")
    public Vetor(int quantidade) {
        this.elementos = (T[])(new Object[quantidade]);
        this.tamanho = 0;
    }

    public T ler(int indice) {
        if (indice >= 0 && indice < this.tamanho) {
            return this.elementos[indice];
        } else {
            System.out.println("Índice Inválido");
            return null;
        }
    }

    public void inserir(T elemento) {
        if (this.tamanho == this.elementos.length) {
            this.expandir();
        }

        this.elementos[this.tamanho] = elemento;
        ++this.tamanho;
    }

    public void inserir(int indice, T elemento) {
        if (this.tamanho == this.elementos.length) {
            this.expandir();
        }

        if (indice >= 0 && indice <= this.tamanho) {
            for(int i = this.tamanho; i > indice; --i) {
                this.elementos[i] = this.elementos[i - 1];
            }

            this.elementos[indice] = elemento;
            ++this.tamanho;
        } else {
            System.out.println("Posição Inválida");
        }
    }

    // checa o valor para não ter valores duplicados
    public void inserirOrdenado(T elemento) {
        if (this.buscaLinear(elemento) != -1) {
            System.out.println("Valor " + String.valueOf(elemento) + " já existe na lista.");
        } else {
            this.inserirOrdenadoRepetidos(elemento);
        }
    }

    // percorre o array do fim para o início para inserir o elemento de forma ordenada
    public void inserirOrdenadoRepetidos(T elemento) {
        if (this.tamanho == this.elementos.length) {
            this.expandir();
        }

        int i;
        for(i = this.tamanho - 1; i >= 0; --i) {
            Integer atual = (Integer)this.elementos[i];
            if (atual <= (Integer)elemento) {
                break;
            }

            this.elementos[i + 1] = this.elementos[i];
        }

        this.elementos[i + 1] = elemento;
        ++this.tamanho;
    }

    @SuppressWarnings("unchecked")
    public void inserirAleatorio(int quantidade, int range){
        Random aleatorio = new Random();

        while (obterTamanho() < quantidade){
            int numeroAleatorio = aleatorio.nextInt(range);
            T valor = (T) (Object) numeroAleatorio;
            inserirOrdenadoRepetidos(valor);
        }
    }

    @SuppressWarnings("unchecked")
    private void expandir() {
        T[] novo = (T[])(new Object[this.elementos.length * 2]);

        for(int i = 0; i < this.elementos.length; ++i) {
            novo[i] = this.elementos[i];
        }

        this.elementos = novo;
    }

    @SuppressWarnings("unchecked")
    private void reduzir() {
        if (this.tamanho <= this.elementos.length / 4) {
            T[] novo = (T[])(new Object[this.elementos.length / 2]);

            for(int i = 0; i < this.tamanho; ++i) {
                novo[i] = this.elementos[i];
            }

            this.elementos = novo;
        }

    }

    public void remover(int indice) {
        if (indice >= 0 && indice < this.tamanho) {
            for(int i = indice; i < this.tamanho - 1; ++i) {
                this.elementos[i] = this.elementos[i + 1];
            }

            this.elementos[this.tamanho - 1] = null;
            --this.tamanho;
            this.reduzir();
        } else {
            System.out.println("Indice Inválido");
        }
    }

    public int buscaLinear(T elemento) {
        for (int i = 0; i < this.tamanho; ++i) {
            if (this.elementos[i] != null && this.elementos[i].equals(elemento)) {
                return i;
            }
        }
        return -1; // Não encontrado
    }

    public int buscarBinaria(Integer elemento) {
        int inicio = 0;
        int fim = this.tamanho - 1;

        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;
            Integer valorMeio = (Integer) this.elementos[meio]; // Pega o VALOR que está guardado no índice 'meio'

            if (valorMeio.equals(elemento)) {
                return meio;
            }

            if (valorMeio > elemento) {
                fim = meio - 1;
            } else {
                inicio = meio + 1;
            }
        }

        return -1; // Não encontrado
    }

    public void ordenar(){
        for(int i = 0; i < tamanho - 1; i++){
            for (int j = 0; j < tamanho - 1 - i; j++){
                if ((Integer) this.elementos[j] > (Integer) this.elementos[j+1]){
                    T reserva = this.elementos[j];
                    this.elementos[j] = this.elementos[j+1];
                    this.elementos[j+1] = reserva;
                }
            }
        }
    }

    public int obterTamanho() {
        return this.tamanho;
    }

    public void imprimir() {
        System.out.print("[");

        for(int i = 0; i < this.tamanho; ++i) {
            System.out.print(this.elementos[i]);
            if (i < this.tamanho - 1) {
                System.out.print(", ");
            }
        }

        System.out.println("]");
    }
}