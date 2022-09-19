package br.senai.sp.jandira.model;

public class Endereco {
	private String logadouro;
	private String numero;
	private String bairro;
	private String cidade;
	private String complemento;
	private String cep;
	private Estados estado;
	
//	 metodos de acesso aos atributos
	
	
	public void setLogadouro(String logadouro) {
		this.logadouro = logadouro;
	}
	public String getLogadouro() {
		return logadouro;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getNumero() {
		return numero;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getBairro() {
		return bairro;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getCidade() {
		return cidade;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getCep() {
		return cep;
	}
	public Estados getEstado() {
		return estado;
	}
	public void setEstado(Estados estado) {
		this.estado = estado;
	}
      

	
}

