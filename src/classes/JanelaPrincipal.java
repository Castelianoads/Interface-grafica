package classes;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class JanelaPrincipal extends JFrame {
    private JPanel panel;

    public JanelaPrincipal(String tituloDaJanela){
        JFrame janela = new JFrame(tituloDaJanela);
        panel = new JPanel();

        janela.add(panel);

        janela.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        janela.setBounds(50, 50, 500, 500);
        janela.setVisible(true);
        //panel.setLayout(null);
        janela.setResizable(false);

    }
    
}
