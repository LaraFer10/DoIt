/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.Entregadores;
import View.Perfil;
import View.Servico;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.Cliente;
import model.Empresa;
import model.EmpresaDAO;
import model.ServicoBean;
import model.ServicoDAO;

/**
 *
 * @author Lara
 */
public class EntregadoresController implements ActionListener{
    
    Entregadores entrega;
    Perfil perf;
    ServicoDAO serdao;
    Cliente c;
    ServicoBean serv;
    
    
    public EntregadoresController(Entregadores entregadores, Perfil perfil, EmpresaDAO empresa, Cliente cliente, ServicoBean servico){
        this.entrega=entregadores;
        this.perf=perfil;
        this.c=cliente;
        this.serv=servico;
        this.entrega.btnEu.addActionListener(this);
        this.serdao=new ServicoDAO();
        
        
        
        for (int i = 0; i < empresa.buscarEntregador().size(); i++) {
            
            String lista ="\n"+empresa.buscarEntregador().get(i).getNome()+" - "+empresa.buscarEntregador().get(i).getEspecialidade()+
                            "\nContato: "+empresa.buscarEntregador().get(i).getContato()+"\nEndereço: "+empresa.buscarEntregador().get(i).getLocal()+
                            "\nCódigo: "+empresa.buscarEntregador().get(i).getCodigo()+"\n_______________________________________";
            entrega.jtaEntregadores.append(lista);
        }
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==entrega.btnEu){
            perf.setVisible(true);
        }else{
            if (ae.getSource()==entrega.btnSolicitar){
                serv.setEmpre_cod(Integer.parseInt(entrega.txfCodigo.getText()));
                serv.setCliente_cod(c.getCodigo());
                serv.setDescricao("Em andamento");
                serv.setPreco(14.50);
                serdao.addServico(serv);
            }
        }
    }
    
}
