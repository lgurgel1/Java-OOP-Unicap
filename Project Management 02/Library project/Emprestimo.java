import java.io.Serializable;
import java.util.Date;

class Emprestimo implements Serializable {
    private Date dataEmprestimo;
    private Date dataDevolucao;
    private String nomeUsuario;
    private Livro livro;

    public Emprestimo(Date dataEmprestimo, String nomeUsuario) {
        this.dataEmprestimo = dataEmprestimo;
        this.nomeUsuario = nomeUsuario;
        this.livro = livro;
    }
    public Livro getLivro() {
        return livro;
    }

    public Date getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(Date dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public Date getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(Date dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }
}
