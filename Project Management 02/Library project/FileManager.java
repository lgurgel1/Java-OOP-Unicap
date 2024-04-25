

import java.io.*;

public class FileManager {
    private static final String CAMINHO_ARQUIVO = "C:\\proj2\\testearquivojava\\dadosBiblioteca.bin";

    public static void salvarDados(Biblioteca biblioteca) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(CAMINHO_ARQUIVO))) {
            out.writeObject(biblioteca);
        } catch (IOException e) {
            System.out.println("Erro ao salvar os dados: " + e.getMessage());
        }
    }

    public static Biblioteca carregarDados() {
        File arquivo = new File(CAMINHO_ARQUIVO);
        if (arquivo.exists()) {
            try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(arquivo))) {
                return (Biblioteca) in.readObject();
            } catch (IOException | ClassNotFoundException e) {
                System.out.println("Erro ao carregar os dados: " + e.getMessage());
            }
        }
        return new Biblioteca(); // retorna uma nova biblioteca se não houver dados salvos
    }
}
