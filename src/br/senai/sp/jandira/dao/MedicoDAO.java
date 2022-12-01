package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.Medico;
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
import javax.imageio.IIOException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MedicoDAO {
    
    
    private final static String URL = "C:\\Users\\22282229\\salvação\\Medico.txt";
    private final static String URL_TEMP = "C:\\Users\\22282229\\salvação\\Medico-temp.txt";
    private final static Path PATH = Paths.get(URL);
    private final static Path PATH_TEMP = Paths.get(URL_TEMP);
    
    
    
    private static ArrayList<Medico> medicos = new ArrayList<>();
    
     public static void gravar(Medico m) { // CREATE
        medicos.add(m);

        try {
            BufferedWriter escritor = Files.newBufferedWriter(
                    PATH,
                    StandardOpenOption.APPEND,
                    StandardOpenOption.WRITE);

            escritor.write(m.getMedicoSeparadoPorPontoEVirgula());
            escritor.newLine();
            escritor.close();
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro");
        }
    }
    
    
    
    public static ArrayList<Medico> getMedico() { // READ
        return medicos;
                
    }

    public static Medico getMedico(Integer codigo) { // READ

        for (Medico m : medicos) {
            if (m.getCodigo() == codigo) {
                return m;
            }

        }

        return null;

    }
    
    public static void atualizar(Medico medicosAtualizado) { // UPDATE

        for (Medico m : medicos) {
            if (m.getCodigo() == medicosAtualizado.getCodigo()) {
                medicos.set(medicos.indexOf(m), medicosAtualizado);
                break;
            }

        }
        
        atualizarArquivo();
        
    }

    public static void excluir(Integer codigo) { // DELETE

        for (Medico m : medicos) {
            if (m.getCodigo().equals(codigo)) {
                medicos.remove(m);
                break;
            }
        }

        atualizarArquivo();
        
    }
    
    private static void atualizarArquivo(){
        
        File arquivoAtual = new File(URL);
        File arquivoTemp = new File(URL_TEMP);
        
        try {
            
            arquivoTemp.createNewFile();
            
            BufferedWriter bwTemp = Files.newBufferedWriter(
                    PATH_TEMP, 
                    StandardOpenOption.APPEND,
                    StandardOpenOption.WRITE);
            
            for(Medico m : medicos){
                bwTemp.write(m.getMedicoSeparadoPorPontoEVirgula());
                bwTemp.newLine();
            }
            
            arquivoAtual.delete();
            
            arquivoTemp.renameTo(arquivoAtual);
            
            bwTemp.close();
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
    }
    
    
    // Criar uma lista inicial de medicos
    public static void criarListaDeMedicos() {

            
        try {
            BufferedReader leitor = Files.newBufferedReader(PATH);
            
            String linha = leitor.readLine();
            
            while(linha !=null){
                
                String[] vetor = linha.split(";");
                
                Medico m = new Medico(
                        Integer.valueOf(vetor[0]),
                        vetor[1],
                        vetor[2],
                        vetor[3],
                        vetor[4],
                        LocalDate.parse(vetor[5]));
                
                medicos.add(m);
                
                linha = leitor.readLine();
                
            }
            
            leitor.close();
            
        } catch( IOException e){
            JOptionPane.showMessageDialog(
                    null,
                    "Ocorreu um erro ao ler o arquivo");
          } 


    }
    
    public static DefaultTableModel getTabelaMedicos() {

        System.out.println(medicos.size());

        String[] titulo = {"CÓDIGO", "CRM", "NOME", "TELEFONE"};
        String[][] dados = new String[medicos.size()][4];

        for (Medico m : medicos) {
            int i = medicos.indexOf(m);
            dados[i][0] = m.getCodigo().toString();
            dados[i][1] = m.getCrm();
            dados[i][2] = m.getNome();
            dados[i][3] = m.getTelefone();

        }

        return new DefaultTableModel(dados, titulo);
    }
 }
