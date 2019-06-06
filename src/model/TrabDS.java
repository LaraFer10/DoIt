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
import java.util.ArrayList;



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
       
       //Metodos DAO e Bean
       Cliente c = new Cliente();
       ServicoBean sevBean = new ServicoBean();
       Empresa empBean = new Empresa();
       Empresa empTec = new Empresa();
       Empresa empProf = new Empresa();
       Empresa empEntrega = new Empresa();
       ClienteDAO cdao = new ClienteDAO();
       EmpresaDAO empredao = new EmpresaDAO();
        
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

        LoginController lc = new LoginController(log, cad, perf);
        int i = lc.levaNome();
        
        c.setCodigo(cdao.buscarCliente().get(i).getCodigo());
        c.setNome(cdao.buscarCliente().get(i).getNome());
        c.setIdade(cdao.buscarCliente().get(i).getIdade());
        c.setLocal(cdao.buscarCliente().get(i).getLocal());
        c.setSenha(cdao.buscarCliente().get(i).getSenha());
        
        empTec.setCodigo(empredao.buscarTecnico().get(i).getCodigo());
        empTec.setNome(empredao.buscarTecnico().get(i).getNome());
        empTec.setArea(empredao.buscarTecnico().get(i).getArea());
        empTec.setEspecialidade(empredao.buscarTecnico().get(i).getEspecialidade());
        empTec.setLocal(empredao.buscarTecnico().get(i).getLocal());
        empTec.setContato(empredao.buscarTecnico().get(i).getContato());
        
        empProf.setCodigo(empredao.buscarProfessor().get(i).getCodigo());
        empProf.setNome(empredao.buscarProfessor().get(i).getNome());
        empProf.setArea(empredao.buscarProfessor().get(i).getArea());
        empProf.setEspecialidade(empredao.buscarProfessor().get(i).getEspecialidade());
        empProf.setLocal(empredao.buscarProfessor().get(i).getLocal());
        empProf.setContato(empredao.buscarProfessor().get(i).getContato());
        
        empEntrega.setCodigo(empredao.buscarEntregador().get(i).getCodigo());
        empEntrega.setNome(empredao.buscarEntregador().get(i).getNome());
        empEntrega.setArea(empredao.buscarEntregador().get(i).getArea());
        empEntrega.setEspecialidade(empredao.buscarEntregador().get(i).getEspecialidade());
        empEntrega.setLocal(empredao.buscarEntregador().get(i).getLocal());
        empEntrega.setContato(empredao.buscarEntregador().get(i).getContato());
        
        PerfilController pc = new PerfilController(perf,serv, hist, solic, log,c);
        ServController sc = new ServController(serv, perf, tec, prof, entrega);
        CadController cc = new CadController(cad, log, perf, c);
        HistoricoController hc = new HistoricoController(hist, perf);
        ProfessoresController profc = new ProfessoresController(prof, perf, empredao, c, sevBean);
        SolicitarController solicc = new SolicitarController(solic, perf, sevBean, empBean);
       
        TecnicosController tc = new TecnicosController(tec, perf, empredao, sevBean, c);
        EntregadoresController ec =new EntregadoresController(entrega, perf, empredao, c, sevBean);
        
        
    }
    
    
}
