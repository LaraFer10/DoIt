/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.Perfil;
import View.Tecnicos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Lara
 */
public class TecnicosController implements ActionListener{
    
    Tecnicos tec;
    Perfil perf;
    
    public TecnicosController(Tecnicos tecnico, Perfil perfil){
        this.perf=perfil;
        this.tec=tecnico;
        tec.btnEu.addActionListener(this);
        tec.btnSolicita1.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==tec.btnEu){
            perf.setVisible(true);
        }
    }
    
}
