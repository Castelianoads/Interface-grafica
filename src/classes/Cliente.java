package classes;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Cliente extends JFrame{
   
    JTextField campoNome;

	JanelaPrincipal janelaCliente = new JanelaPrincipal("Cadastro de clientes");
    JPanel panelCliente = new JPanel();

    public Cliente (){
        janelaCliente.add(panelCliente);
        panelCliente.setSize(50, 50);
        panelCliente.setVisible(true);
    }

   // panelCliente.setSize(20,20);
    //campoNome.setBounds(20,20,20,20);



    
    
}
