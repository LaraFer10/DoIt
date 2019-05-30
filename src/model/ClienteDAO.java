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
public class ClienteDAO {
    public ClienteDAO(){
      Conexao.conexao = Conexao.conectar();
    }   
    public void addCliente(Cliente cli){
       
        String script = "INSERT INTO cliente (Nome, Idade, Endereco) VALUES(?, ?, ?);";
        try {
            Conexao.ps = Conexao.conexao.prepareStatement(script);
            
            Conexao.ps.setString(1, cli.getNome());
            Conexao.ps.setInt(2, cli.getIdade());
            Conexao.ps.setString(3, cli.getLocal());
            System.out.println(script);
            Conexao.ps.executeUpdate();
           
            
        } catch (Exception e) {
            System.out.println("ERROR - Inserir dados: "+e.getMessage());
        }
        
            
    }
    public void listarClientes(){
        String query = "select * from cliente;";
        
        try {
            Conexao.ps = Conexao.conexao.prepareStatement(query);
            Conexao.rs = Conexao.ps.executeQuery();
            
            while (Conexao.rs.next()) {
                System.out.println("Codigo: "+Conexao.rs.getInt("Codigo")+"\nNome: "+Conexao.rs.getString("Nome")+
                        "\nIdade: "+Conexao.rs.getInt("Idade")+"Endereço: "+Conexao.rs.getString("Endereco"));
            }
            
        } catch (Exception e) {
            System.out.println("ERROR MYSQL: "+e.getMessage());
        }
        
    }
    

    
    
}
