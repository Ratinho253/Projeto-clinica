package br.senai.sp.jandira.testes;

import java.util.ArrayList;

import br.senai.sp.jandira.AgendaApp;
import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.PlanoDeSaude;

public class TesteObjetos {

	public static void main(String[] args) {
		Especialidade e1 = new Especialidade("Cardiologia");
		e1.setNome("cardiologia");
		e1.setDescricao("não deixa ter um ataque");
		
		Especialidade e2 = new Especialidade("Gastroenteologia");
		e2.setNome("Gastroenteologia");
		e2.setDescricao("Não deixa ficar com dor de barriga");
		
		Especialidade e4 = new Especialidade( "Otorrino", "Cuida do ouvido");
				
		Especialidade e3 = new Especialidade("Gastroenteologia");
		e3.setNome("Qualquer coisa");
		
		ArrayList<Especialidade> especialidades = new ArrayList<>(); 
		especialidades.add(e1);
		especialidades.add(e2);
		especialidades.add(e3);
		System.out.println(especialidades.size());
		
//		imprimir no console o nome das especialidades  que estão armazenadas no arrylist
		
		int i = 0;
		while(i < especialidades.size()) {
			System.out.println(especialidades.get(i).getNome());
			i++;
		} 
		
//		 utilização do for para iteração
		System.out.println("------------------for------------------------");
		for(int x = 0; x < especialidades.size(); x++) {
			System.out.println(especialidades.get(x).getNome());
		}
		
//		FOR  EACH -> para cada 
		
		System.out.println("-------------------for each-------------------");
		for(Especialidade e : especialidades) {
			System.out.println(e.getNome());
		}
		
//		 criar 3 palnos de saúde, armazenar em um arraylist e exibir o nome da operadora de cas um deles usando for each
		
		PlanoDeSaude p1 = new PlanoDeSaude("norte");
		PlanoDeSaude p2 = new PlanoDeSaude("Sul");
		PlanoDeSaude p3 = new PlanoDeSaude("Leste");
		
		ArrayList<PlanoDeSaude> planos = new ArrayList<>();
		planos.add(p1);
		planos.add(p2);
		planos.add(p3);
		
		System.out.println("-------------------------------fiz sozinho -----------------------");
		for(PlanoDeSaude e : planos) {
			System.out.println(e.getOperadora());
			System.out.println(e.getQuantidade());
			
		}
		
		
		System.out.println("-----------------" +PlanoDeSaude.getQuantidade());
		
		
		AgendaApp.main(args);
		
		System.out.println("-----------------" +PlanoDeSaude.getQuantidade());
	}
}
