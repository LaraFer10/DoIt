/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.bean;

import java.util.ArrayList;

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

    public void setServicos(ArrayList<Servico> Servicos) {
        this.Servicos = Servicos;
    }
    
}
