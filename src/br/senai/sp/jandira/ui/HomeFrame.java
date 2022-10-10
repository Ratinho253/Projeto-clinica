/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.EspecialodadeDAO;
import java.awt.Toolkit;

public class HomeFrame extends javax.swing.JFrame {

    
    public HomeFrame() {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/br/senai/sp/jandira/img/agenda.png")));
        initPanels();
        
        
    }
    // Atributos de Classes
    PaneleEspecialidades paneleEspecialidades;
    
    // constantes
    private final int POS_X = 30;
    private final int POS_Y = 190;
    private final int POS_ALTURA = 310;
    private final int POS_LARGURA = 800;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel2 = new javax.swing.JPanel();
        iconeAgenda = new javax.swing.JLabel();
        textoAgenda = new javax.swing.JLabel();
        buttonPalnoDeSaude = new javax.swing.JButton();
        buttonEspecialidades = new javax.swing.JButton();
        buttonPaciente = new javax.swing.JButton();
        buttonMedico = new javax.swing.JButton();
        buttonSair = new javax.swing.JButton();
        panelHome = new javax.swing.JPanel();
        labelNomeDaEmpresa = new javax.swing.JLabel();
        labelSistemas = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        buttonAgenda1 = new javax.swing.JButton();
        buttonHome = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/agenda.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistemas de agendamentos");
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));
        jPanel2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(null);

        iconeAgenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/renomear.png"))); // NOI18N
        jPanel2.add(iconeAgenda);
        iconeAgenda.setBounds(20, 10, 90, 70);

        textoAgenda.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        textoAgenda.setForeground(new java.awt.Color(0, 0, 0));
        textoAgenda.setText("Sistema para Agendamento de consulta ");
        jPanel2.add(textoAgenda);
        textoAgenda.setBounds(90, 30, 600, 30);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 850, 100);

        buttonPalnoDeSaude.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/plano-de-saude.png"))); // NOI18N
        buttonPalnoDeSaude.setToolTipText("Plano de Saúde");
        buttonPalnoDeSaude.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPalnoDeSaudeActionPerformed(evt);
            }
        });
        getContentPane().add(buttonPalnoDeSaude);
        buttonPalnoDeSaude.setBounds(470, 120, 80, 50);

        buttonEspecialidades.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/medicina-alternativa.png"))); // NOI18N
        buttonEspecialidades.setToolTipText("Especialiades");
        buttonEspecialidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEspecialidadesActionPerformed(evt);
            }
        });
        getContentPane().add(buttonEspecialidades);
        buttonEspecialidades.setBounds(380, 120, 70, 50);

        buttonPaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/registo-medico.png"))); // NOI18N
        buttonPaciente.setToolTipText("Paciente");
        buttonPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPacienteActionPerformed(evt);
            }
        });
        getContentPane().add(buttonPaciente);
        buttonPaciente.setBounds(200, 120, 70, 50);

        buttonMedico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/medico (1).png"))); // NOI18N
        buttonMedico.setToolTipText("Médico");
        buttonMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMedicoActionPerformed(evt);
            }
        });
        getContentPane().add(buttonMedico);
        buttonMedico.setBounds(290, 120, 60, 50);

        buttonSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/saida (1).png"))); // NOI18N
        buttonSair.setToolTipText("Sair");
        buttonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSairActionPerformed(evt);
            }
        });
        getContentPane().add(buttonSair);
        buttonSair.setBounds(780, 110, 60, 40);

        panelHome.setBackground(new java.awt.Color(255, 255, 255));
        panelHome.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelHome.setLayout(null);

        labelNomeDaEmpresa.setBackground(new java.awt.Color(0, 0, 0));
        labelNomeDaEmpresa.setFont(new java.awt.Font("Arial Black", 3, 36)); // NOI18N
        labelNomeDaEmpresa.setForeground(new java.awt.Color(102, 102, 255));
        labelNomeDaEmpresa.setText("SISACON");
        panelHome.add(labelNomeDaEmpresa);
        labelNomeDaEmpresa.setBounds(40, 50, 220, 60);

        labelSistemas.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        labelSistemas.setForeground(new java.awt.Color(51, 51, 51));
        labelSistemas.setText("Sistemas para Agendamento de Consultas");
        panelHome.add(labelSistemas);
        labelSistemas.setBounds(40, 100, 750, 16);

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        panelHome.add(jPanel3);
        jPanel3.setBounds(0, 120, 800, 2);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Dados de contatos :");
        panelHome.add(jLabel4);
        jLabel4.setBounds(590, 140, 200, 20);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("E-mail: suportsisacon@gmail.com");
        panelHome.add(jLabel5);
        jLabel5.setBounds(590, 170, 220, 14);

        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Contato : (11) 95294212");
        panelHome.add(jLabel6);
        jLabel6.setBounds(590, 190, 200, 20);

        jLabel7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("www.Sisacon.com.br");
        panelHome.add(jLabel7);
        jLabel7.setBounds(590, 210, 200, 16);

        getContentPane().add(panelHome);
        panelHome.setBounds(30, 190, 800, 310);

        buttonAgenda1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/entrega-agendada.png"))); // NOI18N
        buttonAgenda1.setToolTipText("Agenda");
        getContentPane().add(buttonAgenda1);
        buttonAgenda1.setBounds(110, 120, 60, 50);

        buttonHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/botao-de-inicio.png"))); // NOI18N
        buttonHome.setToolTipText("Home");
        buttonHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonHomeActionPerformed(evt);
            }
        });
        getContentPane().add(buttonHome);
        buttonHome.setBounds(30, 120, 40, 40);

        setSize(new java.awt.Dimension(865, 543));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPacienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonPacienteActionPerformed

    private void buttonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSairActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonSairActionPerformed

    private void buttonPalnoDeSaudeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPalnoDeSaudeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonPalnoDeSaudeActionPerformed

    private void buttonMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMedicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonMedicoActionPerformed

    private void buttonEspecialidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEspecialidadesActionPerformed
        
     
       paneleEspecialidades.setVisible(true);
       panelHome.setVisible(false);
       
    }//GEN-LAST:event_buttonEspecialidadesActionPerformed

    private void buttonHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonHomeActionPerformed
        paneleEspecialidades.setVisible(false);
        panelHome.setVisible(true);
    }//GEN-LAST:event_buttonHomeActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAgenda1;
    private javax.swing.JButton buttonEspecialidades;
    private javax.swing.JButton buttonHome;
    private javax.swing.JButton buttonMedico;
    private javax.swing.JButton buttonPaciente;
    private javax.swing.JButton buttonPalnoDeSaude;
    private javax.swing.JButton buttonSair;
    private javax.swing.JLabel iconeAgenda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JLabel labelNomeDaEmpresa;
    private javax.swing.JLabel labelSistemas;
    private javax.swing.JPanel panelHome;
    private javax.swing.JLabel textoAgenda;
    // End of variables declaration//GEN-END:variables

    private void initPanels() {
        
        paneleEspecialidades = new PaneleEspecialidades();
          paneleEspecialidades.setBounds(
               POS_X, 
               POS_Y, 
               POS_LARGURA, 
               POS_ALTURA);
        
       getContentPane().add(paneleEspecialidades);
       paneleEspecialidades.setVisible(false);
       
    }
}





