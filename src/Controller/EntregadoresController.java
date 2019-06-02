/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.Entregadores;
import View.Perfil;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Lara
 */
public class EntregadoresController implements ActionListener{
    
    Entregadores entrega;
    Perfil perf;
    
    public EntregadoresController(Entregadores entregadores, Perfil perfil){
        this.entrega=entregadores;
        this.perf=perfil;
        this.entrega.btnEu.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==entrega.btnEu){
            perf.setVisible(true);
        }
    }
    
}
