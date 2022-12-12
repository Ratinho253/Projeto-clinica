package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.PlanoDeSaude;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PlanoDeSaudeDAO {

    private final static String URL = "C:\\Users\\22282229\\salvação\\PlanoDeSaude.txt";
    private final static String URL_TEMP = "C:\\Users\\22282229\\salvação\\PlanoDeSaude-temp.txt";
//    private final static String URL = "E:\\documentos\\Plano.txt";
//    private final static String URL_TEMP = "E:\\documentos\\Plano-temp.txt";
    private final static Path PATH = Paths.get(URL);
    private final static Path PATH_TEMP = Paths.get(URL_TEMP);

    private static ArrayList<PlanoDeSaude> planoDeSaudes = new ArrayList<>();

    public static void gravar(PlanoDeSaude plano) {
        planoDeSaudes.add(plano);

        // Gravar em Arquivo
        try {
            BufferedWriter escritor = Files.newBufferedWriter(
                    PATH,
                    StandardOpenOption.APPEND,
                    StandardOpenOption.WRITE);

            escritor.write(plano.getPlanoDeSaudeSeparadorPorPontoEVirgula());
            escritor.newLine();
            escritor.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro");
        }

    }

    public static ArrayList<PlanoDeSaude> getEspscialidades() {
        return planoDeSaudes;
    }

    public static void atualizar(PlanoDeSaude planoDeSaudeAtualizada) {
        int i = 0;
        for (PlanoDeSaude plano : planoDeSaudes) {
            if (plano.getCodigo() == planoDeSaudeAtualizada.getCodigo()) {
                planoDeSaudes.set(planoDeSaudes.indexOf(plano), planoDeSaudeAtualizada);
                break;
            }
            i++;
        }
        atualizarArquivo();
    }

    public static PlanoDeSaude getPlanoDeSaude(Integer codigo) {
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
        atualizarArquivo();

    }

    private static void atualizarArquivo() {
        // PAsso 01 - Criar uma representação dos arquivos que serão manipulados
        File arquivoAtual = new File(URL);
        File arquivoTemp = new File(URL_TEMP);

        try {
            arquivoTemp.createNewFile();

            BufferedWriter bwTemp = Files.newBufferedWriter(PATH_TEMP,
                    StandardOpenOption.APPEND,
                    StandardOpenOption.WRITE);

            for (PlanoDeSaude e : planoDeSaudes) {
                bwTemp.write(e.getPlanoDeSaudeSeparadorPorPontoEVirgula());
                bwTemp.newLine();
            }

            bwTemp.close();

            arquivoAtual.delete();

            arquivoTemp.renameTo(arquivoAtual);

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

//        Criar lista inicial de planos de saude
    public static void criarListaDePlanos() {

        try {
            BufferedReader leitor = Files.newBufferedReader(PATH);

            String linha = leitor.readLine();

            while (linha != null) {
                // Transformar os dados da linha em uma especialidade
                String[] vetor = linha.split(";");
                PlanoDeSaude plano = new PlanoDeSaude(
                        vetor[1],
                        vetor[2],
                        vetor[3],
                        LocalDate.parse(vetor[4]),
                        Integer.valueOf(vetor[0]));

                //Guardar a Especialidades
                planoDeSaudes.add(plano);

                //ler a proxima linha
                linha = leitor.readLine();
            }
        } catch (IOException erro) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro");
        }
    }

    public static DefaultTableModel getTabelaPlanoDeSaude() {

        System.out.println("MONTANDO DEFAUT " + planoDeSaudes.size());

        String titulo[] = {"Código", "Operadora", "Categoria", "numero", "validade"};
        String[][] dados = new String[planoDeSaudes.size()][5];

        for (PlanoDeSaude e : planoDeSaudes) {
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
