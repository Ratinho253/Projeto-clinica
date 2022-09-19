package br.senai.sp.jandira.model;

import javax.swing.JOptionPane;

public class Especialidade {
	
	private String nome;
	private String descricao;  
	
//	Metodos de acesso aos atributos 
	
	public void setNome(String nome){
		if (nome.length() >=3) {
			this.nome = nome;
		}else {
			JOptionPane.showMessageDialog(null, nome + " não é um nome válido \nDeve conter pelo menos três letras");
		}
		
	}
	public String getNome() {
		return nome;
	}
	public void setDecricao(String descricao) {
		if(descricao.length() >=10) {
			this.descricao = descricao;
		}else {
			JOptionPane.showMessageDialog(null, descricao + "A descrição deve ter no minimo 10 letras ");
		}
		
		}
	public String getDescricao() {
		return descricao;
	}
	
	
	
	
}