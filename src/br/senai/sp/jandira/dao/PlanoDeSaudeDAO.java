
package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.PlanoDeSaude;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;


public class PlanoDeSaudeDAO {
    private static ArrayList <PlanoDeSaude> planoDeSaudes = new ArrayList<>();
    
    public static void gravar(PlanoDeSaude plano) {
        planoDeSaudes.add(plano);
    }
    
    public static ArrayList<PlanoDeSaude> getEspscialidades() {
        return planoDeSaudes;
    }
     
    public static void atualizar (PlanoDeSaude planoDeSaudeAtualizada){
         int i = 0;
        for (PlanoDeSaude plano : planoDeSaudes ) {
            if (plano.getCodigo() == planoDeSaudeAtualizada.getCodigo()) {
                planoDeSaudes.set(planoDeSaudes.indexOf(plano), planoDeSaudeAtualizada);
                break;
            }
            i++;
        }
       
        }
         public static PlanoDeSaude getPlanoDeSaude(Integer codigo){
              for (PlanoDeSaude plano : planoDeSaudes) {
            if (plano.getCodigo() == codigo) {
                return plano;
            }

        }

        return null;
    }
         
             public static void excluir(Integer codigo) {
        for (PlanoDeSaude plano : planoDeSaudes) {
            if (plano.getCodigo() == codigo) {
                planoDeSaudes.remove(plano);          
                break;
            }

        }

    }
          
//        Criar lista inicial de planos de saude
              public static void criarListaDePlanos() {
        PlanoDeSaude plano1 = new PlanoDeSaude("amil", "gold", "254-27", LocalDate.of(12, Month.MARCH, 25));
        PlanoDeSaude plano2 = new PlanoDeSaude("santander", "bronze", "123-42", LocalDate.of(12, Month.MARCH, 25));
        PlanoDeSaude plano3 = new PlanoDeSaude("bradesco", "prata", "105-67", LocalDate.of(12, Month.MARCH, 25));
        PlanoDeSaude plano4 = new PlanoDeSaude("not", "gold", "123-09", LocalDate.of(12, Month.MARCH, 25));
       
        
        planoDeSaudes.add(plano1);
        planoDeSaudes.add(plano2);
        planoDeSaudes.add(plano3);
        planoDeSaudes.add(plano4);
    }
       public static DefaultTableModel getTabelaPlanoDeSaude (){
    
           System.out.println("MONTANDO DEFAUT " + planoDeSaudes.size());
    
           String titulo[] = {"Código", "Operadora","Categoria","numero", "validade"};
          String[][] dados = new String[planoDeSaudes.size()][5];
          
            for(PlanoDeSaude e : planoDeSaudes){
            int i = planoDeSaudes.indexOf(e);
            dados[i][0] = e.getCodigo().toString();
            dados[i][1] = e.getOperadora();
            dados[i][2] = e.getCategoria();
            DateTimeFormatter barra = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            dados[i][4] = e.getValidade().format(barra);
            
            dados[i][3] = e.getNumero();
            
        }
        
        return new DefaultTableModel(dados, titulo);
        
}
                 
     
             
}
    
    

