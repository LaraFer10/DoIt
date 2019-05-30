/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import conexao_banco.Conexao;



/**
 *
 * @author Lara
 */
public class TrabDS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       Conexao.conectar();
       
        ClienteDAO cdao = new ClienteDAO();
        Cliente c = new Cliente();
        c.setNome("Victor Rosado");
        c.setIdade(18);
        c.setLocal("Barros Reis");
        cdao.addCliente(c);
        cdao.listarClientes();
        
    }
    
    
}
