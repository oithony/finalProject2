package view.CadastroDeAluno;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CadastroDeUsuario extends JFrame{
    private JPanel jpanelPrincipal;
    private JTextField textFieldNome;
    private JPanel Principal;
    private JLabel jLabelTitulo;
    private JLabel jLabelNome;
    private JButton buttonEnviar;
    private JTextField textFieldIdade;
    private JLabel jLabelIdade;

    public CadastroDeUsuario(){
        this.setTitle("Sistema - Escola nova CB");
        this.setContentPane(jpanelPrincipal);
        this.setSize(1920,1080);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setVisible(true);
        buttonEnviar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String texto = textFieldNome.getText();
                JOptionPane.showMessageDialog(null,texto);
            }
        });
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
