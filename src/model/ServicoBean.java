/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Lara
 */
public class ServicoBean {
    private int codigo;
    private int empre_cod;
    private int cliente_cod;
    private String status;
    private double preco;

    public int getCliente_cod() {
        return cliente_cod;
    }

    public void setCliente_cod(int cliente_cod) {
        this.cliente_cod = cliente_cod;
    }

    
    public int getEmpre_cod() {
        return empre_cod;
    }

    public void setEmpre_cod(int empre_cod) {
        this.empre_cod = empre_cod;
    }

    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }


    public String getDescricao() {
        return status;
    }

    public void setDescricao(String status) {
        this.status = status;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    
}
