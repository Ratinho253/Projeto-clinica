
package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.Especialidade;
import java.util.ArrayList;


public class EspecialodadeDAO {
    
//  Essa classe será responsável pela persisência de dados
//     das especialidades, por exemplo, adicionar uma nova especialidade
//     excluir uma especialidade, etc.
    
    private static ArrayList<Especialidade> especialidades = new ArrayList<>();
    
    public static  void gravar(Especialidade e){
        especialidades.add(e);
        
    }
    
    public static ArrayList<Especialidade> getEspscialidades(){
        return especialidades;
    }
    
    public static void atualizar(Especialidade especialidadeAtualizada){
        int i = 0;
        for (Especialidade e : especialidades){
            if(e.getCodigo() == especialidadeAtualizada.getCodigo()){
                  especialidades.set(especialidades.indexOf(e), especialidadeAtualizada);
               break;
            }
            i++;
        }
    }
    
    public static Especialidade getEspecialidade(Integer codigo){
        for (Especialidade e : especialidades){
            if(e.getCodigo() == codigo){
               return e;
            }
            
        }
        
        return null;
        
    }
    
    public static void excluir(Integer codigo){
        for (Especialidade e : especialidades){
            if(e.getCodigo() == codigo){
               especialidades.remove(e); 
               break;
            }
            
        }
        
    }
    
}
