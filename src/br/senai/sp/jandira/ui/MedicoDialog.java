package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.MedicoDAO;
import br.senai.sp.jandira.model.Medico;
import br.senai.sp.jandira.model.OperacaoEnum;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

public class MedicoDialog extends javax.swing.JDialog {

    private Medico medico;
    private OperacaoEnum operacao;
    
    public MedicoDialog(
            java.awt.Frame parent,
            boolean modal,
            OperacaoEnum operacao) {
            super(parent, modal);
             initComponents();
             this.operacao = operacao;  
            }
            
    
    public MedicoDialog(
            java.awt.Frame parent,
            boolean modal,
            Medico m,
            OperacaoEnum operacao) {

        super(parent, modal);
        initComponents();

        medico = m;
        this.operacao = operacao;

        preencherFormulario();
        preencherTitulo();
    }
    
    
    
     private void preencherFormulario() {

        textFieldCodigoMedico.setText(medico.getCodigo().toString());
        textFieldCrmMedico.setText(medico.getCrm());
        textFieldNomeMedico.setText(medico.getNome());
        textFieldTelefoneMedico.setText(medico.getTelefone());
        textFieldEmailMedico.setText(medico.getEmail());
        textFieldDataNascimentoMedico.setText(medico.getDataDeNascimento().format(DateTimeFormatter.ofPattern("dd/mm/yyyy")));
    }
     
     
     private void preencherTitulo() {
        labelMedicoAdicionar.setText("Médico - " + operacao);

        if (operacao == OperacaoEnum.EDITAR) {
            labelMedicoAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/editar.png")));
        } else {
            labelMedicoAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/adicionar.png")));
        }

    }
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        detalhesPanel = new javax.swing.JPanel();
        textFieldNomeMedico = new javax.swing.JLabel();
        descricaoTextField = new javax.swing.JTextField();
        codigoLabel = new javax.swing.JLabel();
        textFieldCodigoMedico = new javax.swing.JTextField();
        textFieldCrmMedico = new javax.swing.JLabel();
        codigoTextField1 = new javax.swing.JTextField();
        textFieldTelefoneMedico = new javax.swing.JLabel();
        textFieldEmailMedico = new javax.swing.JLabel();
        textFieldDataNascimentoMedico = new javax.swing.JLabel();
        codigoTextField3 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        codigoLabel4 = new javax.swing.JLabel();
        ButtonDireitoMedico = new javax.swing.JButton();
        ButtonEsquerdoMedico = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        codigoLabel5 = new javax.swing.JLabel();
        adicionarEspecialidadeTextField1 = new javax.swing.JTextField();
        adicionarEspecialidadeTextField2 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        labelMedicoAdicionar = new javax.swing.JLabel();
        ButtonSalvar = new javax.swing.JButton();
        ButtonCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        detalhesPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detalhes da Especialidades", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(153, 153, 255))); // NOI18N
        detalhesPanel.setLayout(null);

        textFieldNomeMedico.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        textFieldNomeMedico.setForeground(new java.awt.Color(255, 0, 102));
        textFieldNomeMedico.setText("Nome do(a) médico(a):");
        detalhesPanel.add(textFieldNomeMedico);
        textFieldNomeMedico.setBounds(220, 40, 146, 17);

        descricaoTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descricaoTextFieldActionPerformed(evt);
            }
        });
        detalhesPanel.add(descricaoTextField);
        descricaoTextField.setBounds(200, 60, 390, 22);

        codigoLabel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        codigoLabel.setForeground(new java.awt.Color(255, 51, 51));
        codigoLabel.setText("Lista de Espcialidades ");
        detalhesPanel.add(codigoLabel);
        codigoLabel.setBounds(10, 150, 160, 20);

        textFieldCodigoMedico.setEditable(false);
        textFieldCodigoMedico.setBackground(new java.awt.Color(255, 204, 51));
        textFieldCodigoMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldCodigoMedicoActionPerformed(evt);
            }
        });
        detalhesPanel.add(textFieldCodigoMedico);
        textFieldCodigoMedico.setBounds(20, 60, 60, 22);

        textFieldCrmMedico.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        textFieldCrmMedico.setForeground(new java.awt.Color(255, 51, 51));
        textFieldCrmMedico.setText("CRM:");
        detalhesPanel.add(textFieldCrmMedico);
        textFieldCrmMedico.setBounds(120, 40, 40, 17);

        codigoTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigoTextField1ActionPerformed(evt);
            }
        });
        detalhesPanel.add(codigoTextField1);
        codigoTextField1.setBounds(20, 110, 100, 22);

        textFieldTelefoneMedico.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        textFieldTelefoneMedico.setForeground(new java.awt.Color(255, 51, 51));
        textFieldTelefoneMedico.setText("Telefone:");
        detalhesPanel.add(textFieldTelefoneMedico);
        textFieldTelefoneMedico.setBounds(20, 90, 70, 20);

        textFieldEmailMedico.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        textFieldEmailMedico.setForeground(new java.awt.Color(255, 51, 51));
        textFieldEmailMedico.setText(" E - mail");
        detalhesPanel.add(textFieldEmailMedico);
        textFieldEmailMedico.setBounds(250, 90, 70, 20);

        textFieldDataNascimentoMedico.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        textFieldDataNascimentoMedico.setForeground(new java.awt.Color(255, 51, 51));
        textFieldDataNascimentoMedico.setText("Data de nascimento:");
        detalhesPanel.add(textFieldDataNascimentoMedico);
        textFieldDataNascimentoMedico.setBounds(470, 90, 140, 20);

        codigoTextField3.setEditable(false);
        codigoTextField3.setBackground(new java.awt.Color(255, 204, 51));
        codigoTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigoTextField3ActionPerformed(evt);
            }
        });
        detalhesPanel.add(codigoTextField3);
        codigoTextField3.setBounds(470, 110, 130, 22);

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        detalhesPanel.add(jScrollPane1);
        jScrollPane1.setBounds(10, 170, 120, 120);

        codigoLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        codigoLabel4.setForeground(new java.awt.Color(255, 51, 51));
        codigoLabel4.setText("Código");
        detalhesPanel.add(codigoLabel4);
        codigoLabel4.setBounds(20, 40, 70, 20);

        ButtonDireitoMedico.setText(">");
        ButtonDireitoMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonDireitoMedicoActionPerformed(evt);
            }
        });
        detalhesPanel.add(ButtonDireitoMedico);
        ButtonDireitoMedico.setBounds(170, 190, 40, 30);

        ButtonEsquerdoMedico.setText("<");
        ButtonEsquerdoMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonEsquerdoMedicoActionPerformed(evt);
            }
        });
        detalhesPanel.add(ButtonEsquerdoMedico);
        ButtonEsquerdoMedico.setBounds(170, 240, 40, 30);

        jList2.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList2);

        detalhesPanel.add(jScrollPane2);
        jScrollPane2.setBounds(230, 170, 120, 120);

        codigoLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        codigoLabel5.setForeground(new java.awt.Color(255, 51, 51));
        codigoLabel5.setText("Lista de Espcialidades do médico  ");
        detalhesPanel.add(codigoLabel5);
        codigoLabel5.setBounds(230, 150, 230, 20);

        adicionarEspecialidadeTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicionarEspecialidadeTextField1ActionPerformed(evt);
            }
        });
        detalhesPanel.add(adicionarEspecialidadeTextField1);
        adicionarEspecialidadeTextField1.setBounds(130, 110, 330, 22);

        adicionarEspecialidadeTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicionarEspecialidadeTextField2ActionPerformed(evt);
            }
        });
        detalhesPanel.add(adicionarEspecialidadeTextField2);
        adicionarEspecialidadeTextField2.setBounds(86, 60, 100, 22);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        labelMedicoAdicionar.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        labelMedicoAdicionar.setText("Adicionar - Medico");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(labelMedicoAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(labelMedicoAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        ButtonSalvar.setText("Salvar");
        ButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSalvarActionPerformed(evt);
            }
        });

        ButtonCancelar.setText("Cancelar");
        ButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(detalhesPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(391, Short.MAX_VALUE)
                .addComponent(ButtonCancelar)
                .addGap(35, 35, 35)
                .addComponent(ButtonSalvar)
                .addGap(42, 42, 42))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(detalhesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonCancelar)
                    .addComponent(ButtonSalvar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void descricaoTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descricaoTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_descricaoTextFieldActionPerformed

    private void textFieldCodigoMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldCodigoMedicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldCodigoMedicoActionPerformed

    private void codigoTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigoTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codigoTextField1ActionPerformed

    private void codigoTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigoTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codigoTextField3ActionPerformed

    private void ButtonEsquerdoMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonEsquerdoMedicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonEsquerdoMedicoActionPerformed

    private void ButtonDireitoMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonDireitoMedicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonDireitoMedicoActionPerformed

    private void ButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSalvarActionPerformed
        dispose();
    }//GEN-LAST:event_ButtonSalvarActionPerformed

    private void ButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCancelarActionPerformed
        
       if (operacao == OperacaoEnum.ADICIONAR) {
            adicionar();
        } else {
            editar();
        } 
        
    }//GEN-LAST:event_ButtonCancelarActionPerformed

    private void adicionarEspecialidadeTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionarEspecialidadeTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adicionarEspecialidadeTextField1ActionPerformed

    private void adicionarEspecialidadeTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionarEspecialidadeTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adicionarEspecialidadeTextField2ActionPerformed

    private void editar() {
        medico.setCrm(textFieldCrmMedico.getText());
        medico.setNome(textFieldNomeMedico.getText());
        medico.setTelefone(textFieldTelefoneMedico.getText());
        medico.setEmail(textFieldEmailMedico.getText());
        medico.setDataDeNascimento(LocalDate.parse(textFieldDataNascimentoMedico.getText(), DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        MedicoDAO.atualizar(medico);

        JOptionPane.showMessageDialog(
                null,
                "Médico atualizado com sucesso!",
                "Médico",
                JOptionPane.INFORMATION_MESSAGE);

        dispose();
    }
    
    private void adicionar() {
        
        
        if (textFieldCrmMedico.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "O CRM do médico é obrigatório!", "Erro", JOptionPane.WARNING_MESSAGE);
            textFieldCrmMedico.requestFocus();
        } else if (textFieldEmailMedico.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "O email do médico é obrigatório!", "Erro", JOptionPane.WARNING_MESSAGE);
            textFieldEmailMedico.requestFocus();
        } else if (textFieldNomeMedico.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "O nome do médico é obrigatório!", "Erro", JOptionPane.WARNING_MESSAGE);
            textFieldNomeMedico.requestFocus();
        } else if (textFieldDataNascimentoMedico.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "A data de nascimento do médico é obrigatório!", "Erro", JOptionPane.WARNING_MESSAGE);
            textFieldDataNascimentoMedico.requestFocus();
        } else if (textFieldTelefoneMedico.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "O telefone do médico é obrigatório!", "Erro", JOptionPane.WARNING_MESSAGE);
            textFieldTelefoneMedico.requestFocus();
        } else {
        
            // Criar um objeto Medico
            Medico novoMedico = new Medico();
            novoMedico.setCrm(textFieldCrmMedico.getText());
            novoMedico.setNome(textFieldNomeMedico.getText());
            novoMedico.setTelefone(textFieldTelefoneMedico.getText());
            novoMedico.setEmail(textFieldEmailMedico.getText());
            novoMedico.setDataDeNascimento(LocalDate.parse(textFieldDataNascimentoMedico.getText(), DateTimeFormatter.ofPattern("dd/MM/yyyy")));

            // Gravar o objeto, através do Dao.
            MedicoDAO.gravar(medico);

            JOptionPane.showMessageDialog(
                    this,
                    "Médico gravado com sucesso!",
                    "Médicos",
                    JOptionPane.INFORMATION_MESSAGE);

            dispose();
        }
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonCancelar;
    private javax.swing.JButton ButtonDireitoMedico;
    private javax.swing.JButton ButtonEsquerdoMedico;
    private javax.swing.JButton ButtonSalvar;
    private javax.swing.JTextField adicionarEspecialidadeTextField1;
    private javax.swing.JTextField adicionarEspecialidadeTextField2;
    private javax.swing.JLabel codigoLabel;
    private javax.swing.JLabel codigoLabel4;
    private javax.swing.JLabel codigoLabel5;
    private javax.swing.JTextField codigoTextField1;
    private javax.swing.JTextField codigoTextField3;
    private javax.swing.JTextField descricaoTextField;
    private javax.swing.JPanel detalhesPanel;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelMedicoAdicionar;
    private javax.swing.JTextField textFieldCodigoMedico;
    private javax.swing.JLabel textFieldCrmMedico;
    private javax.swing.JLabel textFieldDataNascimentoMedico;
    private javax.swing.JLabel textFieldEmailMedico;
    private javax.swing.JLabel textFieldNomeMedico;
    private javax.swing.JLabel textFieldTelefoneMedico;
    // End of variables declaration//GEN-END:variables
}
