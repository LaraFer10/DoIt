/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.Cadastro;
import View.Login;
import View.Perfil;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import model.Cliente;
import model.ClienteDAO;

/**
 *
 * @author Lara
 */
public class CadController implements ActionListener{
    ClienteDAO cdao;
    Cadastro cad;
    Login log;
    Perfil perf;
    
    public CadController(Cadastro cadastro, Login login, Perfil perfil){
       this.cad = cadastro;
       this.log = login;
       this.perf = perfil;
       this.cad.btnSalvar.addActionListener(this);
       this.cad.btnCancelar.addActionListener(this);
       this.cdao = new ClienteDAO();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == cad.btnSalvar){
            Cliente c = new Cliente();
            c.setNome(cad.txtNome.getText());
            c.setSenha(cad.txtSenha.getText());
            c.setIdade(Integer.parseInt(cad.txtIdade.getText()));
            if(c.getIdade()<18){
                JOptionPane.showMessageDialog(null, "Você precisa ter a partir de 18 anos para usar o Programa :(");
            }
            c.setLocal(cad.txtEnd.getText());
            cdao.addCliente(c);
            JOptionPane.showMessageDialog(null, "Dados salvos com sucesso!");
        }
        if(ae.getSource() == cad.btnCancelar){
            log.setVisible(true);
            LoginController lc = new LoginController(log, cad, perf);
        }
    }
    
}
