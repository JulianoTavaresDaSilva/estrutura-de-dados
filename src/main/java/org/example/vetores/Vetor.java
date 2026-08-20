package org.example.vetores;

public class Vetor<T> {
    private T[] elementos;
    private int tamanho;

    @SuppressWarnings("unchecked")
    public Vetor(int quantidade) {
        this.elementos = (T[])(new Object[quantidade]);
        this.tamanho = 0;
    }

    public void inserir(T elemento) {
        if (this.tamanho == this.elementos.length) {
            this.expandir();
        }

        this.elementos[this.tamanho] = elemento;
        ++this.tamanho;
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
            for(int i = indice; i < this.tamanho; ++i) {
                this.elementos[i] = this.elementos[i + 1];
            }

            this.elementos[this.tamanho - 1] = null;
            --this.tamanho;
            this.reduzir();
        } else {
            System.out.println("Indice Inválido");
        }
    }

    public void inserir(int indice, T elemento) {
        if (this.tamanho == this.elementos.length) {
            this.expandir();
        }

        if (indice >= 0 && indice <= this.elementos.length) {
            for(int i = this.tamanho; i > indice; --i) {
                this.elementos[i] = this.elementos[i - 1];
            }

            this.elementos[indice] = elemento;
            ++this.tamanho;
        } else {
            System.out.println("Posição Inválida");
        }
    }

    public void inserirOrdenadov2(T valor) {
        if (this.localizar(valor) != -1) {
            System.out.println("Valor " + String.valueOf(valor) + " já existe na lista.");
        } else if (this.tamanho == 0) {
            this.inserir(this.tamanho, valor);
        } else {
            for(int i = 0; i < this.tamanho; ++i) {
                if ((Integer)valor < (Integer)this.elementos[i]) {
                    this.inserir(i, valor);
                    break;
                }
            }

        }
    }

    public void inserirOrdenado(T valor) {
        if (this.localizar(valor) != -1) {
            System.out.println("Valor " + String.valueOf(valor) + " já existe na lista.");
        } else {
            if (this.tamanho == this.elementos.length) {
                this.expandir();
            }

            int i;
            for(i = this.tamanho - 1; i >= 0; --i) {
                Integer atual = (Integer)this.elementos[i];
                if (atual <= (Integer)valor) {
                    break;
                }

                this.elementos[i + 1] = this.elementos[i];
            }

            this.elementos[i + 1] = valor;
            ++this.tamanho;
        }
    }

    public int obterTamanho() {
        return this.tamanho;
    }

    public int localizar(T valor) {
        for(int i = 0; i < this.tamanho; ++i) {
            if (this.elementos[i] != null && this.elementos[i] == valor) {
                return i;
            }
        }

        return -1;
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