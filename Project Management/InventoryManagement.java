import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class InventoryManagement {

    // Declaração de ArrayLists para armazenar produtos e suas quantidades
    static ArrayList<String> produtos = new ArrayList<>();
    static ArrayList<Integer> quantidades = new ArrayList<>();

    // Método para cadastrar um novo produto
    public static void cadastraProduto(String nome, int quantidade) {
        if (nome.isEmpty()) { // Verifica se o nome do produto está vazio
            JOptionPane.showMessageDialog(null, "Por favor, insira um nome válido para o produto.");
            return;
        }
        if (quantidade <= 0) { // Verifica se a quantidade é positiva
            JOptionPane.showMessageDialog(null, "A quantidade deve ser um número inteiro positivo.");
            return;
        }
        // Adiciona o produto e sua quantidade aos ArrayLists
        produtos.add(nome.toLowerCase()); // Converte para minúsculas para facilitar comparações
        quantidades.add(quantidade);
        JOptionPane.showMessageDialog(null, "Produto cadastrado com sucesso!");
    }

    // Método para remover um produto
    public static void removeProduto(String nome) {
        if (nome.isEmpty()) { // Verifica se o nome do produto está vazio
            JOptionPane.showMessageDialog(null, "Por favor, insira um nome válido para o produto.");
            return;
        }
        int index = produtos.indexOf(nome.toLowerCase()); // Encontra o índice do produto
        if (index != -1) { // Se encontrado, remove o produto e sua quantidade
            produtos.remove(index);
            quantidades.remove(index);
            JOptionPane.showMessageDialog(null, "Produto removido com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Produto não encontrado!");
        }
    }

    // Método para adicionar quantidade a um produto existente
    public static void adicionaQuantidade(String nome, int quantidade) {
        if (nome.isEmpty()) { // Verifica se o nome do produto está vazio
            JOptionPane.showMessageDialog(null, "Por favor, insira um nome válido para o produto.");
            return;
        }
        if (quantidade <= 0) { // Verifica se a quantidade é positiva
            JOptionPane.showMessageDialog(null, "A quantidade deve ser um número inteiro positivo.");
            return;
        }
        int index = produtos.indexOf(nome.toLowerCase()); // Encontra o índice do produto
        if (index != -1) { // Se encontrado, adiciona a quantidade especificada
            quantidades.set(index, quantidades.get(index) + quantidade);
            JOptionPane.showMessageDialog(null, "Quantidade adicionada com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Produto não encontrado!");
        }
    }

    // Método para remover quantidade de um produto existente
    public static void removeQuantidade(String nome, int quantidade) {
        if (nome.isEmpty()) { // Verifica se o nome do produto está vazio
            JOptionPane.showMessageDialog(null, "Por favor, insira um nome válido para o produto.");
            return;
        }
        if (quantidade <= 0) { // Verifica se a quantidade é positiva
            JOptionPane.showMessageDialog(null, "A quantidade deve ser um número inteiro positivo.");
            return;
        }
        int index = produtos.indexOf(nome.toLowerCase()); // Encontra o índice do produto
        if (index != -1) { // Se encontrado, remove a quantidade especificada
            int novaQuantidade = quantidades.get(index) - quantidade;
            if (novaQuantidade >= 0) { // Verifica se a quantidade resultante é positiva
                quantidades.set(index, novaQuantidade);
                JOptionPane.showMessageDialog(null, "Quantidade removida com sucesso!");
            } else {
                JOptionPane.showMessageDialog(null, "Quantidade insuficiente!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Produto não encontrado!");
        }
    }

    // Método para exibir todos os produtos e suas quantidades
    public static void exibeProdutos() {
        StringBuilder listaProdutos = new StringBuilder();
        listaProdutos.append("Lista de Produtos:\n");
        // Percorre os ArrayLists e constrói a string com os produtos e quantidades
        for (int i = 0; i < produtos.size(); i++) {
            listaProdutos.append(produtos.get(i)).append(" - Quantidade: ").append(quantidades.get(i)).append("\n");
        }
        JOptionPane.showMessageDialog(null, listaProdutos.toString());
    }

    // Método para buscar um produto pelo nome
    public static void buscaProduto(String nome) {
        if (nome.isEmpty()) { // Verifica se o nome para busca está vazio
            JOptionPane.showMessageDialog(null, "Por favor, insira um nome válido para a busca.");
            return;
        }

        ArrayList<String> produtosEncontrados = new ArrayList<>();
        // Percorre os produtos e verifica se o nome buscado está contido neles
        for (String produto : produtos) {
            if (produto.contains(nome.toLowerCase())) { // Ignora diferenças de maiúsculas/minúsculas
                produtosEncontrados.add(produto); // Adiciona o produto à lista de resultados
            }
        }

        if (!produtosEncontrados.isEmpty()) { // Se foram encontrados produtos, exibe-os
            StringBuilder resultado = new StringBuilder("Produtos encontrados:\n");
            for (String produto : produtosEncontrados) {
                int index = produtos.indexOf(produto);
                resultado.append(produto).append(" - Quantidade: ").append(quantidades.get(index)).append("\n");
            }
            JOptionPane.showMessageDialog(null, resultado.toString());
        } else {
            JOptionPane.showMessageDialog(null, "Nenhum produto encontrado com o nome especificado.");
        }
    }

    // Método para editar um produto existente
    public static void editarProduto(String nomeAntigo, String novoNome, int novaQuantidade) {
        if (nomeAntigo.isEmpty() || novoNome.isEmpty()) { // Verifica se os nomes estão vazios
            JOptionPane.showMessageDialog(null, "Por favor, insira nomes válidos para o produto.");
            return;
        }

        int index = produtos.indexOf(nomeAntigo.toLowerCase()); // Encontra o índice do produto
        if (index != -1) { // Se encontrado, atualiza o nome e a quantidade
            produtos.set(index, novoNome.toLowerCase());
            quantidades.set(index, novaQuantidade);
            JOptionPane.showMessageDialog(null, "Produto editado com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Produto não encontrado!");
        }
    }

    // Método para exibir o histórico de movimentação de um produto
    public static void historicoMovimentacao(String nome) {
        if (nome.isEmpty()) { // Verifica se o nome do produto está vazio
            JOptionPane.showMessageDialog(null, "Por favor, insira um nome válido para o produto.");
            return;
        }

        StringBuilder historico = new StringBuilder("Histórico de Movimentação do Produto:\n");
        // Percorre os produtos e suas quantidades, mostrando movimentações para o produto especificado
        for (int i = 0; i < produtos.size(); i++) {
            if (produtos.get(i).equals(nome.toLowerCase())) {
                historico.append("Data: ").append(java.time.LocalDate.now()).append(" - Movimentação: Entrada - Quantidade: ").append(quantidades.get(i)).append("\n");
            }
        }

        // Verifica se foram encontradas movimentações para o produto especificado
        if (historico.toString().equals("Histórico de Movimentação do Produto:\n")) {
            JOptionPane.showMessageDialog(null, "Produto não encontrado ou sem movimentações registradas.");
        } else {
            JOptionPane.showMessageDialog(null, historico.toString());
        }
    }

    // Método principal
    public static void main(String[] args) {
        JFrame frame = new JFrame("Sistema de Gerenciamento de Produtos");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new GridLayout(4, 2, 10, 10));

        // Botão e ação para cadastrar um novo produto
        JButton cadastrarBtn = new JButton("Cadastrar Produto");
        cadastrarBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nomeProduto = JOptionPane.showInputDialog("Digite o nome do produto:");
                if (nomeProduto != null) {
                    String quantidadeStr = JOptionPane.showInputDialog("Digite a quantidade:");
                    if (quantidadeStr != null) {
                        try {
                            int quantidade = Integer.parseInt(quantidadeStr);
                            cadastraProduto(nomeProduto, quantidade);
                        } catch (NumberFormatException ex) {
                            JOptionPane.showMessageDialog(null, "Quantidade inválida! Por favor, insira um número válido.");
                        }
                    }
                }
            }
        });

        // Botão e ação para remover um produto
        JButton removerBtn = new JButton("Remover Produto");
        removerBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nomeProduto = JOptionPane.showInputDialog("Digite o nome do produto:");
                if (nomeProduto != null) {
                    removeProduto(nomeProduto);
                }
            }
        });

        // Botão e ação para adicionar quantidade a um produto
        JButton adicionarBtn = new JButton("Adicionar Quantidade");
        adicionarBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nomeProduto = JOptionPane.showInputDialog("Digite o nome do produto:");
                if (nomeProduto != null) {
                    String quantidadeStr = JOptionPane.showInputDialog("Digite a quantidade a ser adicionada:");
                    if (quantidadeStr != null) {
                        try {
                            int quantidade = Integer.parseInt(quantidadeStr);
                            adicionaQuantidade(nomeProduto, quantidade);
                        } catch (NumberFormatException ex) {
                            JOptionPane.showMessageDialog(null, "Quantidade inválida! Por favor, insira um número válido.");
                        }
                    }
                }
            }
        });

        // Botão e ação para remover quantidade de um produto
        JButton removerQuantidadeBtn = new JButton("Remover Quantidade");
        removerQuantidadeBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nomeProduto = JOptionPane.showInputDialog("Digite o nome do produto:");
                if (nomeProduto != null) {
                    String quantidadeStr = JOptionPane.showInputDialog("Digite a quantidade a ser removida:");
                    if (quantidadeStr != null) {
                        try {
                            int quantidade = Integer.parseInt(quantidadeStr);
                            removeQuantidade(nomeProduto, quantidade);
                        } catch (NumberFormatException ex) {
                            JOptionPane.showMessageDialog(null, "Quantidade inválida! Por favor, insira um número válido.");
                        }
                    }
                }
            }
        });

        // Botão e ação para exibir todos os produtos
        JButton exibirBtn = new JButton("Exibir Produtos");
        exibirBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                exibeProdutos();
            }
        });

        // Botão e ação para buscar um produto pelo nome
        JButton buscarBtn = new JButton("Buscar Produto");
        buscarBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nomeProduto = JOptionPane.showInputDialog("Digite o nome do produto a ser buscado:");
                if (nomeProduto != null) {
                    buscaProduto(nomeProduto);
                }
            }
        });

        // Botão e ação para editar um produto
        JButton editarBtn = new JButton("Editar Produto");
        editarBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nomeProdutoAntigo = JOptionPane.showInputDialog("Digite o nome do produto a ser editado:");
                if (nomeProdutoAntigo != null) {
                    String novoNomeProduto = JOptionPane.showInputDialog("Digite o novo nome do produto:");
                    if (novoNomeProduto != null) {
                        String quantidadeStr = JOptionPane.showInputDialog("Digite a nova quantidade:");
                        if (quantidadeStr != null) {
                            try {
                                int quantidade = Integer.parseInt(quantidadeStr);
                                editarProduto(nomeProdutoAntigo, novoNomeProduto, quantidade);
                            } catch (NumberFormatException ex) {
                                JOptionPane.showMessageDialog(null, "Quantidade inválida! Por favor, insira um número válido.");
                            }
                        }
                    }
                }
            }
        });

        // Botão e ação para exibir o histórico de movimentação de um produto
        JButton historicoBtn = new JButton("Histórico de Movimentação");
        historicoBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nomeProduto = JOptionPane.showInputDialog("Digite o nome do produto:");
                if (nomeProduto != null) {
                    historicoMovimentacao(nomeProduto);
                }
            }
        });

        // Adiciona todos os botões ao frame
        frame.add(cadastrarBtn);
        frame.add(removerBtn);
        frame.add(adicionarBtn);
        frame.add(removerQuantidadeBtn);
        frame.add(exibirBtn);
        frame.add(buscarBtn);
        frame.add(editarBtn);
        frame.add(historicoBtn);

        // Torna o frame visível
        frame.setVisible(true);
    }
}
