/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.PlanoDeSaudeDAO;
import br.senai.sp.jandira.model.OperacaoEnum;
import br.senai.sp.jandira.model.PlanoDeSaude;
import javax.swing.JOptionPane;
import javax.swing.JTable;


public class PanelPlanoDeSaude extends javax.swing.JPanel {
    
    private int linha;
    
      public PanelPlanoDeSaude() {
        initComponents();
          PlanoDeSaudeDAO.criarListaDePlanos();

       preencherTabela();

    }
      
      private int getLinha() {
        linha = tabelaPlanos.getSelectedRow();
        return linha;
    }
   
      
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaPlanos = new javax.swing.JTable();
        buttonExcluirPlano = new javax.swing.JButton();
        buttonEdiatrPlano = new javax.swing.JButton();
        buttonAdicionarPlano = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Planos de saúde", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 51, 0))); // NOI18N
        setPreferredSize(new java.awt.Dimension(800, 310));
        setLayout(null);

        tabelaPlanos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tabelaPlanos);

        add(jScrollPane1);
        jScrollPane1.setBounds(30, 20, 750, 240);

        buttonExcluirPlano.setText("Excluir");
        buttonExcluirPlano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExcluirPlanoActionPerformed(evt);
            }
        });
        add(buttonExcluirPlano);
        buttonExcluirPlano.setBounds(542, 270, 80, 23);

        buttonEdiatrPlano.setText("Editar");
        buttonEdiatrPlano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEdiatrPlanoActionPerformed(evt);
            }
        });
        add(buttonEdiatrPlano);
        buttonEdiatrPlano.setBounds(630, 270, 75, 23);

        buttonAdicionarPlano.setText("Adicionar");
        buttonAdicionarPlano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAdicionarPlanoActionPerformed(evt);
            }
        });
        add(buttonAdicionarPlano);
        buttonAdicionarPlano.setBounds(710, 270, 81, 23);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonExcluirPlanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExcluirPlanoActionPerformed
     if (getLinha() != -1) {
            excluirPlanos(linha);
        } else {
            JOptionPane.showMessageDialog(
                    this,
                    "Por favor, selecione a especialidade que vc deseja exluir",
                    "Atenção",
                    JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_buttonExcluirPlanoActionPerformed
   private void excluirPlanos(int linha) {

        int resposta = JOptionPane.showConfirmDialog(
                this,
                "Vc confirma a exclusão",
                "Atenção",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);

        if (resposta == 0) {
            PlanoDeSaudeDAO.excluir(getCodigo());
            preencherTabela(); 
        }
       
}
       private Integer getCodigo(){
        String codiStr = tabelaPlanos.getValueAt(getLinha(), 0).toString();
        Integer codigo = Integer.valueOf(codiStr);
        return codigo;
    }
        private void editarPlanos(){

           PlanoDeSaude planoDeSaude = PlanoDeSaudeDAO.getPlanoDeSaude(getCodigo());

            PlanoDeSaudeDialog planoDeSaudeDialog = new PlanoDeSaudeDialog(null,
                    true,
                    planoDeSaude,
                    OperacaoEnum.EDITAR);
            planoDeSaudeDialog.setVisible(true);
               preencherTabela();
        }
    
    private void buttonAdicionarPlanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAdicionarPlanoActionPerformed
        PlanoDeSaudeDialog planoDeSaudeDialog = new PlanoDeSaudeDialog(null, true, OperacaoEnum.ADICIONAR);
        planoDeSaudeDialog.setVisible(true);
        
        preencherTabela();
    }//GEN-LAST:event_buttonAdicionarPlanoActionPerformed

    private void buttonEdiatrPlanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEdiatrPlanoActionPerformed
                  
       if(getLinha() !=-1){
           editarPlanos();
       }else{
           JOptionPane.showMessageDialog(
                   this,
                   "Por favor escolha uma especialidade de editação",
                   "Especialidade",
                   JOptionPane.WARNING_MESSAGE);
       }
        
    }//GEN-LAST:event_buttonEdiatrPlanoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdicionarPlano;
    private javax.swing.JButton buttonEdiatrPlano;
    private javax.swing.JButton buttonExcluirPlano;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaPlanos;
    // End of variables declaration//GEN-END:variables

     private void preencherTabela() {

          tabelaPlanos.setModel(PlanoDeSaudeDAO.getTabelaPlanoDeSaude());
        ajustarTabela();
        
    }
      private void ajustarTabela (){
    
    //Impedir que o ususario moviment as colunas
    tabelaPlanos.getTableHeader().setReorderingAllowed(false);
    
    //bloquear alteração da tabela
    tabelaPlanos

           .setDefaultEditor(Object.class  

                    , null);
    
    
    tabelaPlanos.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
    tabelaPlanos.getColumnModel().getColumn(0).setPreferredWidth(50);
    tabelaPlanos.getColumnModel().getColumn(1).setPreferredWidth(170);
    tabelaPlanos.getColumnModel().getColumn(2).setPreferredWidth(180);
    tabelaPlanos.getColumnModel().getColumn(3).setPreferredWidth(176);
    tabelaPlanos.getColumnModel().getColumn(4).setPreferredWidth(170);
    
}

}
