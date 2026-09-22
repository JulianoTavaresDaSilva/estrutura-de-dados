package org.example.labs.lab04;

public class Posicao implements Comparable<Posicao> {

    private int linha;
    private int coluna;

    public Posicao(int linha, int coluna) {
        this.linha = linha;
        this.coluna = coluna;
    }

    public int getLinha() {
        return linha;
    }

    public int getColuna() {
        return coluna;
    }

    @Override
    public int compareTo(Posicao outra) {
        if (this.linha != outra.linha) {
            return Integer.compare(this.linha, outra.linha);
        }

        return Integer.compare(this.coluna, outra.coluna);
    }
}