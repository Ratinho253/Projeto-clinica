
package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.MedicoDAO;
import br.senai.sp.jandira.model.Medico;
import br.senai.sp.jandira.model.OperacaoEnum;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class PanelMedico extends javax.swing.JPanel {

    private int linha;
    
    public PanelMedico() {
        initComponents();
         MedicoDAO.criarListaDeMedicos();

       preencherTabela();
    }
    
     private int getLinha() {
        linha = tabelaMedico.getSelectedRow();
        return linha;
    }

     private void preencherTabela() {

          tabelaMedico.setModel(MedicoDAO.getTabelaMedicos());
          ajustarTabela();
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaMedico = new javax.swing.JTable();
        buttonExcluirMedico = new javax.swing.JButton();
        buttonEdiatrMedico = new javax.swing.JButton();
        buttonAdicionarMedico = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(800, 310));
        setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista de Médico", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 51, 0))); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 310));
        jPanel1.setLayout(null);

        tabelaMedico.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tabelaMedico);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(30, 20, 750, 240);

        buttonExcluirMedico.setText("Excluir");
        buttonExcluirMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExcluirMedicoActionPerformed(evt);
            }
        });
        jPanel1.add(buttonExcluirMedico);
        buttonExcluirMedico.setBounds(542, 270, 80, 23);

        buttonEdiatrMedico.setText("Editar");
        buttonEdiatrMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEdiatrMedicoActionPerformed(evt);
            }
        });
        jPanel1.add(buttonEdiatrMedico);
        buttonEdiatrMedico.setBounds(630, 270, 75, 23);

        buttonAdicionarMedico.setText("Adicionar");
        buttonAdicionarMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAdicionarMedicoActionPerformed(evt);
            }
        });
        jPanel1.add(buttonAdicionarMedico);
        buttonAdicionarMedico.setBounds(710, 270, 81, 23);

        add(jPanel1);
        jPanel1.setBounds(0, 0, 800, 310);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonExcluirMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExcluirMedicoActionPerformed
        if (getLinha() != -1) {
            excluirMedico(linha);
        } else {
            JOptionPane.showMessageDialog(
                this,
                "Por favor, selecione a especialidade que vc deseja exluir",
                "Atenção",
                    JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_buttonExcluirMedicoActionPerformed
        private void excluirMedico(int linha) {

        int resposta = JOptionPane.showConfirmDialog(
                this,
                "Vc confirma a exclusão",
                "Atenção",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);

        if (resposta == 0) {
            MedicoDAO.excluir(getCodigo());
            preencherTabela(); 
        }
        
        
}
        private Integer getCodigo(){
        String codiStr = tabelaMedico.getValueAt(linha, 0).toString();
        Integer codigo = Integer.valueOf(codiStr);
        return codigo;
        }
      

    
    private void buttonEdiatrMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEdiatrMedicoActionPerformed

    if (getLinha() != -1) {
            editarMedico();
        } else {
            JOptionPane.showConfirmDialog(
                    this,
                    "Por favor, selecione o médico que você deseja editar.",
                    "Médicos",
                    JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_buttonEdiatrMedicoActionPerformed

    private void editarMedico() {

        Medico medico = MedicoDAO.getMedico(getCodigo());

        MedicoDialog medicoDialog = new MedicoDialog(null, true, medico, OperacaoEnum.EDITAR);

        medicoDialog.setVisible(true);
        preencherTabela();
    }
    
    private void buttonAdicionarMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAdicionarMedicoActionPerformed
         MedicoDialog m = new MedicoDialog(null, true, OperacaoEnum.ADICIONAR);
        m.setVisible(true);
        preencherTabela();
    }//GEN-LAST:event_buttonAdicionarMedicoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdicionarMedico;
    private javax.swing.JButton buttonEdiatrMedico;
    private javax.swing.JButton buttonExcluirMedico;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaMedico;
    // End of variables declaration//GEN-END:variables

private void ajustarTabela (){
    
    //Impedir que o ususario moviment as colunas
    tabelaMedico.getTableHeader().setReorderingAllowed(false);
    
    //bloquear alteração da tabela
    tabelaMedico

           .setDefaultEditor(Object.class  

                    , null);
    
    
    tabelaMedico.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
    tabelaMedico.getColumnModel().getColumn(0).setPreferredWidth(147);
    tabelaMedico.getColumnModel().getColumn(1).setPreferredWidth(200);
    tabelaMedico.getColumnModel().getColumn(2).setPreferredWidth(200);
    tabelaMedico.getColumnModel().getColumn(3).setPreferredWidth(200);
}


}
