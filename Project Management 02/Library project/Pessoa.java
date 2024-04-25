import java.io.Serializable;
import java.util.ArrayList;



class Pessoa implements Serializable {
    public String nome;
    private String endereco;
    private String telefone;

    public Pessoa(String nome, String endereco, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void imprimirDetalhes() {
        System.out.println("Nome: " + nome);
        System.out.println("Endereço: " + endereco);
        System.out.println("Telefone: " + telefone);
    }
}



class Cliente extends Pessoa {
    private int idCliente;
    private String senha;
    private final ArrayList<Livro> livrosEmprestados;

    public Cliente(String nome, String endereco, String telefone, String senha, int idCliente) {
        super(nome, endereco, telefone);
        this.senha = senha;
        this.idCliente = idCliente;
        this.livrosEmprestados = new ArrayList<>();
    }

    // senha
    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
    public ArrayList<Emprestimo> getHistoricoEmprestimos() {
        // Lógica para retornar o histórico de empréstimos do cliente
        // Implemente de acordo com a sua aplicação
        return null; // Temporário, substitua com a lógica real
    }

    public ArrayList<Livro> getLivrosEmprestados() {
        return livrosEmprestados;
    }

    public void adicionarLivroEmprestado(Livro livro) {
        livrosEmprestados.add(livro);
    }

    public void removerLivroEmprestado(Livro livro) {
        livrosEmprestados.remove(livro);
    }

    public boolean verificarSenha(String senha) {
        return this.senha.equals(senha);
    }
    public String getNomeUsuario() {
        return this.nome;
    }
}




class Funcionario extends Pessoa {

    // Atributo específico do Funcionário
    private int idFuncionario;

    // Construtor
    public Funcionario(String nome, String endereco, String telefone, int idFuncionario) {
        super(nome, endereco, telefone);
        this.idFuncionario = idFuncionario;
    }

    // Getters e Setters específicos do Funcionário
    public int getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    // Método para adicionar um novo livro ao sistema
    public void adicionarLivro(Biblioteca biblioteca, Livro livro) {
        biblioteca.adicionarLivro(livro);
    }

    // Método para remover um livro do sistema
    public void removerLivro(Biblioteca biblioteca, Livro livro) {
        biblioteca.removerLivro(livro);
    }

    // Método para atualizar informações de um livro no sistema
    public void atualizarLivro(Livro livro, String titulo, String autor, int idLivro, Categoria categoria, boolean disponivel) {
        livro.setTitulo(titulo);
        livro.setAutor(autor);
        livro.setIdLivro(idLivro);
        livro.setCategoria(categoria);
        livro.setDisponivel(disponivel);
    }

    public void verHistoricoEmprestimos(Livro livro) {
        ArrayList<Emprestimo> historicoEmprestimos = livro.getHistoricoEmprestimos();

        if (historicoEmprestimos.isEmpty()) {
            System.out.println("Este livro não possui histórico de empréstimos.");
        } else {
            System.out.println("\n===== Histórico de Empréstimos do Livro =====");
            for (Emprestimo emprestimo : historicoEmprestimos) {
                System.out.println("Data de Empréstimo: " + emprestimo.getDataEmprestimo());
                System.out.println("Nome do Cliente: " + emprestimo.getNomeUsuario());
                System.out.println();
            }
        }
    }


}



