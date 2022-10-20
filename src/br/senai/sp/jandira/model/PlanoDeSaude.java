package br.senai.sp.jandira.model;

import java.time.LocalDate;

public class PlanoDeSaude {
    
	private String operadora;
	private String categoria;
	private String numero;
	private LocalDate validade;
        private Integer codigo;
        private  static int contador = 01;
	
	
        // Construtores da classe
        public PlanoDeSaude(){
            gerarCodigo();
        }
        
        public PlanoDeSaude(String operadora){
            this.operadora = operadora;
            this.codigo++;
            this.codigo = contador;
             gerarCodigo();
        }
        
        public PlanoDeSaude(String operadora, String categoria){
         this.operadora = operadora;
         this.categoria = categoria;  
         this.contador++;
         this.codigo = contador;
          gerarCodigo();
        }
        
        public PlanoDeSaude (String operadora, String categoria, String numero){
         this.operadora = operadora;
         this.categoria = categoria;
         this.numero = numero;
         this.validade = validade;
         this.contador++;
         this.codigo = contador;
          gerarCodigo();
        }
        
        public PlanoDeSaude (String operadora, String categoria, String numero,LocalDate validade){
         this.operadora = operadora;
         this.categoria = categoria;
         this.numero = numero;
         this.validade = validade;
         this.contador++;
         this.codigo = contador;
          gerarCodigo();
        }
         public void gerarCodigo(){
          this.contador++;
          this.codigo = contador;
           gerarCodigo();
         }
        
     
  //	 metodos de acesso aos atributos

    public Integer getCodigo() {
        return codigo;
    }
    
    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }
	public void setOperador(String operadora) {
		this.operadora = operadora;
		
	}
	public String getOperadora(){
		return operadora;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getNumero() {
		return numero;
	}
	public void setValidade(LocalDate validade) {
		this.validade = validade;
	}
	public LocalDate getValidade() {
		return validade;
	}
	
    }
