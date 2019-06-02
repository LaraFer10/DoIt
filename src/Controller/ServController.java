/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.Entregadores;
import View.Perfil;
import View.Professores;
import View.Servico;
import View.Tecnicos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Lara
 */
public class ServController implements ActionListener{

    Servico serv;
    Perfil perf;
    Tecnicos tec;
    Professores prof;
    Entregadores entrega;
    public ServController(Servico servico, Perfil perfil, Tecnicos tec, Professores prof, Entregadores entr){
        this.serv = servico;
        this.perf = perfil;
        this.entrega=entr;
        this.prof=prof;
        this.tec=tec;
        this.serv.btnEu.addActionListener(this);
        this.serv.btnEntrega.addActionListener(this);
        this.serv.btnProf.addActionListener(this);
        this.serv.btnTecnico.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
       if(ae.getSource() == serv.btnEu){
           perf.setVisible(true);
       }else{
           if(ae.getSource()== serv.btnTecnico){
               this.entrega.setVisible(true);
           }else{
               if(ae.getSource()== serv.btnProf){
                   prof.setVisible(true);
               }else{
                   if(ae.getSource()== serv.btnEntrega){
                       entrega.setVisible(true);
                   }
               }
           }
       }
    }
    
}
