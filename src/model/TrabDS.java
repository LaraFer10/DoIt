/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import Controller.CadController;
import Controller.EntregadoresController;
import Controller.HistoricoController;
import Controller.LoginController;
import Controller.PerfilController;
import Controller.ProfessoresController;
import Controller.ServController;
import Controller.SolicitarController;
import Controller.TecnicosController;
import View.Cadastro;
import View.Entregadores;
import View.Historico;
import View.Login;
import View.Perfil;
import View.Professores;
import View.Servico;
import View.Solicitar;
import View.Tecnicos;
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
       
        
        //TELAS INSTANCIADAS
        Entregadores entrega = new Entregadores();
        Tecnicos tec = new Tecnicos();
        Professores prof = new Professores();
        Perfil perf = new Perfil();
        Login log = new Login();
        Cadastro cad = new Cadastro();
        Servico serv = new Servico();
        Solicitar solic = new Solicitar();
        Historico hist = new Historico();
        entrega.setVisible(true);
        tec.setVisible(true);
        prof.setVisible(true);
        hist.setVisible(true);
        solic.setVisible(true);
        serv.setVisible(true);
        perf.setVisible(true);
        cad.setVisible(true);
        log.setVisible(true);
        
        //TAMANHO DAS TELAS
        
        perf.setSize(400, 550);
        log.setSize(400, 550);
        cad.setSize(400, 550);
        serv.setSize(400, 550);
        solic.setSize(400, 550);
        tec.setSize(400, 550);
        entrega.setSize(400, 550);
        prof.setSize(400, 550);
        hist.setSize(400, 550);
        
        //CONTROLLER INSTANCIADO
        ServController sc = new ServController(serv, perf, tec, prof, entrega);
        PerfilController pc = new PerfilController(perf,serv, hist, solic, log);
        LoginController lc = new LoginController(log, cad, perf);
        CadController cc = new CadController(cad, log, perf);
        HistoricoController hc = new HistoricoController(hist, perf);
        ProfessoresController profc = new ProfessoresController(prof, perf);
        SolicitarController solicc = new SolicitarController(solic, perf);
        TecnicosController tc = new TecnicosController(tec, perf);
        EntregadoresController ec =new EntregadoresController(entrega, perf);
        
        
    }
    
    
}
