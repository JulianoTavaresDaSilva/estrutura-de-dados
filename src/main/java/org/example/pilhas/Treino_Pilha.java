package org.example.pilhas;

import org.example.labs.lab04.Posicao;

public class Treino_Pilha {

    private char[][] mapa = {
            {'*','*','*','*','*','*','*','*','*','*'},
            {'R',' ',' ','*',' ',' ',' ',' ',' ','*'},
            {'*','*',' ','*',' ','*','*','*',' ','*'},
            {'*',' ',' ',' ',' ',' ',' ','*',' ','*'},
            {'*',' ','*','*','*','*',' ','*',' ','*'},
            {'*',' ',' ',' ',' ','*',' ',' ',' ','*'},
            {'*','*','*','*',' ','*','*','*',' ','*'},
            {'*',' ',' ',' ',' ',' ',' ',' ',' ','S'},
            {'*','*','*','*','*','*','*','*','*','*'}
    };

    private boolean[][] visitados;

    private Pilha<Posicao> pilha;

    private int linhaInicial;
    private int colunaInicial;

    private int linhaFinal;
    private int colunaFinal;

    public Treino_Pilha() {

    }

    private boolean posicaoValida(int linha, int coluna) {
        return false;
    }

    public boolean jogar() {
        return false;
    }

    private void marcarCaminho() {

    }

    public void imprimir() {

    }

    public static void main(String[] args) {

    }
}
