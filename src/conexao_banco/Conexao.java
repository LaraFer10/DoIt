/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexao_banco;

/**
 *
 * @author Lara
 */
import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;

/**
 *
 * @author Lara
 */
public class Conexao {
    static String servidor ="jdbc:mysql://localhost:3306/doit?useTimezone=true&serverTimezone=UTC";
    static String usuario = "root";
    static String senha = "Ferreira123";
    static String driver = "com.mysql.cj.jdbc.Driver";
    
    private static Connection conexao = null;
    private static Statement declaracao = null;
   
    public static Connection conectar(){
        try {
         Class.forName(driver);
         Conexao.conexao = (Connection)DriverManager.getConnection(servidor, usuario, senha);
         Conexao.declaracao = (Statement) Conexao.conexao.createStatement();
        } catch (Exception e) {
            System.out.println("ERROR: "+e.getMessage());
        }
        return null;
    }
    
            
    public static boolean estaConectado(){
        if(Conexao.conexao != null){
            return true;
        } else {
            return false;
        }
    }
    
}

