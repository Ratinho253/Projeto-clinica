/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.model.OperacaoEnum;
import br.senai.sp.jandira.model.PlanoDeSaude;

/**
 *
 * @author 22282229
 */
public class PlanoDeSaudeDialog extends javax.swing.JDialog {

    private PlanoDeSaude planoDeSaude;
    private OperacaoEnum operacao;
    
    public PlanoDeSaudeDialog(
            java.awt.Frame parent, 
            boolean modal,
            OperacaoEnum operacao
            ) {
        
        super(parent, modal);
        initComponents();
        this.operacao = operacao;
      
    }
       public PlanoDeSaudeDialog(
            java.awt.Frame parent, 
            boolean modal,
            PlanoDeSaude e,
            OperacaoEnum operacao) {
        
        super(parent, modal);
        initComponents();
        
        planoDeSaude = e ;
        this.operacao = operacao;
        
        preencherFormulario();
        preencherTitulo();
    }
    private void preencherFormulario(){
        
       
        
        textFieldCodigo.setText(planoDeSaude.getCodigo().toString());
        textFieldOperadora.setText(planoDeSaude.getOperadora());
        textFieldCategoria.setText(planoDeSaude.getCategoria());
        textFieldCarteirinha.setText(planoDeSaude.getNumero());
        textFieldValidade.setText(planoDeSaude.getValidade());
        
    }
    
    
    public PlanoDeSaudeDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        inicioPanel = new javax.swing.JPanel();
        textoLabel = new javax.swing.JLabel();
        labelCodigo = new javax.swing.JLabel();
        textFieldCodigo = new javax.swing.JTextField();
        labelOperadora = new javax.swing.JLabel();
        textFieldOperadora = new javax.swing.JTextField();
        labelcategoria = new javax.swing.JLabel();
        textFieldCategoria = new javax.swing.JTextField();
        labelCarteirinha = new javax.swing.JLabel();
        textFieldCarteirinha = new javax.swing.JTextField();
        labelValidade = new javax.swing.JLabel();
        textFieldValidade = new javax.swing.JTextField();
        buttonExcluir = new javax.swing.JButton();
        buttonSalvar = new javax.swing.JButton();
        spinnerMes = new javax.swing.JSpinner();
        jSpinner2 = new javax.swing.JSpinner();
        jSpinner3 = new javax.swing.JSpinner();
        spinnerDia = new javax.swing.JSpinner();
        spinnerAno = new javax.swing.JSpinner();
        labelAno = new javax.swing.JLabel();
        labeldia = new javax.swing.JLabel();
        labelMes = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        jScrollPane2.setViewportView(jTree1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        inicioPanel.setBackground(new java.awt.Color(255, 255, 255));
        inicioPanel.setLayout(null);

        textoLabel.setBackground(new java.awt.Color(0, 0, 255));
        textoLabel.setFont(new java.awt.Font("Arial", 2, 24)); // NOI18N
        textoLabel.setForeground(new java.awt.Color(0, 51, 255));
        textoLabel.setText("Adicionar novo Plano");
        inicioPanel.add(textoLabel);
        textoLabel.setBounds(150, 40, 230, 30);

        getContentPane().add(inicioPanel);
        inicioPanel.setBounds(0, 0, 550, 110);

        labelCodigo.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        labelCodigo.setForeground(new java.awt.Color(255, 51, 51));
        labelCodigo.setText("Codigo");
        getContentPane().add(labelCodigo);
        labelCodigo.setBounds(10, 140, 70, 16);

        textFieldCodigo.setBackground(new java.awt.Color(255, 204, 51));
        textFieldCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldCodigoActionPerformed(evt);
            }
        });
        getContentPane().add(textFieldCodigo);
        textFieldCodigo.setBounds(10, 160, 90, 22);

        labelOperadora.setText("Operadora");
        getContentPane().add(labelOperadora);
        labelOperadora.setBounds(20, 210, 90, 20);

        textFieldOperadora.setBackground(new java.awt.Color(255, 255, 255));
        textFieldOperadora.setForeground(new java.awt.Color(0, 0, 0));
        textFieldOperadora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldOperadoraActionPerformed(evt);
            }
        });
        getContentPane().add(textFieldOperadora);
        textFieldOperadora.setBounds(10, 240, 180, 22);

        labelcategoria.setText("Categoria");
        getContentPane().add(labelcategoria);
        labelcategoria.setBounds(300, 210, 110, 20);

        textFieldCategoria.setBackground(new java.awt.Color(255, 255, 255));
        textFieldCategoria.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(textFieldCategoria);
        textFieldCategoria.setBounds(290, 240, 190, 22);

        labelCarteirinha.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        labelCarteirinha.setForeground(new java.awt.Color(255, 51, 51));
        labelCarteirinha.setText("Numero da Carteirinha");
        getContentPane().add(labelCarteirinha);
        labelCarteirinha.setBounds(10, 290, 160, 18);

        textFieldCarteirinha.setBackground(new java.awt.Color(255, 255, 255));
        textFieldCarteirinha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldCarteirinhaActionPerformed(evt);
            }
        });
        getContentPane().add(textFieldCarteirinha);
        textFieldCarteirinha.setBounds(10, 310, 200, 22);

        labelValidade.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        labelValidade.setForeground(new java.awt.Color(255, 51, 51));
        labelValidade.setText("Validade");
        getContentPane().add(labelValidade);
        labelValidade.setBounds(300, 290, 150, 16);

        textFieldValidade.setBackground(new java.awt.Color(255, 255, 255));
        textFieldValidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldValidadeActionPerformed(evt);
            }
        });
        getContentPane().add(textFieldValidade);
        textFieldValidade.setBounds(290, 310, 190, 22);

        buttonExcluir.setText("Excluir");
        getContentPane().add(buttonExcluir);
        buttonExcluir.setBounds(340, 400, 75, 23);

        buttonSalvar.setText("Salvar");
        getContentPane().add(buttonSalvar);
        buttonSalvar.setBounds(450, 400, 75, 23);
        getContentPane().add(spinnerMes);
        spinnerMes.setBounds(100, 390, 64, 22);
        getContentPane().add(jSpinner2);
        jSpinner2.setBounds(20, 390, 64, 22);
        getContentPane().add(jSpinner3);
        jSpinner3.setBounds(100, 390, 64, 22);
        getContentPane().add(spinnerDia);
        spinnerDia.setBounds(20, 390, 64, 22);
        getContentPane().add(spinnerAno);
        spinnerAno.setBounds(190, 390, 64, 22);

        labelAno.setText("Ano");
        getContentPane().add(labelAno);
        labelAno.setBounds(200, 370, 37, 16);

        labeldia.setText("dia");
        getContentPane().add(labeldia);
        labeldia.setBounds(40, 370, 16, 16);

        labelMes.setText("Mes");
        getContentPane().add(labelMes);
        labelMes.setBounds(120, 370, 22, 16);

        setSize(new java.awt.Dimension(564, 466));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void textFieldCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldCodigoActionPerformed

    private void textFieldCarteirinhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldCarteirinhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldCarteirinhaActionPerformed

    private void textFieldValidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldValidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldValidadeActionPerformed

    private void textFieldOperadoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldOperadoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldOperadoraActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PlanoDeSaudeDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PlanoDeSaudeDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PlanoDeSaudeDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PlanoDeSaudeDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                PlanoDeSaudeDialog dialog = new PlanoDeSaudeDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonExcluir;
    private javax.swing.JButton buttonSalvar;
    private javax.swing.JPanel inicioPanel;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JSpinner jSpinner3;
    private javax.swing.JTree jTree1;
    private javax.swing.JLabel labelAno;
    private javax.swing.JLabel labelCarteirinha;
    private javax.swing.JLabel labelCodigo;
    private javax.swing.JLabel labelMes;
    private javax.swing.JLabel labelOperadora;
    private javax.swing.JLabel labelValidade;
    private javax.swing.JLabel labelcategoria;
    private javax.swing.JLabel labeldia;
    private javax.swing.JSpinner spinnerAno;
    private javax.swing.JSpinner spinnerDia;
    private javax.swing.JSpinner spinnerMes;
    private javax.swing.JTextField textFieldCarteirinha;
    private javax.swing.JTextField textFieldCategoria;
    private javax.swing.JTextField textFieldCodigo;
    private javax.swing.JTextField textFieldOperadora;
    private javax.swing.JTextField textFieldValidade;
    private javax.swing.JLabel textoLabel;
    // End of variables declaration//GEN-END:variables
}
