package br.senai.sp.jandira;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.swing.JOptionPane;

import br.senai.sp.jandira.model.Agenda;
import br.senai.sp.jandira.model.Endereco;
import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.Estados;
import br.senai.sp.jandira.model.Medico;
import br.senai.sp.jandira.model.Paciente;
import br.senai.sp.jandira.model.PlanoDeSaude;

public class AgendaApp {

	public static void main(String[] args) {
		
//		Criar um objeto plano de saude
		
		PlanoDeSaude planoDeSaude = new PlanoDeSaude();
		planoDeSaude.setOperador("Unimed");
		planoDeSaude.setCategoria("bronze");
		planoDeSaude.setNumero("854-127-783-98");
		planoDeSaude.setValidade(LocalDate.of(2023, 8, 20));
		
//		criar um objeto endereço
		
		Endereco endereco = new Endereco();
		endereco.setLogadouro("Av.Arnaldo de Freitas");
		endereco.setNumero("104");
		endereco.setBairro("Jardim Cohab");
		endereco.setCep("006656-100");
		endereco.setCidade("Jandira");
		endereco.setComplemento("Hospital regional");
		endereco.setEstado(Estados.SAO_PAULO);
		
//		criar um objeto paciente
		Paciente paciente =new Paciente();
		paciente.setCpf("253.243.248-08");
		paciente.setNome("Robert");
		paciente.setEndereco(endereco);
		paciente.setRg("12.458.459.1");
		paciente.setPlanoDeSaude(planoDeSaude);
		paciente.setTelefone("(11) 93049-2911");
		paciente.setDataDeNascimento(LocalDate.of(2023, 9, 16));
		
		Paciente paciente2 =new Paciente();
		paciente2.setCpf("283.883.218-19");
		paciente2.setNome("Rafael");
		paciente2.setEndereco(endereco);
		paciente2.setRg("16.438.129.1");
		paciente2.setPlanoDeSaude(planoDeSaude);
		paciente2.setTelefone("(11) 93169-2911");
		paciente2.setDataDeNascimento(LocalDate.of(2022, 7, 9));
		
		
//		exibir os dado do paciente
		
		System.out.println("nome do Paciente:" + paciente.getNome());
		System.out.println("Telefone do paciente:" + paciente.getTelefone());
		System.out.println("Operadora do plano de saúde:" + paciente.getPlanoDeSaude().getOperadora() );
		System.out.println("Categoria do palno de saúde:" + paciente.getPlanoDeSaude().getCategoria() );
		System.out.println("Cidade do paciente:" + paciente.getEndereco().getCidade());
		System.out.println("Estado do paciente:" + paciente.getEndereco().getEstado());
		
		
//		criar especialidades
		
		Especialidade especialidade1 = new Especialidade();
		especialidade1.setNome("cirurgião");
		especialidade1.setDecricao("profissional em fazer cirurgia");
		

		Especialidade especialidade2 = new Especialidade();
		especialidade2.setNome("Cardiovascular");
		especialidade2.setDecricao("profissional na area do coração");
		

		Especialidade especialidade3 = new Especialidade();
		especialidade3.setNome("cirurgião de olho");
		especialidade3.setDecricao("profissional em fazer cirurgia no seu olho");
		
		Especialidade especialidade4 = new Especialidade();
		especialidade4.setNome("Clinico geral");
		especialidade4.setDecricao("profissional em fazer de tudo ");
		
		
		System.out.println(".............................................................");
		
//		criar um medico
		
		Medico medico1 = new Medico();
		medico1.setNome("João");
		medico1.setCrm("4897-158");
		medico1.setEmail("dr.joão@gmail.com");
		medico1.setTelefone("(11) 98673-2345");
		Especialidade[] especialidades1 = { especialidade1,especialidade2};
		medico1.setEspecialidade(especialidades1);
		
		
		
		
//		Exibir especialidades do medico
		
		System.out.println("Nome do médico:" + medico1.getNome());
		int contador = 0;
		while(contador < medico1.getEspecialidade().length) {
			System.out.println(" Especialidade  " + (contador+1) + (" - ") + medico1.getEspecialidade()[contador].getNome());
			contador++;
		}
		System.out.println(".................................");
		
//		fazer o agendamento do paciente robet 
		
		Agenda agenda1 = new Agenda();
		agenda1.setPaciente(paciente);
		agenda1.setEspecialidade(especialidade2);
		agenda1.setMedico(medico1);
		agenda1.setDataDaConsulta(LocalDate.of(2022, 9, 27));
		agenda1.setHoraDaConsulta(LocalTime.of(9, 30));
		
		Agenda agenda2 = new Agenda();
		agenda2.setPaciente(paciente2);
		agenda2.setEspecialidade(especialidade3);
		agenda2.setMedico(medico1);
		agenda2.setDataDaConsulta(LocalDate.of(2022, 12, 27));
		agenda2.setHoraDaConsulta(LocalTime.of(14, 30));
		
		System.out.println("Agenda do(a) paciente: " + agenda1.getPaciente().getNome());
		System.out.println("Especialidade: " + agenda1.getEspecialidade().getNome());
		System.out.println("Medico: " + agenda1.getMedico().getNome());
		System.out.println("Data: " + agenda1.getDataDaConsulta());
		System.out.println("Hora:" + agenda1.getHoraDaConsulta());
		
		System.out.println("...................");
		
		System.out.println("Agenda do(a) paciente: " + agenda2.getPaciente().getNome());
		System.out.println("Especialidade: " + agenda2.getEspecialidade().getNome());
		System.out.println("Medico: " + agenda2.getMedico().getNome());
		System.out.println("Data: " + agenda2.getDataDaConsulta());
		System.out.println("Hora:" + agenda2.getHoraDaConsulta());
		
		 
		
		
		
		
	}
		}
