/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.Historico;
import View.Login;
import View.Perfil;
import View.Servico;
import View.Solicitar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Lara
 */
public class PerfilController implements ActionListener{
    
    Perfil perf;
    Servico serv;
    Historico hist;
    Solicitar solic;
    Login log;
    
    public PerfilController(Perfil perfil, Servico servico, Historico historico, Solicitar solicitar, Login log){
        this.perf = perfil;
        this.serv = servico;
        this.hist = historico;
        this.solic = solicitar;
        this.log = log;
        perf.btnHistorico.addActionListener(this);
        perf.btnServico.addActionListener(this);
        perf.btnSolicitacao.addActionListener(this);
        perf.btnSair.addActionListener(this);
    }
    
    

    

    @Override
    public void actionPerformed(ActionEvent ae) {
        
       if(ae.getSource() == perf.btnServico){
           serv.setVisible(true);
       }else{
           if (ae.getSource() == perf.btnHistorico){
               hist.setVisible(true);
           }else{
               if(ae.getSource() == perf.btnSolicitacao){
                   solic.setVisible(true);
               }else{
                   if(ae.getSource()== perf.btnSair){
                       log.setVisible(true);
                   }
               }
           }
       }
    }
    
}
