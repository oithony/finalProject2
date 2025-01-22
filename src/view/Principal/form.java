package view.Principal;

import view.CadastroDeAluno.CadastroDeAluno;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class form extends JFrame {
    public JMenuBar menuBar = new JMenuBar();
    public JPanel JpanePrincipal;
    private JTextField textField1;
    private JButton enviarButton;

    public form() {
        enviarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                    String texto = textField1.getText();
                    JOptionPane.showInputDialog(null, texto);
                    ;
                }

        });
    }

    public void criacaoDoMenu(){

        this.setTitle("teste");
        this.setContentPane(JpanePrincipal);
        this.setSize(1920, 1080);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setJMenuBar(menuBar);
        JMenu arquivo = new JMenu("Arquivo");
        JMenuItem opcao1 = new JMenuItem("Opção 1");
        JMenuItem opcao2 = new JMenuItem("Opção 2");
        arquivo.add(opcao1);
        arquivo.add(opcao2);
        JMenu manterAluno = new JMenu("Manter Alunos");
        JMenuItem cadastro = new JMenuItem("Cadastrar");
        JMenuItem editar = new JMenuItem("Edição");
        manterAluno.add(cadastro);
        manterAluno.add(editar);
        JMenu add = menuBar.add(arquivo);
        menuBar.add(manterAluno);
        cadastro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new CadastroDeAluno();
            }
        });
    }
}
