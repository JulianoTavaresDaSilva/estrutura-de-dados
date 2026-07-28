package org.example.lab01;

public class Gerente {

    private String nome;
    private double salarioBase;

    public Gerente(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public String getNome() {
        return nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public double calcularSalario(int quantidadeFuncionarios, boolean projetoFinalizado) {

        double salarioFinal = salarioBase + (salarioBase * 0.01 * quantidadeFuncionarios);

        if (projetoFinalizado) {
            salarioFinal += salarioBase * 0.10;
        }

        return salarioFinal;
    }
}