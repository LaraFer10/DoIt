/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.Historico;
import View.Perfil;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Lara
 */
public class HistoricoController implements ActionListener{
    
    Historico hist;
    Perfil perf;
    
    public HistoricoController(Historico historico, Perfil perfil){
        this.hist=historico;
        this.perf = perfil;
        hist.btnEu.addActionListener(this);
    }
    

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == hist.btnEu){
            perf.setVisible(true);
        }
    }
    
}
