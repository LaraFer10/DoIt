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
import model.Cliente;
import model.Empresa;
import model.EmpresaDAO;
import model.ServicoBean;
import model.ServicoDAO;

/**
 *
 * @author Lara
 */
public class TecnicosController implements ActionListener{
    
    Tecnicos tec;
    Perfil perf;
    ServicoBean serv;
    ServicoDAO serdao;
    Cliente c;
    
    public TecnicosController(Tecnicos tecnico, Perfil perfil, EmpresaDAO empresa, ServicoBean servico, Cliente cliente){
        this.perf=perfil;
        this.tec=tecnico;
        this.serv=servico;
        this.c=cliente;
        this.serdao=new ServicoDAO();
        tec.btnEu.addActionListener(this);
        tec.btnSolicita1.addActionListener(this);
        for (int i = 0; i < empresa.buscarTecnico().size(); i++) {
            tec.jtaTecnicos.setText(empresa.buscarTecnico().get(i).getNome()+" - "+empresa.buscarTecnico().get(i).getEspecialidade()+
                            "\nContato: "+empresa.buscarTecnico().get(i).getContato()+"   Endereço: "+empresa.buscarTecnico().get(i).getLocal()+
                            "\nCódigo: "+empresa.buscarTecnico().get(i).getCodigo()+"\n\n_______________________________________");
        }
       
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==tec.btnEu){
            perf.setVisible(true);
        }else{
            if(ae.getSource()==tec.btnSolicita1){
                serv.setEmpre_cod(Integer.parseInt(tec.jtfCodigo.getText()));
                serv.setCliente_cod(c.getCodigo());
                serv.setDescricao("Em andamento");
                serv.setPreco(14.50);
                serdao.addServico(serv);
            }
        }
    }
    
}
