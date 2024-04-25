import java.util.Scanner;
import java.util.ArrayList;
import java.util.Comparator;

public class Main {

    private static Biblioteca biblioteca = new Biblioteca();
    private static Scanner scanner = new Scanner(System.in);
    private static Cliente usuarioLogado; // adiciona uma referência ao usuário logado p/ nçao ficar pedindo o ID

    public static void main(String[] args) {
        biblioteca = FileManager.carregarDados(); // Carrega os dados ao iniciar
        menuInicial();
        FileManager.salvarDados(biblioteca); // Salva os dados ao sair
    }

    public static void menuInicial() {
        int opcao;
        do {
            System.out.println("\n===== Menu Inicial =====");
            System.out.println("1. Sou Aluno");
            System.out.println("2. Sou Funcionario");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    menuUsuario();
                    break;
                case 2:
                    menuFuncionario();
                    break;
                case 3:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Escolha novamente.");
            }
        } while (opcao != 3);
    }
    public static void menuUsuario() {
        System.out.println("\n===== Menu Aluno =====");
        System.out.println("1. Fazer login");
        System.out.println("2. Cadastrar");
        System.out.println("3. Voltar");
        System.out.print("Escolha uma opção: ");

        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                fazerLoginUsuario();
                break;
            case 2:
                cadastrarUsuario();
                break;
            case 3:
                System.out.println("Voltando ao menu inicial...");
                break;
            default:
                System.out.println("Opção inválida. Escolha novamente.");
        }
    }

    public static void fazerLoginUsuario() {
        System.out.println("\n===== Login de Aluno =====");
        System.out.print("Nome de usuário: ");
        String nomeUsuario = scanner.next().toLowerCase();
        System.out.print("Senha: ");
        String senha = scanner.next();

        // Verificar o login de usuário
        usuarioLogado = verificarLoginUsuario(nomeUsuario, senha);
        if (usuarioLogado != null) {
            menuOperacoesUsuario();
        } else {
            System.out.println("Usuário ou senha incorretos. Tente novamente.");
        }
    }

    public static Cliente verificarLoginUsuario(String nomeUsuario, String senha) {
        String nomeUsuarioLower = nomeUsuario.toLowerCase(); // Converter para minúsculas
        for (Cliente cliente : biblioteca.getListaClientes()) {
            if (cliente.getNome().toLowerCase().equals(nomeUsuarioLower) && cliente.verificarSenha(senha)) {
                return cliente;
            }
        }
        return null;
    }



    public static void cadastrarUsuario() {
        System.out.println("\n===== Cadastro do Aluno =====");
        System.out.print("Nome de usuário: ");
        String nome = scanner.next();

        // Verifica se o nome de usuário já existe (sem diferenciar maiúsculas e minúsculas)
        for (Cliente cliente : biblioteca.getListaClientes()) {
            if (cliente.getNome().equalsIgnoreCase(nome)) {
                System.out.println("Este nome de usuário já está em uso. Escolha outro.");
                return; // Retorna ao menu
            }
        }

        System.out.print("Senha: ");
        String senha = scanner.next();

        // ID único para o novo usuário
        int idUsuario = Utils.gerarIDAleatorio();

        Cliente novoCliente = new Cliente(nome, "", "", senha, idUsuario);

        biblioteca.adicionarCliente(novoCliente);
        System.out.println("Usuário cadastrado com sucesso! Seu ID é: " + idUsuario);
    }


    public static void menuOperacoesUsuario() {
        int opcao;
        // Loop principal do menu de operações do usuário
        do {
            System.out.println("\n===== Menu de Opções do Aluno =====");
            System.out.println("1. Emprestimo de livro");
            System.out.println("2. Devolver livro");
            System.out.println("3. Lista de livros");
            System.out.println("4. Pesquisar livro por gênero");
            System.out.println("5. Histórico de empréstimos");
            System.out.println("6. Ver ID do aluno");
            System.out.println("7. Livros mais bem avaliados");
            System.out.println("8. Fazer Logout");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    emprestarLivro();
                    break;
                case 2:
                    devolverLivro();
                    break;
                case 3:
                    System.out.println("\n=== Lista de Livros Disponíveis ===");
                    biblioteca.imprimirListaLivros(true); // imprime apenas livros disponíveis
                    System.out.println("\n=== Lista de Livros Indisponíveis ===");
                    biblioteca.imprimirListaLivros(false); // Imprime apenas livros indisponíveis
                    break;

                case 4:
                    pesquisarLivroPorGenero();
                    break;
                case 5:
                    System.out.println("\n===== Histórico =====");
                    System.out.println("Escolha uma opção:");
                    System.out.println("1. Histórico de empréstimos de livros");
                    System.out.println("2. Histórico de leitura do usuário");
                    System.out.print("Opção: ");
                    int opcaoHistorico = scanner.nextInt();
                    switch (opcaoHistorico) {
                        case 1:
                            imprimirHistoricoEmprestimos();
                            break;
                        case 2:
                            imprimirHistoricoLeitura();
                            break;
                        default:
                            System.out.println("Opção inválida.");
                    }
                    break;
                case 6:
                    System.out.println("Seu ID de usuário é: " + usuarioLogado.getIdCliente());
                    break;
                case 7:
                    listarLivrosMaisBemAvaliados();
                    break;
                case 8:
                    usuarioLogado = null; // Faz logout, limpando o usuário logado
                    System.out.println("Voltando ao menu inicial...");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha novamente.");
            }
        } while (opcao != 8); // continua no loop
    }

    public static void listarLivrosMaisBemAvaliados() {
        System.out.println("\n===== Livros Mais Bem Avaliados =====");
        ArrayList<Livro> livrosOrdenados = new ArrayList<>(biblioteca.getListaLivros());
        livrosOrdenados.sort(Comparator.comparingDouble(Livro::getAvaliacao).reversed());
        int count = 1;
        for (Livro livro : livrosOrdenados) {
            if (livro.getAvaliacao() > 0) {
                System.out.println(count + ". Título: " + livro.getTitulo());
                System.out.println("   Avaliação: " + livro.getAvaliacao());
                System.out.println("   Autor: " + livro.getAutor());
                System.out.println("   ID: " + livro.getIdLivro());
                System.out.println("   Gênero: " + livro.getCategoria().getNome());
                count++;
            }
        }
        if (count == 1) {
            System.out.println("Nenhum livro foi avaliado ainda.");
        }
    }



    public static void emprestarLivro() {

        if (biblioteca.getListaLivros().isEmpty()) {
            System.out.println("Não há livros disponíveis para empréstimo no momento.");
            return;
        }

        System.out.println("\n===== Emprestar Livro =====");
        System.out.print("ID do Livro: ");
        int idLivro = scanner.nextInt();

        Livro livro = biblioteca.buscarLivroPorID(idLivro);

        if (livro != null) {
            biblioteca.emprestarLivro(livro, usuarioLogado); // Usando o usuário logado para emprestar o livro
        } else {
            System.out.println("Livro não encontrado.");
        }
    }

    public static void devolverLivro() {

        System.out.println("\n===== Devolver Livro =====");
        System.out.print("ID do Livro: ");
        int idLivro = scanner.nextInt();

        Livro livro = biblioteca.buscarLivroPorID(idLivro);

        if (livro != null) {
            biblioteca.devolverLivro(livro, usuarioLogado); // Usando o usuário logado para devolver o livro
            System.out.print("Deseja avaliar este livro? (0 a 5): ");
            int avaliacao = scanner.nextInt();
            livro.setAvaliacao(avaliacao);
            System.out.println("Obrigado pela sua avaliação!");
        } else {
            System.out.println("Livro não encontrado.");
        }
    }
    public static void imprimirHistoricoLeitura() {

        System.out.println("\n===== Histórico de Leitura do Usuário =====");
        System.out.println("Livros lidos por " + usuarioLogado.getNome() + ":");

        if (usuarioLogado.getLivrosEmprestados().isEmpty()) {
            System.out.println("O usuário ainda não leu nenhum livro.");
            return;
        }

        for (Livro livro : usuarioLogado.getLivrosEmprestados()) {
            System.out.println("Título: " + livro.getTitulo());
            System.out.println("ID: " + livro.getIdLivro());
            System.out.println("Gênero: " + livro.getCategoria().getNome());
            System.out.println("Status: " + (livro.isDisponivel() ? "Disponível" : "Indisponível"));
            System.out.println();
        }
    }



    public static void pesquisarLivroPorGenero() {
        System.out.println("\n===== Pesquisar Livro por Gênero =====");
        System.out.println("1. Administração");
        System.out.println("2. Direito");
        System.out.println("3. Computação");
        System.out.println("4. Medicina");
        System.out.println("5. Psicologia");
        System.out.println("6. Odontologia");
        System.out.print("Escolha um gênero: ");
        int opcaoGenero = scanner.nextInt();

        switch (opcaoGenero) {
            case 1:
                pesquisarLivroPorGenero("Administração");
                break;
            case 2:
                pesquisarLivroPorGenero("Direito");
                break;
            case 3:
                pesquisarLivroPorGenero("Computação");
                break;
            case 4:
                pesquisarLivroPorGenero("Medicina");
                break;
            case 5:
                pesquisarLivroPorGenero("Psicologia");
                break;
            case 6:
                pesquisarLivroPorGenero("Odontologia");
                break;
            default:
                System.out.println("Opção inválida. Por favor, escolha novamente.");
        }
    }

    public static void pesquisarLivroPorGenero(String genero) {
        System.out.println("\nLivros no gênero de " + genero + ":");
        for (Livro livro : biblioteca.getListaLivros()) {
            if (livro.getCategoria().getNome().equalsIgnoreCase(genero)) {
                System.out.println("Título: " + livro.getTitulo());
                System.out.println("Autor: " + livro.getAutor());
                System.out.println();
            }
        }
    }


    public static void imprimirHistoricoEmprestimos() {
        if (usuarioLogado == null) {
            System.out.println("É necessário fazer login primeiro.");
            return;
        }

        System.out.println("\n===== Histórico de Empréstimos de Livro =====");
        System.out.print("ID do Livro: ");
        int idLivro = scanner.nextInt();

        Livro livro = biblioteca.buscarLivroPorID(idLivro);

        if (livro != null) {
            biblioteca.imprimirHistoricoEmprestimos(livro);
        } else {
            System.out.println("Livro não encontrado.");
        }
    }



    public static void menuFuncionario() {
        System.out.println("\n===== Menu Funcionário =====");
        System.out.println("1. Fazer login");
        System.out.println("2. Cadastrar");
        System.out.println("3. Voltar");
        System.out.print("Escolha uma opção: ");
        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                fazerLoginFuncionario();
                break;
            case 2:
                cadastrarFuncionario();
                break;
            case 3:
                System.out.println("Voltando ao menu inicial...");
                break;
            default:
                System.out.println("Opção inválida. Por favor, escolha novamente.");
        }
    }

    public static void fazerLoginFuncionario() {
        System.out.println("\n===== Login de Funcionário =====");
        System.out.print("Senha: ");
        String senha = scanner.next();

        // Verificar o login de funcionário
        if (senha.equals("UNICAP2024")) {
            // Lógica para operações do funcionário logado...
            // Por enquanto, vamos apenas imprimir uma mensagem de sucesso
            System.out.println("Login de funcionário bem-sucedido!");
            menuOperacoesFuncionario();
        } else {
            System.out.println("Senha incorreta. Tente novamente.");
        }
    }

    

    public static void menuOperacoesFuncionario() {
        int opcao;
        // Loop principal do menu de operações do funcionário
        
           
        do {
            System.out.println("\n===== Menu de Operações do Funcionário =====");
            System.out.println("1. Adicionar Livro");
            System.out.println("2. Remover Livro");
            System.out.println("3. Atualizar Livro");
            System.out.println("4. Ver Histórico de Empréstimos");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    cadastrarLivro();
                    break;
                case 2:
                    removerLivro();
                    break;
                case 3:
                    atualizarLivro();
                    break;
                case 4:
                    verHistoricoEmprestimos();
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha novamente.");
            }
        } while (opcao != 5); // continua no loop
    }
        
    
        
    public static void cadastrarFuncionario() {
        // Implemente a lógica de cadastro de funcionário
        System.out.println("Favor entrar em contato com a direção.");
    }
}
