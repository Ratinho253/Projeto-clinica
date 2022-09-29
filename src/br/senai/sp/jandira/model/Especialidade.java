package br.senai.sp.jandira.model;

import javax.swing.JOptionPane;

public class Especialidade {

    private  static int contador = 99;
    private String nome;
    private String descricao;
    private Integer codigo;

//	Construtores da classe
    public Especialidade(String nome) {
        this.nome = nome;
        this.contador++;
        this.codigo = contador;
    }

    public Especialidade(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
        this.contador++;
        this.codigo = contador;
    }

    public Especialidade() {
        this.contador++;
        this.codigo = contador;
    }

//	Metodos de acesso aos atributos 

    public Integer getCodigo() {
        return codigo;
    }
    

    public  int getContador() {
        return contador;
    }
    
    
    public void setNome(String nome) {
        if (nome.length() >= 3) {
            this.nome = nome;
        } else {
            JOptionPane.showMessageDialog(null, nome + " não é um nome válido \nDeve conter pelo menos três letras");
        }

    }

    public String getNome() {
        return nome;
    }

    public void setDescricao(String descricao) {
        if (descricao.length() >= 10) {
            this.descricao = descricao;
        } else {
            JOptionPane.showMessageDialog(null, descricao + "A descrição deve ter no minimo 10 letras ");
        }

    }

    public String getDescricao() {
        return descricao;
    }

}
