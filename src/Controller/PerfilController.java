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
import conexao_banco.Conexao;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import model.Cliente;
import model.ClienteDAO;

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
    ClienteDAO cdao;
    Cliente c;
    
    public PerfilController(Perfil perfil, Servico servico, Historico historico, Solicitar solicitar, Login log, Cliente cliente){
        this.perf = perfil;
        this.serv = servico;
        this.hist = historico;
        this.solic = solicitar;
        this.log = log;
        this.c=cliente;
        this.cdao= new ClienteDAO();
        perf.btnHistorico.addActionListener(this);
        perf.btnServico.addActionListener(this);
        perf.btnSolicitacao.addActionListener(this);
        perf.btnSair.addActionListener(this);
        
        perf.lblOla.setText("Olá, "+c.getNome()+"!");
        
        perf.lblInfo.setText(""+c.getIdade()+" - "+c.getLocal());
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
