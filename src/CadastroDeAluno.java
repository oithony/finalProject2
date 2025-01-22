import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CadastroDeAluno extends JFrame{
    private JPanel jpanelPrincipal;
    private JPanel Principal;
    private JLabel jLabelTitulo;
    private JLabel jLabelNome;
    private JTextField textFieldNome;
    private JButton buttonEnviar;
    private JLabel jLabelIdade;
    private JTextField textFieldIdade;

    public CadastroDeAluno(){
        this.setTitle("Sistema - Escola nova CB");
        this.setContentPane(jpanelPrincipal);
        this.setSize(640,480);
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
