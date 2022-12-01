package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.Especialidade;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class EspecialodadeDAO {

    private final static String URL = "C:\\Users\\22282229\\salvação\\Especialidade.txt";
    private final static String URL_TEMP = "C:\\Users\\22282229\\salvação\\Especialidade-temp.txt";
    private final static Path PATH = Paths.get(URL);
    private final static Path PATH_TEMP = Paths.get(URL_TEMP);

//  Essa classe será responsável pela persisência de dados
//     das especialidades, por exemplo, adicionar uma nova especialidade
//     excluir uma especialidade, etc.
    private static ArrayList<Especialidade> especialidades = new ArrayList<>();

    public static void gravar(Especialidade e) {
        especialidades.add(e);

        // Gravar em Arquivo
        try {
            BufferedWriter escritor = Files.newBufferedWriter(
                    PATH,
                    StandardOpenOption.APPEND,
                    StandardOpenOption.WRITE);

            escritor.write(e.getEspecialidadeSeparadaPorPontoEVirgula());
            escritor.newLine();
            escritor.close();

        } catch (IOException erro) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro");
        }

    }

    public static ArrayList<Especialidade> getEspescialidades() {
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
        atualizarArquivo();
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
            if (e.getCodigo().equals(codigo)) {
                especialidades.remove(e);
                break;
            }

        }
        atualizarArquivo();
    }

    private static void atualizarArquivo() {
        // PAsso 01 - Criar uma representação dos arquivos que serão manipulados
        File arquivoAtual = new File(URL);
        File arquivoTemp = new File(URL_TEMP);

        try {
            // Criar arquivo tempórario
            arquivoTemp.createNewFile();

            // Abrir o arquivo tempórario para a escrita
            BufferedWriter bwTemp = Files.newBufferedWriter(PATH_TEMP,
                    StandardOpenOption.APPEND,
                    StandardOpenOption.WRITE);

            // Iterar na lista para adicionar as Especialidades no arquivo tempórario
            // exceto o registro  que não queremos mais
            for (Especialidade e : especialidades) {
                bwTemp.write(e.getEspecialidadeSeparadaPorPontoEVirgula());
                bwTemp.newLine();
            }

            bwTemp.close();

            // Excluir o arquivo atual
            arquivoAtual.delete();

            // renomear o arquivo temporario
            arquivoTemp.renameTo(arquivoAtual);

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    //Criar lista inicial de especialidades

    public static void criarListaDeEspecialidades() {

        try {
            BufferedReader leitor = Files.newBufferedReader(PATH);

            String linha = leitor.readLine();

            while (linha != null) {

                // Transformar os dados da linha em uma especialidade
                String[] vetor = linha.split(";");
                Especialidade e = new Especialidade(
                        vetor[1],
                        vetor[2],
                        Integer.valueOf(vetor[0]));

                //Guardar a Especialidades
                especialidades.add(e);

                //ler a proxima linha
                linha = leitor.readLine();
            }

            leitor.close();

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro no arquivo");
        }
    }

    public static DefaultTableModel getTabelaEspecialidades() {

        System.out.println("MONTANDO DEFAUT " + especialidades.size());

        String titulo[] = {"Código", "Nome da Especialidade", "Descrição"};
        String[][] dados = new String[especialidades.size()][3];

        for (Especialidade e : especialidades) {
            int i = especialidades.indexOf(e);
            dados[i][0] = e.getCodigo().toString();
            dados[i][1] = e.getNome();
            dados[i][2] = e.getDescricao();
            i++;
        }

        return new DefaultTableModel(dados, titulo);

    }

    public static DefaultListModel<String> getListaEspecialidade(){
        DefaultListModel<String> listaEspecialidade = new  DefaultListModel<>();
        
        for(Especialidade especialidade : especialidades){
            listaEspecialidade.addElement(especialidade.getNome());
        }
        
        return listaEspecialidade;
    }
    
    
}
