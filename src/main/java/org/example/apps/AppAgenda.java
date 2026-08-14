package org.example.apps;

import org.example.lab02.Agenda;
import org.example.lab02.Contato;

import java.util.Scanner;

public class AppAgenda {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Agenda agenda = new Agenda(20);

        int opcao;

        do {

            System.out.println("\n===== AGENDA =====");
            System.out.println("1 - Adicionar contato");
            System.out.println("2 - Remover contato");
            System.out.println("3 - Buscar por nome");
            System.out.println("4 - Buscar por telefone");
            System.out.println("5 - Atualizar contato");
            System.out.println("6 - Listar contatos");
            System.out.println("7 - Inserir em lote");
            System.out.println("8 - Buscar por prefixo");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {

                case 1:
                    System.out.println("\n--- ADICIONAR CONTATO ---");

                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();

                    System.out.print("Telefone: ");
                    String telefone = scanner.nextLine();

                    System.out.print("Email: ");
                    String email = scanner.nextLine();

                    Contato contato = new Contato(nome, telefone, email);

                    agenda.adicionar(contato);

                    break;

                case 2:
                    System.out.println("\n--- REMOVER CONTATO ---");

                    System.out.print("Digite o nome do contato: ");
                    String nomeRemover = scanner.nextLine();

                    agenda.remover(nomeRemover);

                    break;

                case 3:
                    System.out.println("\n--- BUSCAR POR NOME ---");

                    System.out.print("Digite o nome: ");
                    String nomeBusca = scanner.nextLine();

                    Contato contatoNome = agenda.buscarPorNome(nomeBusca);

                    if (contatoNome != null) {
                        System.out.println(contatoNome);
                    } else {
                        System.out.println("Contato não encontrado!");
                    }

                    break;

                case 4:
                    System.out.println("\n--- BUSCAR POR TELEFONE ---");

                    System.out.print("Digite o telefone: ");
                    String telefoneBusca = scanner.nextLine();

                    Contato contatoTelefone = agenda.buscarPorTelefone(telefoneBusca);

                    if (contatoTelefone != null) {
                        System.out.println(contatoTelefone);
                    } else {
                        System.out.println("Contato não encontrado!");
                    }

                    break;

                case 5:
                    System.out.println("\n--- ATUALIZAR CONTATO ---");

                    System.out.print("Digite o nome do contato que deseja atualizar: ");
                    String nomeAtualizar = scanner.nextLine();

                    System.out.print("Novo nome: ");
                    String novoNome = scanner.nextLine();

                    System.out.print("Novo telefone: ");
                    String novoTelefone = scanner.nextLine();

                    System.out.print("Novo email: ");
                    String novoEmail = scanner.nextLine();

                    Contato novoContato = new Contato(
                            novoNome,
                            novoTelefone,
                            novoEmail
                    );

                    agenda.atualizar(nomeAtualizar, novoContato);

                    break;

                case 6:
                    System.out.println("\n--- LISTA DE CONTATOS ---");

                    agenda.listar();

                    break;

                case 7:
                    System.out.println("\n--- INSERIR EM LOTE ---");

                    System.out.print("Quantos contatos deseja inserir? ");
                    int quantidade = scanner.nextInt();
                    scanner.nextLine();

                    Contato[] novosContatos = new Contato[quantidade];

                    for (int i = 0; i < quantidade; i++) {

                        System.out.println("\nContato " + (i + 1));

                        System.out.print("Nome: ");
                        String nomeLote = scanner.nextLine();

                        System.out.print("Telefone: ");
                        String telefoneLote = scanner.nextLine();

                        System.out.print("Email: ");
                        String emailLote = scanner.nextLine();

                        novosContatos[i] = new Contato(
                                nomeLote,
                                telefoneLote,
                                emailLote
                        );
                    }

                    agenda.inserirEmLote(novosContatos);

                    break;

                case 8:
                    System.out.println("\n--- BUSCAR POR PREFIXO ---");

                    System.out.print("Digite o prefixo: ");
                    String prefixo = scanner.nextLine();

                    agenda.buscarPorPrefixo(prefixo);

                    break;

                case 0:
                    System.out.println("Encerrando agenda...");

                    break;

                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 0);

        scanner.close();
    }
}
