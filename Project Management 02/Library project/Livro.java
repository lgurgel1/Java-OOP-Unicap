import java.io.Serializable;
import java.util.ArrayList;

class Livro implements Serializable {

    private double avaliacao;
    private String titulo;
    private String autor;
    private int idLivro;
    private boolean disponivel;
    private Categoria categoria;
    private ArrayList<Emprestimo> historicoEmprestimos;

    public Livro(String titulo, String autor, int idLivro, Categoria categoria) {
        this.titulo = titulo;
        this.autor = autor;
        this.idLivro = idLivro;
        this.categoria = categoria;
        this.disponivel = true;
        this.historicoEmprestimos = new ArrayList<>();
        this.avaliacao = 0;

    }
    public double getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(double avaliacao) {
        this.avaliacao = avaliacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getIdLivro() {
        return idLivro;
    }

    public void setIdLivro(int idLivro) {
        this.idLivro = idLivro;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public ArrayList<Emprestimo> getHistoricoEmprestimos() {
        return historicoEmprestimos;
    }

    public void adicionarEmprestimo(Emprestimo emprestimo) {
        historicoEmprestimos.add(emprestimo);
    }

    public void removerEmprestimo(Emprestimo emprestimo) {
        historicoEmprestimos.remove(emprestimo);
    }

}
