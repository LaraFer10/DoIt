
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
import java.util.ArrayList;
import javax.swing.JOptionPane;



/**
 *
 * @author Lara
 */
public class ClienteDAO {


    public void addCliente(Cliente cli){
       
        String script = "INSERT INTO cliente (Nome, Idade, Endereco, Senha) VALUES(?, ?, ?, ?);";
        try {

            Conexao.pstmt = Conexao.conexao.prepareStatement(script);
            
            Conexao.pstmt.setString(1, cli.getNome());
            Conexao.pstmt.setInt(2, cli.getIdade());
            Conexao.pstmt.setString(3, cli.getLocal());
            Conexao.pstmt.setString(4, cli.getSenha());
            Conexao.pstmt.executeUpdate();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR - Inserir dados: "+e.getMessage());
        }
        
            
    }
  
    public ArrayList<Cliente> buscarLogin_Clientes(){
        String query = "select Nome, Senha from cliente;";
        Cliente c = new Cliente();
        ArrayList <Cliente> cli = new ArrayList();
        try {
            PreparedStatement declaracao = Conexao.conexao.prepareStatement(query);
            Conexao.resultado = declaracao.executeQuery();
            
            while (Conexao.resultado.next()) {
                c.setNome(Conexao.resultado.getString("Nome"));
                c.setSenha(Conexao.resultado.getString("Senha"));
                cli.add(c);
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR NO MYSQL: "+e.getMessage());
        }
        return cli;
    }
    public ArrayList<Cliente> buscarCliente(){
        String query = "select * from cliente;";
        Cliente c = new Cliente();
        ArrayList <Cliente> cli = new ArrayList();
        try {
            PreparedStatement declaracao = Conexao.conexao.prepareStatement(query);
            Conexao.resultado = declaracao.executeQuery();
            
            while (Conexao.resultado.next()) {
                c.setCodigo(Conexao.resultado.getInt("Codigo"));
                c.setNome(Conexao.resultado.getString("Nome"));
                c.setIdade(Conexao.resultado.getInt("Idade"));
                c.setLocal(Conexao.resultado.getString("Endereco"));
                c.setSenha(Conexao.resultado.getString("Senha"));
                cli.add(c);
            }
           
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR NO MYSQL ao pegar todos os dados do cliente: "+e.getMessage());
        }
        return cli;
    }
    
    

    
    
}
