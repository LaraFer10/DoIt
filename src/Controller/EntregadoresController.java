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
import model.Empresa;
import model.ServicoDAO;

/**
 *
 * @author Lara
 */
public class EntregadoresController implements ActionListener{
    
    Entregadores entrega;
    Perfil perf;
    ServicoDAO serdao;
    public EntregadoresController(Entregadores entregadores, Perfil perfil, Empresa empresa){
        this.entrega=entregadores;
        this.perf=perfil;
        this.entrega.btnEu.addActionListener(this);
        entrega.btnSolicitar.addActionListener(this);
        entrega.lblNome.setText(empresa.getNome());
        entrega.lblContato.setText("Contato: "+empresa.getContato());
        entrega.lblEnd.setText(empresa.getLocal());
        entrega.lblEspec.setText(empresa.getEspecialidade());
        this.serdao=new ServicoDAO();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==entrega.btnEu){
            perf.setVisible(true);
        }else{
            if (ae.getSource()==entrega.btnSolicitar){
                
            }
        }
    }
    
}
