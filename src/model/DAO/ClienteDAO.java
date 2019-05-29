/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.DAO;

import conexao_banco.Conexao;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.bean.Cliente;

/**
 *
 * @author Lara
 */
public class ClienteDAO {
    private int codigo;
    private String nome;
    private int idade;
    private String local;
    private ArrayList<ServicoDAO> Servicos;
    
    private Connection conexao = null;
    private Statement declaracao = null;
    private ResultSet resultado = null;
    
    public void addCliente(Cliente c){
       conexao = Conexao.conectar();
        try {
            String query = "INSERT INTO cliente (Nome, Codigo, Idade, Endereco) values('"+c.getNome()+"',"+c.getIdade()+",'"+c.getLocal()+"';";
            this.declaracao.executeUpdate(query);
        } catch (Exception e) {
            System.out.println("Error: "+e.getMessage());
        }
        
            
    }
    
    public ClienteDAO(){
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

    public ArrayList<ServicoDAO> getServicos() {
        return Servicos;
    }

    public void setServicos(ServicoDAO Servicos) {
        this.Servicos.add(Servicos);
    }
    
    
}
