package br.senai.sp.jandira.model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Medico {

	private static int contador = 99;
	private String nome;
	private ArrayList <Especialidade> especialidades;
	private String telefone;
	private String email;
	private String crm;
        private LocalDate dataDeNascimento;
        private Integer codigo;
        
        public Medico(Integer codigo, String nome, String telefone, String email, LocalDate dataDeNascimento) {
            this.nome = nome;
            this.telefone = telefone;
            this.email = email;
            this.crm = crm;
            
            gerarCodigo(); 
        }
        
       public Medico(Integer codigo, String nome, String telefone, String email, String crm, LocalDate dataDeNascimento) {
            this.codigo = codigo;
            this.nome = nome;
            this.telefone = telefone;
            this.email = email;
            this.crm = crm;
            this.dataDeNascimento = dataDeNascimento;
            
            gerarCodigo();
       
        }
       public Medico(Integer codigo, String nome, String telefone, String email, String crm, LocalDate dataDeNascimento, ArrayList<Especialidade> especialidades){
            this.codigo = codigo;
            this.nome = nome;
            this.telefone = telefone;
            this.email = email;
            this.crm = crm;
            this.dataDeNascimento = dataDeNascimento;
            this.especialidades = especialidades;
            gerarCodigo();
       
        }
        public Medico() {
            gerarCodigo();
        }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCrm() {
		return crm;
	}

	public void setCrm(String crm) {
		this.crm = crm;
	}

        public ArrayList<Especialidade> getEspecialidades() {
            return especialidades;
        }

        public void setEspecialidades(ArrayList<Especialidade> especialidades) {
            this.especialidades = especialidades;
        }
        public Integer getCodigo() {
                return codigo;
        }
    
         public void setDataDeNascimento(LocalDate dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}
	public LocalDate getDataDeNascimento() {
		return dataDeNascimento;
	}
        
        public void setCodigo(Integer codigo) {
            this.codigo = codigo;
        }
        private void gerarCodigo() {
            this.contador++;
            this.codigo = contador;
        }
    
        public String getMedicoSeparadoPorPontoEVirgula() {
            return this.codigo + ";" + this.crm + ";" + this.nome + ";" + this.email + ";" + this.telefone + ";" + this.dataDeNascimento + ";" + getCodigoEspecialidade();
        }
        
        public String getCodigoEspecialidade(){
           String codigoEspecialidade = "";
           for(Especialidade especialidade : especialidades){
               codigoEspecialidade += especialidade.getCodigo() + "&";
           }
            return codigoEspecialidade;
        }
    
}
