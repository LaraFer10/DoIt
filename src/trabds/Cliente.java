/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabds;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lara
 */
public class Cliente {
    private int codigo;
    private String nome;
    private int idade;
    private String local;
    private ArrayList<Servico> Servicos;
    
    private Connection conexao = null;
    private Statement declaracao = null;
    private ResultSet resultado = null;
    
    public void addCliente(String Nome, int Idade, String Local){
        try {
            String query = "insert into cliente (Nome, Idade, Endereco) values('"+Nome+"',"+Idade+",'"+Local+"';";
            this.declaracao.executeUpdate(query);
        } catch (Exception e) {
            System.out.println("Error: "+e.getMessage());
        }
        
            
    }
    
    public Cliente(){
        this.Servicos = new ArrayList<>();
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public ArrayList<Servico> getServicos() {
        return Servicos;
    }

    public void setServicos(Servico Servicos) {
        this.Servicos.add(Servicos);
    }
    
    
}
