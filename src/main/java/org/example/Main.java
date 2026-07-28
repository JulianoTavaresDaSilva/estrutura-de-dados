package org.example;

import org.example.lab01.Gerente;
import org.example.lab01.Funcionario;
import org.example.lab01.Projeto;


public class Main {
    static void main() {

        Gerente gerente = new Gerente("Gelson", 8000);

        Funcionario[] funcionarios = new Funcionario[3];

        funcionarios[0] = new Funcionario("João", 3000);
        funcionarios[1] = new Funcionario("Maria", 3500);
        funcionarios[2] = new Funcionario("Carlos", 2800);

        Projeto projeto = new Projeto(
                "Sistema de Estoque",
                gerente,
                funcionarios,
                true
        );

        projeto.exibirProjeto();

    }
}
