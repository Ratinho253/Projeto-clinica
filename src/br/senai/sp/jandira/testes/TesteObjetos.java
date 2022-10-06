package br.senai.sp.jandira.testes;

import java.util.ArrayList;

import br.senai.sp.jandira.AgendaApp;
import br.senai.sp.jandira.dao.EspecialodadeDAO;
import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.PlanoDeSaude;

public class TesteObjetos {

    public static void main(String[] args) {
        
        
        int[] a ={6, 9, 87, 35, 9};
        int[] b = new int [4];
        b[0] = 55;
        b[1] = 10;
        b[2] = 53;
        b[3] = 59;  
        
        int[][] c = {
            {4, 6, 5}, 
            {8, 178, 33}, 
            {2, 40, 19},
            {2, 678, 93} 
        };
        
        String[][] quitanda ={
            {"banana","maçã","uva","pera"},
            {"alface", "couve","tomate","salsinha","pimentão","brocolis"},
            {"abacate", "tomate", "jilo", "abobrinha"}
        };
        
        System.out.println(quitanda[1][3]);
        
        
        
        System.out.println(c[2][1]);
                
                
        System.out.println("++++++++++++++++++++++++++++++++");
        
        
                
        Especialidade e1 = new Especialidade("Cardiologia");
        e1.setNome("cardiologia");
        e1.setDescricao("não deixa ter um ataque");
        
        EspecialodadeDAO.gravar(e1);
        
        

        Especialidade e2 = new Especialidade("Gastroenteologia");
        e2.setNome("Gastroenteologia");
        e2.setDescricao("Não deixa ficar com dor de barriga");
        
        EspecialodadeDAO.gravar(e2);

        
        
        Especialidade e4 = new Especialidade("Otorrino", "Cuida do ouvido");
        EspecialodadeDAO.gravar(e4);

        Especialidade e3 = new Especialidade("Gastroenteologia");
        e3.setNome("Qualquer coisa");
        EspecialodadeDAO.gravar(e3);
        
        Especialidade e5 = new Especialidade("5");
        e5.setNome("Especialidade 5");
        EspecialodadeDAO.gravar(e5);
        
        
        
        for (Especialidade ee : EspecialodadeDAO.getEspscialidades()){
            System.out.println("--------------" + ee.getNome());
        }
        
        System.out.println("-----------------------------------================");
        
        EspecialodadeDAO.excluir(101);
        
        for (Especialidade ee : EspecialodadeDAO.getEspscialidades()){
            System.out.println("--------------" + ee.getNome());
        }
        
        
        Especialidade procurada = EspecialodadeDAO.getEspecialidade(102);
        System.out.println(procurada.getNome());
        
        System.out.println("-------------------up-----------------------");
        Especialidade  especialidadeAtualizada = new Especialidade();
        especialidadeAtualizada.setCodigo(102);
        especialidadeAtualizada.setNome("Otorrinolarigologia");
        especialidadeAtualizada.setDescricao("Essa é a nova descrição");
        EspecialodadeDAO.atualizar(especialidadeAtualizada);
        
        System.out.println("_______________________up________________________");
        
        
        System.out.println("Total:"+e1.getContador());
        System.out.println(e1.getCodigo() + "---" + e1.getNome());
        System.out.println(e2.getCodigo() + "---" + e2.getNome());
        System.out.println(e3.getCodigo() + "---" + e3.getNome());
        System.out.println(e4.getCodigo() + "---" + e4.getNome());
        System.out.println(e5.getCodigo() + "---" + e5.getNome());

        ArrayList<Especialidade> especialidades = new ArrayList<>();
        especialidades.add(e1);
        especialidades.add(e2);
        especialidades.add(e3);
        System.out.println(especialidades.size());

//		imprimir no console o nome das especialidades  que estão armazenadas no arrylist
        int i = 0;
        while (i < especialidades.size()) {
            System.out.println(especialidades.get(i).getNome());
            i++;
        }

//		 utilização do for para iteração
        System.out.println("------------------for------------------------");
        for (int x = 0; x < especialidades.size(); x++) {
            System.out.println(especialidades.get(x).getNome());
        }

//		FOR  EACH -> para cada 
        System.out.println("-------------------for each-------------------");
        for (Especialidade e : especialidades) {
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
        for (PlanoDeSaude e : planos) {
            System.out.println(e.getOperadora());
            System.out.println(e.getQuantidade());

        }

        System.out.println("-----------------" + PlanoDeSaude.getQuantidade());

        AgendaApp.main(args);

        System.out.println("-----------------" + PlanoDeSaude.getQuantidade());
    }
}
