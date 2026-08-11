package org.example.lab02;

public class Agenda {

    private Contato[] contatos;
    private int tamanho;

    public Agenda(int quantidade) {
        contatos = new Contato[quantidade];
        this.tamanho = 0;
    }

    public void adicionar(Contato contato) {

        if (tamanho >= contatos.length){
            System.out.println("Vetor cheio");
            return;
        }

        for (int i = 0; i < tamanho; i++){
            if (contato.getNome().equals(contatos[i].getNome())) {
                System.out.println("O nome já está cadastrado!");
                return;
            }

            if (contato.getTelefone().equals(contatos[i].getTelefone())) {
                System.out.println("O telefone já está cadastrado!");
                return;
            }
        }

        contatos[tamanho] = contato;
        tamanho++;
    }

    public void remover(String nome) {
        for (int i = 0; i < tamanho; i++){
            if (contatos[i].getNome().equals(nome)){
                for (int j = i; j < tamanho - 1; j++){
                    contatos[j] = contatos[j + 1];
                }
                contatos[tamanho - 1] = null;
                tamanho--;
                return;
            }
        }
        System.out.println("Contato não encontrado!");
    }

    public Contato buscarPorNome(String nome) {
        for (int i = 0; i < tamanho; i++){
            if (contatos[i].getNome().equals(nome)){
                return contatos[i];
            }
        }

        return null;
    }

    public Contato buscarPorTelefone(String telefone) {
        for (int i = 0; i < tamanho; i++){
            if (contatos[i].getTelefone().equals(telefone)){
                return contatos[i];
            }
        }

        return null;
    }

    public void atualizar(String nome, Contato novoContato) {
        int indice = -1;

        for (int i = 0; i < tamanho; i++) {
            if (contatos[i].getNome().equals(nome)) {
                indice = i;
                break;
            }
        }

        if (indice == -1) {
            System.out.println("Contato não encontrado!");
            return;
        }

        for (int i = 0; i < tamanho; i++) {
            if (i != indice &&
                    (contatos[i].getNome().equals(novoContato.getNome()) ||
                            contatos[i].getTelefone().equals(novoContato.getTelefone()))) {

                System.out.println("Nome ou telefone já cadastrado!");
                return;
            }
        }

        contatos[indice] = novoContato;
    }

    public void listar() {
        for (int i = 0; i < tamanho; i++){
            System.out.println(contatos[i].toString());
        }
    }

    public void inserirEmLote(Contato[] novosContatos) {
        if (contatos.length < tamanho + novosContatos.length){
            System.out.println("Agenda sem espaço suficiente.");
            return;
        }

        for (int i = 0; i < novosContatos.length; i++){
            for (int j = 0; j < novosContatos.length; j++){
                if (i != j &&
                        (novosContatos[i].getNome().equals(novosContatos[j].getNome())
                        || novosContatos[i].getTelefone().equals(novosContatos[j].getTelefone()))){

                    System.out.println("Lote contém dados duplicados.");
                    return;
                }
            }
        }

        for (int i = 0; i < tamanho; i++){
            for (int j = 0; j < novosContatos.length; j++){
                if (contatos[i].getNome().equals(novosContatos[j].getNome())
                        || contatos[i].getTelefone().equals(novosContatos[j].getTelefone())){

                    System.out.println("Lote contém dados que já existe na agenda.");
                    return;
                }
            }
        }

        for (int i = 0; i < novosContatos.length; i++){
            contatos[tamanho] = novosContatos[i];
            tamanho++;
        }
    }

    public void buscarPorPrefixo(String prefixo) {
        int contador = 0;

        for (int i = 0; i < tamanho; i++){
            if (contatos[i].getNome().startsWith(prefixo)){
                System.out.println(contatos[i].toString());
                contador++;
            }
        }

        if (contador == 0) System.out.println("Nenhum contato encontrado.");
    }
}