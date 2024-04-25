import java.util.ArrayList;
import java.util.Date;
import java.io.Serializable;

public class Biblioteca implements Serializable {
    private ArrayList<Livro> listaLivros;
    private ArrayList<Cliente> listaClientes;

    public Biblioteca() {
        this.listaLivros = new ArrayList<>();
        this.listaClientes = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        listaLivros.add(livro);
        // Adicionar o livro à sua categoria - aprimorar
        livro.getCategoria().getLivros().add(livro);
    }

    public void removerLivro(Livro livro) {
        listaLivros.remove(livro);
        // Remover o livro de sua categoria
        livro.getCategoria().getLivros().remove(livro);
    }

    public void adicionarCliente(Cliente cliente) {
        listaClientes.add(cliente);
    }

    public void removerCliente(Cliente cliente) {
        listaClientes.remove(cliente);
    }

    public void emprestarLivro(Livro livro, Cliente cliente) {
        if (livro.isDisponivel()) {
            livro.setDisponivel(false);
            // Registrar o emprestimo
            Emprestimo emprestimo = new Emprestimo(new Date(), cliente.getNome());
            livro.adicionarEmprestimo(emprestimo);
            cliente.adicionarLivroEmprestado(livro);
            System.out.println("Livro emprestado com sucesso.");
        } else {
            System.out.println("Livro não disponível para empréstimo.");
        }
    }

    public void devolverLivro(Livro livro, Cliente cliente) {
        livro.setDisponivel(true);
        // Remover o empréstimo
        for (Emprestimo emprestimo : livro.getHistoricoEmprestimos()) {
            if (emprestimo.getNomeUsuario().equals(cliente.getNome())) {
                livro.removerEmprestimo(emprestimo);
                cliente.removerLivroEmprestado(livro);
                break;
            }
        }
        System.out.println("Livro devolvido com sucesso.");
    }

    public void imprimirListaLivros(boolean disponiveis) {
        System.out.println("\n=== Lista de Livros ===");
        for (Livro livro : listaLivros) {
            if (livro.isDisponivel() == disponiveis) {
                String status = disponiveis ? "Disponível" : "Indisponível";
                System.out.println("Nome: " + livro.getTitulo());
                System.out.println("ID: " + livro.getIdLivro());
                System.out.println("Gênero: " + livro.getCategoria().getNome());
                System.out.println("Status: " + status);
                System.out.println();
            }
        }
    }


    public ArrayList<Livro> pesquisarLivrosPorGenero(String genero) {
        ArrayList<Livro> livrosEncontrados = new ArrayList<>();
        for (Livro livro : listaLivros) {
            if (livro.getCategoria().getNome().equalsIgnoreCase(genero)) {
                livrosEncontrados.add(livro);
            }
        }
        return livrosEncontrados;
    }

    public void imprimirHistoricoEmprestimos(Livro livro) {
        System.out.println("\n=== Histórico de Empréstimos do Livro ===");
        for (Emprestimo emprestimo : livro.getHistoricoEmprestimos()) {
            System.out.println("Data de Empréstimo: " + emprestimo.getDataEmprestimo());
            System.out.println("Nome do Cliente: " + emprestimo.getNomeUsuario());
            System.out.println();
        }
    }

    public ArrayList<Livro> getListaLivros() {
        return listaLivros;
    }

    public ArrayList<Cliente> getListaClientes() {
        return listaClientes;
    }
    public Livro buscarLivroPorID(int idLivro) {
        for (Livro livro : listaLivros) {
            if (livro.getIdLivro() == idLivro) {
                return livro;
            }
        }
        return null; // se nao encontrar livro c ID
    }

    public Cliente buscarClientePorID(int idCliente) {
        for (Cliente cliente : listaClientes) {
            if (cliente.getIdCliente() == idCliente) {
                return cliente;
            }
        }
        return null; // se nao encontrar usuario c ID
    }

    public Livro buscarLivroPorId(int idLivro) {
        for (Livro livro : listaLivros) {
            if (livro.getIdLivro() == idLivro) {
                return livro;
            }
        }
        return null; // Retornar null se o livro não for encontrado
    }
}
