/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.Perfil;
import View.Professores;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Lara
 */
public class ProfessoresController implements ActionListener{
    Professores prof;
    Perfil perf;
    
    public ProfessoresController(Professores professores, Perfil perfil){
        this.perf=perfil;
        this.prof=professores;
        prof.btnEu.addActionListener(this);
        prof.btnSolicitar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==prof.btnEu){
            perf.setVisible(true);
        }
    }
    
}
