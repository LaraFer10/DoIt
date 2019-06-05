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
import model.Empresa;

/**
 *
 * @author Lara
 */
public class ProfessoresController implements ActionListener{
    Professores prof;
    Perfil perf;
    
    public ProfessoresController(Professores professores, Perfil perfil, Empresa empresa){
        this.perf=perfil;
        this.prof=professores;
        prof.btnEu.addActionListener(this);
        prof.btnSolicitar.addActionListener(this);
        prof.lblNome.setText(empresa.getNome());
        prof.lblContato.setText("Contato: "+empresa.getContato());
        prof.lblEnd.setText(empresa.getLocal());
        prof.lblEsp.setText(empresa.getEspecialidade());
        
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==prof.btnEu){
            perf.setVisible(true);
        }
    }
    
}
