/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.Perfil;
import View.Solicitar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Lara
 */
public class SolicitarController implements ActionListener{
    Solicitar soli;
    Perfil perf;
    
    public SolicitarController(Solicitar solicitar, Perfil perfil){
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
