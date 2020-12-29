package classes;

import java.awt.Color;

import javax.swing.JTextField;

public class Cadastro {
    //JTextField cliente;
    JTextField botaoFuncionario;
    
    JanelaPrincipal janelaCliente = new JanelaPrincipal("Cadastro");
    
    public Cadastro(){
        JTextField cliente = new JTextField();
        
        cliente.setSize(20, 20);
        cliente.setVisible(true);
        janelaCliente.add(cliente);
    }
}
