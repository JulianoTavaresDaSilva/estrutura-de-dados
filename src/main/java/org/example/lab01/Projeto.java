package org.example.lab01;

public class Projeto {

    private String nome;
    private Gerente gerente;
    private Funcionario[] funcionarios;
    private boolean finalizado;

    public Projeto(String nome, Gerente gerente, Funcionario[] funcionarios, boolean finalizado) {
        this.nome = nome;
        this.gerente = gerente;
        this.funcionarios = funcionarios;
        this.finalizado = finalizado;
    }

    public double calcularCusto() {

        double total = gerente.calcularSalario(funcionarios.length, finalizado);

        for (Funcionario funcionario : funcionarios) {
            total += funcionario.calcularSalario(finalizado);
        }

        return total;
    }

    public void exibirProjeto() {

        System.out.println("\n==============================");
        System.out.println("Projeto: " + nome);

        System.out.println("\nGerente:");
        System.out.println("Nome: " + gerente.getNome());
        System.out.printf("Salário: R$ %.2f%n",
                gerente.calcularSalario(funcionarios.length, finalizado));

        System.out.println("\nFuncionários:");

        for (Funcionario funcionario : funcionarios) {
            System.out.printf("%s - R$ %.2f%n",
                    funcionario.getNome(),
                    funcionario.calcularSalario(finalizado));
        }

        System.out.printf("%nCusto total do projeto: R$ %.2f%n", calcularCusto());
    }
}