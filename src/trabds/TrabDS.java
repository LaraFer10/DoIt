/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabds;

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
       boolean con;
       Conexao.conectar();
       con = Conexao.estaConectado();
        if(con){
            System.out.println("conectou carai");
        }else{
            System.out.println("merda");
        }
        
        Cliente c = new Cliente();
        c.setIdade(18);
        c.setLocal("SãoMarcos");
        c.setNome("Julia Medeiros");
        c.addCliente(c);
        
    }
    
    
}
