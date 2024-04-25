import java.io.Serializable;
import java.util.ArrayList;

class Categoria implements Serializable {
    private String nome;
    private ArrayList<Livro> livros;

    public Categoria(String nome) {
        this.nome = nome;
        this.livros = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Livro> getLivros() {
        return livros;
    }

    public void setLivros(ArrayList<Livro> livros) {
        this.livros = livros;
    }
}
