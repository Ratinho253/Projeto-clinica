package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.Especialidade;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class EspecialodadeDAO {

//  Essa classe será responsável pela persisência de dados
//     das especialidades, por exemplo, adicionar uma nova especialidade
//     excluir uma especialidade, etc.
    private static ArrayList<Especialidade> especialidades = new ArrayList<>();

    public static void gravar(Especialidade e) {
        especialidades.add(e);

    }

    public static ArrayList<Especialidade> getEspscialidades() {
        return especialidades;
    }

    public static void atualizar(Especialidade especialidadeAtualizada) {
        int i = 0;
        for (Especialidade e : especialidades) {
            if (e.getCodigo() == especialidadeAtualizada.getCodigo()) {
                especialidades.set(especialidades.indexOf(e), especialidadeAtualizada);
                break;
            }
            i++;
        }
    }

    public static Especialidade getEspecialidade(Integer codigo) {
        for (Especialidade e : especialidades) {
            if (e.getCodigo() == codigo) {
                return e;
            }

        }

        return null;

    }

    public static void excluir(Integer codigo) {
        for (Especialidade e : especialidades) {
            if (e.getCodigo() == codigo) {
                especialidades.remove(e);
                break;
            }

        }

    }
    //Criar lista inicial de especialidades

    public static void criarListaDeEspecialidades() {
        Especialidade e1 = new Especialidade("Cardgiologia", "Cuida do coração");
        Especialidade e2 = new Especialidade("Nefrologia", "Estuda as doencas");
        Especialidade e3 = new Especialidade("Otorrino", "Cuida do ouvido");
        Especialidade e4 = new Especialidade("Pediatra", "Cuida de criança");
        
        especialidades.add(e1);
        especialidades.add(e2);
        especialidades.add(e3);
        especialidades.add(e4);
        
        System.out.println(especialidades.size());
        
    }
    
    public static DefaultTableModel getTabelaEspecialidades(){
        
        System.out.println("MONTANDO DEFAUT " + especialidades.size());
        
        String titulo[] = {"Código", "Nome da Especialidade", "Descrição"};
        String[][] dados = new String[especialidades.size()][3];
        
        
        for(Especialidade e : especialidades){
            int i = especialidades.indexOf(e);
            dados[i][0] = e.getCodigo().toString();
            dados[i][1] = e.getNome().toString();
            dados[i][2] = e.getDescricao().toString();
        }
        
        return new DefaultTableModel(dados, titulo);
        
    }
    
}
