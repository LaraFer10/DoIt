/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.Perfil;
import model.ServicoBean;
import View.Solicitar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static javafx.scene.input.KeyCode.J;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextArea;
import model.Cliente;
import model.Empresa;
import model.ServicoDAO;

/**
 *
 * @author Lara
 */
public class SolicitarController implements ActionListener{
    Solicitar soli;
    Perfil perf;
    ServicoDAO serdao;
    
    public SolicitarController(Solicitar solicitar, Perfil perfil, ServicoBean servicoBean, Empresa empresaBean){
        this.perf=perfil;
        this.soli=solicitar;
       
        this.soli.btnEu.addActionListener(this);
        
        
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==soli.btnEu){
            perf.setVisible(true);
        }
    }
    
    
    
}
