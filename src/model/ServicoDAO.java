/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import conexao_banco.Conexao;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Lara
 */
public class ServicoDAO {
    
    public void addServico(ServicoBean servico){
       
        String script = "INSERT INTO servico (Preco, Empre_cod, Cliente_cod) VALUES(?, ?, ?);";
        try {
            Conexao.pstmt = Conexao.conexao.prepareStatement(script);
            
            Conexao.pstmt.setDouble(1, servico.getPreco());
            Conexao.pstmt.setInt(2, servico.getEmpre_cod());
            Conexao.pstmt.setInt(3, servico.getCliente_cod());
            Conexao.pstmt.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR - Inserir dados: "+e.getMessage());
        }
        
            
    }
    
    public ArrayList<ServicoBean> buscarServico(Cliente c){
        String query = "select cliente.* from cliente, servico where cliente.Codigo=servico.Cliente_cod and cliente.Codigo="+c.getCodigo();
        ServicoBean s = new ServicoBean();
        ArrayList <ServicoBean> serv = new ArrayList();
        try {
            PreparedStatement declaracao = Conexao.conexao.prepareStatement(query);
            Conexao.resultado = declaracao.executeQuery();
            
            while(Conexao.resultado.next()){
                s.setCodigo(Conexao.resultado.getInt("Codigo"));
                s.setPreco(Conexao.resultado.getDouble("Preco"));
                s.setEmpre_cod(Conexao.resultado.getInt("Empre_cod"));
                s.setCliente_cod(Conexao.resultado.getInt("Cliente_cod"));
                s.setDescricao(Conexao.resultado.getString("Status"));
                serv.add(s);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR NO MYSQL: "+e.getMessage());
        }
        return serv;
    }
    
    
}
