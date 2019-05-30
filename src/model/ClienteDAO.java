/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import conexao_banco.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;




/**
 *
 * @author Lara
 */
public class ClienteDAO {
   
    
    private Connection conexao = null;
    private Statement declaracao = null;
    private ResultSet resultado = null;
    
    
    public void addCliente(Cliente cli){
       
        String script = "INSERT INTO cliente (Nome, Idade, Endereco) VALUES(?, ?, ?);";
        try {
            PreparedStatement stmt = conexao.prepareStatement(script);
            
            stmt.setString(1, cli.getNome());
            stmt.setInt(2, cli.getIdade());
            stmt.setString(3, cli.getLocal());
            System.out.println(script);
            stmt.executeUpdate();
           
            
        } catch (Exception e) {
            System.out.println("ERROR - Inserir dados: "+e.getMessage());
        }
        
            
    }
    public void listarClientes(){
        String query = "select * from cliente;";
        
        try {
            PreparedStatement declaracao = conexao.prepareStatement(query);
            resultado = declaracao.executeQuery();
            
            while (resultado.next()) {
                System.out.println("Codigo: "+resultado.getInt("Codigo")+"\nNome: "+resultado.getString("Nome")+
                        "\nIdade: "+resultado.getInt("Idade")+"Endereço: "+resultado.getString("Endereco"));
            }
            
        } catch (Exception e) {
            System.out.println("ERROR MYSQL: "+e.getMessage());
        }
        
    }
    

    
    
}
