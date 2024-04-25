import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI {

    private static JFrame frame;
    private static JPanel panel;
    private static CardLayout cardLayout;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            createAndShowGUI();
        });
    }

    private static void createAndShowGUI() {
        frame = new JFrame("Biblioteca App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        panel = new JPanel();
        cardLayout = new CardLayout();
        panel.setLayout(cardLayout);

        // Crie e adicione painéis para cada menu
        panel.add(createMenuInicialPanel(), "MenuInicial");
        panel.add(createMenuUsuarioPanel(), "MenuUsuario");
        panel.add(createMenuFuncionarioPanel(), "MenuFuncionario");

        cardLayout.show(panel, "MenuInicial");

        frame.add(panel);
        frame.setVisible(true);
    }

    private static JPanel createMenuInicialPanel() {
        JPanel menuInicialPanel = new JPanel();
        menuInicialPanel.setLayout(new BorderLayout());

        JLabel titleLabel = new JLabel("===== Menu Inicial =====");
        menuInicialPanel.add(titleLabel, BorderLayout.NORTH);

        JButton alunoButton = new JButton("Sou Aluno");
        alunoButton.addActionListener(e -> cardLayout.show(panel, "MenuUsuario"));
        menuInicialPanel.add(alunoButton, BorderLayout.CENTER);

        JButton funcionarioButton = new JButton("Sou Funcionário");
        funcionarioButton.addActionListener(e -> cardLayout.show(panel, "MenuFuncionario"));
        menuInicialPanel.add(funcionarioButton, BorderLayout.SOUTH);

        return menuInicialPanel;
    }

    private static JPanel createMenuUsuarioPanel() {
        JPanel menuUsuarioPanel = new JPanel();
        menuUsuarioPanel.setLayout(new BorderLayout());

        JLabel titleLabel = new JLabel("===== Menu Aluno =====");
        menuUsuarioPanel.add(titleLabel, BorderLayout.NORTH);

        // Adicione botões de login e cadastro aqui

        return menuUsuarioPanel;
    }

    private static JPanel createMenuFuncionarioPanel() {
        JPanel menuFuncionarioPanel = new JPanel();
        menuFuncionarioPanel.setLayout(new BorderLayout());

        JLabel titleLabel = new JLabel("===== Menu Funcionário =====");
        menuFuncionarioPanel.add(titleLabel, BorderLayout.NORTH);

        // Adicione botões específicos para funcionários aqui

        return menuFuncionarioPanel;
    }
}
