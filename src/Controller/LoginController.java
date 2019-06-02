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
import model.ClienteDAO;

/**
 *
 * @author Lara
 */
public class LoginController implements ActionListener{
    ClienteDAO cdao;
    Login log;
    Cadastro cad;
    Perfil perf;
    
    public LoginController(Login login, Cadastro cadastro, Perfil perfil){
        this.log = login;
        this.cad = cadastro;
        this.perf = perfil;
        this.log.btnEntrar.addActionListener(this);
        this.log.btnCad.addActionListener(this);
        this.cdao = new ClienteDAO();
        
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == log.btnCad){
            cad.setVisible(true);
            CadController cc = new CadController(cad,log,perf);
        }
        
        if(ae.getSource() == log.btnEntrar){
            for (int i = 0; i < cdao.buscarClientes().size(); i++) {
            
                if(cdao.buscarClientes().get(i).getNome().equals(log.txtUser.getText()) && cdao.buscarClientes().get(i).getSenha().equals(log.txtSenha.getText())){
                 perf.setVisible(true);

                }
             }
        }
    }
    
}
