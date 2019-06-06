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
import model.Cliente;
import model.Empresa;
import model.EmpresaDAO;
import model.ServicoBean;
import model.ServicoDAO;

/**
 *
 * @author Lara
 */
public class ProfessoresController implements ActionListener{
    Professores prof;
    Perfil perf;
    ServicoDAO serdao;
    Cliente c;
    ServicoBean serv;
    
    public ProfessoresController(Professores professores, Perfil perfil, EmpresaDAO empresa, Cliente cliente, ServicoBean servico){
        this.perf=perfil;
        this.prof=professores;
        this.c=cliente;
        this.serv=servico;
        this.serdao= new ServicoDAO();
        prof.btnEu.addActionListener(this);
        prof.btnSolicitar.addActionListener(this);
       for (int i = 0; i < empresa.buscarEntregador().size(); i++) {
            
            String lista ="\n"+empresa.buscarProfessor().get(i).getNome()+" - "+empresa.buscarProfessor().get(i).getEspecialidade()+
                            "\nContato: "+empresa.buscarProfessor().get(i).getContato()+"\nEndereço: "+empresa.buscarProfessor().get(i).getLocal()+
                            "\nCódigo: "+empresa.buscarProfessor().get(i).getCodigo()+"\n_______________________________________";
            prof.txtaProfessores.append(lista);
        }
        
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==prof.btnEu){
            perf.setVisible(true);
        }else{
            if (ae.getSource()==prof.btnSolicitar){
                serv.setEmpre_cod(Integer.parseInt(prof.txtfCodigo.getText()));
                serv.setCliente_cod(c.getCodigo());
                serv.setDescricao("Em andamento");
                serv.setPreco(14.50);
                serdao.addServico(serv);
            }
        }
    }
    
}
