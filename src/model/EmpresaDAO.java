/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import conexao_banco.Conexao;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Lara
 */
public class EmpresaDAO {
    
    
    
    public ArrayList<Empresa> buscarTecnico(){
        String query = "select * from empresa where Area = 'Tecnico';";
        Empresa e = new Empresa();
        ArrayList <Empresa> empresa = new ArrayList();
        try {
            PreparedStatement declaracao = Conexao.conexao.prepareStatement(query);
            Conexao.resultado = declaracao.executeQuery();
            
            while (Conexao.resultado.next()) {
                e.setCodigo(Conexao.resultado.getInt("Codigo"));
                e.setNome(Conexao.resultado.getString("Nome"));
                e.setEspecialidade(Conexao.resultado.getString("Especialidade"));
                e.setLocal(Conexao.resultado.getString("Endereco"));
                e.setContato(Conexao.resultado.getString("Contato"));
                empresa.add(e);
            }
           
        }catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "ERROR NO MYSQL: "+ex.getMessage());
        }
        return empresa;
    }
    
    public ArrayList<Empresa> buscarProfessor(){
        String query = "select * from empresa where Area = 'Professor';";
        Empresa e = new Empresa();
        ArrayList <Empresa> empresa = new ArrayList();
        try {
            PreparedStatement declaracao = Conexao.conexao.prepareStatement(query);
            Conexao.resultado = declaracao.executeQuery();
            
            while (Conexao.resultado.next()) {
                e.setCodigo(Conexao.resultado.getInt("Codigo"));
                e.setNome(Conexao.resultado.getString("Nome"));
                e.setEspecialidade(Conexao.resultado.getString("Especialidade"));
                e.setLocal(Conexao.resultado.getString("Endereco"));
                e.setContato(Conexao.resultado.getString("Contato"));
                e.setArea(Conexao.resultado.getString("Area"));
                empresa.add(e);
            }
           
        }catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "ERROR NO MYSQL: "+ex.getMessage());
        }
        return empresa;
    }
    
    public ArrayList<Empresa> buscarEntregador(){
        String query = "select * from empresa where Area = 'Entregas';";
        Empresa e = new Empresa();
        ArrayList <Empresa> empresa = new ArrayList();
        try {
            PreparedStatement declaracao = Conexao.conexao.prepareStatement(query);
            Conexao.resultado = declaracao.executeQuery();
            
            while (Conexao.resultado.next()) {
                e.setCodigo(Conexao.resultado.getInt("Codigo"));
                e.setNome(Conexao.resultado.getString("Nome"));
                e.setEspecialidade(Conexao.resultado.getString("Especialidade"));
                e.setLocal(Conexao.resultado.getString("Endereco"));
                e.setContato(Conexao.resultado.getString("Contato"));
                e.setArea(Conexao.resultado.getString("Area"));
                empresa.add(e);
            }
           
        }catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "ERROR NO MYSQL: "+ex.getMessage());
        }
        return empresa;
    }
    
    
    
}
