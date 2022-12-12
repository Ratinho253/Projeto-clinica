package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.EspecialodadeDAO;
import br.senai.sp.jandira.dao.MedicoDAO;
import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.Medico;
import br.senai.sp.jandira.model.OperacaoEnum;
import com.sun.nio.sctp.PeerAddressChangeNotification;
import java.awt.BorderLayout;
import java.awt.SecondaryLoop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.ListModel;

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
        adicionandoNaList();
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
        adicionandoNaList();
    }

    private void preencherFormulario() {

        textFieldCodigoMedico.setText(medico.getCodigo().toString());
        TextFildCrmMedico1.setText(medico.getCrm());
        textFieldNomeMedico.setText(medico.getNome());
        textFildTelefoneMedico.setText(medico.getTelefone());
        textFieldEmail.setText(medico.getEmail());
        textFildDataNascimento.setText(medico.getDataDeNascimento().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
    }

    private void preencherTitulo() {
        labelMedicoAdicionar.setText("Médico - " + operacao);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        detalhesPanel = new javax.swing.JPanel();
        LabelNomeDoMedico = new javax.swing.JLabel();
        textFieldNomeMedico = new javax.swing.JTextField();
        codigoLabel = new javax.swing.JLabel();
        textFieldCodigoMedico = new javax.swing.JTextField();
        crmMedicoLabel = new javax.swing.JLabel();
        textFildTelefoneMedico = new javax.swing.JTextField();
        labelTelefoneMedico = new javax.swing.JLabel();
        labelEmailMedico = new javax.swing.JLabel();
        labelDataNascimento = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListListaDeEspecialidade = new javax.swing.JList<>();
        codigoLabel4 = new javax.swing.JLabel();
        ButtonDireitoMedico = new javax.swing.JButton();
        ButtonEsquerdoMedico = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListMedico = new javax.swing.JList<>();
        codigoLabel5 = new javax.swing.JLabel();
        textFieldEmail = new javax.swing.JTextField();
        TextFildCrmMedico1 = new javax.swing.JTextField();
        textFildDataNascimento = new javax.swing.JFormattedTextField();
        jPanel1 = new javax.swing.JPanel();
        labelMedicoAdicionar = new javax.swing.JLabel();
        ButtonSalvar = new javax.swing.JButton();
        ButtonCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        detalhesPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detalhes da Especialidades", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(153, 153, 255))); // NOI18N
        detalhesPanel.setLayout(null);

        LabelNomeDoMedico.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        LabelNomeDoMedico.setForeground(new java.awt.Color(255, 0, 102));
        LabelNomeDoMedico.setText("Nome do(a) médico(a):");
        detalhesPanel.add(LabelNomeDoMedico);
        LabelNomeDoMedico.setBounds(220, 40, 146, 17);

        textFieldNomeMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldNomeMedicoActionPerformed(evt);
            }
        });
        detalhesPanel.add(textFieldNomeMedico);
        textFieldNomeMedico.setBounds(200, 60, 390, 22);

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

        crmMedicoLabel.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        crmMedicoLabel.setForeground(new java.awt.Color(255, 51, 51));
        crmMedicoLabel.setText("CRM:");
        detalhesPanel.add(crmMedicoLabel);
        crmMedicoLabel.setBounds(120, 40, 40, 17);

        textFildTelefoneMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFildTelefoneMedicoActionPerformed(evt);
            }
        });
        detalhesPanel.add(textFildTelefoneMedico);
        textFildTelefoneMedico.setBounds(20, 110, 100, 22);

        labelTelefoneMedico.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        labelTelefoneMedico.setForeground(new java.awt.Color(255, 51, 51));
        labelTelefoneMedico.setText("Telefone:");
        detalhesPanel.add(labelTelefoneMedico);
        labelTelefoneMedico.setBounds(20, 90, 70, 20);

        labelEmailMedico.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        labelEmailMedico.setForeground(new java.awt.Color(255, 51, 51));
        labelEmailMedico.setText(" E - mail");
        detalhesPanel.add(labelEmailMedico);
        labelEmailMedico.setBounds(250, 90, 70, 20);

        labelDataNascimento.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        labelDataNascimento.setForeground(new java.awt.Color(255, 51, 51));
        labelDataNascimento.setText("Data de nascimento:");
        detalhesPanel.add(labelDataNascimento);
        labelDataNascimento.setBounds(470, 90, 140, 20);

        jScrollPane1.setViewportView(ListListaDeEspecialidade);

        detalhesPanel.add(jScrollPane1);
        jScrollPane1.setBounds(10, 170, 190, 120);

        codigoLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        codigoLabel4.setForeground(new java.awt.Color(255, 51, 51));
        codigoLabel4.setText("Código");
        detalhesPanel.add(codigoLabel4);
        codigoLabel4.setBounds(20, 40, 70, 20);

        ButtonDireitoMedico.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        ButtonDireitoMedico.setText(">");
        ButtonDireitoMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonDireitoMedicoActionPerformed(evt);
            }
        });
        detalhesPanel.add(ButtonDireitoMedico);
        ButtonDireitoMedico.setBounds(220, 170, 55, 40);

        ButtonEsquerdoMedico.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        ButtonEsquerdoMedico.setText("<");
        ButtonEsquerdoMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonEsquerdoMedicoActionPerformed(evt);
            }
        });
        detalhesPanel.add(ButtonEsquerdoMedico);
        ButtonEsquerdoMedico.setBounds(220, 230, 55, 40);

        jListMedico.setToolTipText("");
        jScrollPane2.setViewportView(jListMedico);

        detalhesPanel.add(jScrollPane2);
        jScrollPane2.setBounds(300, 170, 240, 120);

        codigoLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        codigoLabel5.setForeground(new java.awt.Color(255, 51, 51));
        codigoLabel5.setText("Lista de Espcialidades do médico  ");
        detalhesPanel.add(codigoLabel5);
        codigoLabel5.setBounds(300, 150, 230, 20);

        textFieldEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldEmailActionPerformed(evt);
            }
        });
        detalhesPanel.add(textFieldEmail);
        textFieldEmail.setBounds(130, 110, 330, 22);

        TextFildCrmMedico1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFildCrmMedico1ActionPerformed(evt);
            }
        });
        detalhesPanel.add(TextFildCrmMedico1);
        TextFildCrmMedico1.setBounds(86, 60, 100, 22);
        detalhesPanel.add(textFildDataNascimento);
        textFildDataNascimento.setBounds(470, 110, 64, 22);
        try{
            textFildDataNascimento.setFormatterFactory(new javax.swing.text.
                DefaultFormatterFactory(new javax.swing.text.MaskFormatter
                    ("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

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

    private void textFieldNomeMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldNomeMedicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldNomeMedicoActionPerformed

    private void textFieldCodigoMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldCodigoMedicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldCodigoMedicoActionPerformed

    private void textFildTelefoneMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFildTelefoneMedicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFildTelefoneMedicoActionPerformed

    private void ButtonEsquerdoMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonEsquerdoMedicoActionPerformed

        int resposta = JOptionPane.showConfirmDialog(
                this,
                "Deseja realmente deletar?",
                "Atenção", JOptionPane.YES_NO_OPTION,
                JOptionPane.WARNING_MESSAGE);
        if (resposta == 0) {

            if (jListMedico.isSelectionEmpty() == false) {
                ArrayList<String> novaListaMedicos = new ArrayList<>();
                int tamanho = jListMedico.getModel().getSize();

                for (int i = 0; i < tamanho; i++) {
                    novaListaMedicos.add(jListMedico.getModel().getElementAt(i));
                }
                novaListaMedicos.remove(jListMedico.getSelectedValue());

                DefaultListModel<String> listaEspecialidadeMedicoModel = new DefaultListModel<>();
                for (String acaoVoltar : novaListaMedicos) {
                    listaEspecialidadeMedicoModel.addElement(acaoVoltar);
                }
                jListMedico.setModel(listaEspecialidadeMedicoModel);

            } else {
                JOptionPane.showMessageDialog(
                        this,
                        "Não contém nenhuma especialidade na lista",
                        "Editando Médico",
                        JOptionPane.WARNING_MESSAGE);
            }

        }


    }//GEN-LAST:event_ButtonEsquerdoMedicoActionPerformed

    private void ButtonDireitoMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonDireitoMedicoActionPerformed

        if (jListMedico.isSelectionEmpty() == true) {

            ArrayList<String> novaLista = new ArrayList<>();

            int tamanho = jListMedico.getModel().getSize();
            for (int i = 0; i < tamanho; i++) {
                novaLista.add(jListMedico.getModel().getElementAt(i));
            }

            if (novaLista.contains(ListListaDeEspecialidade.getSelectedValue()) == false) {
                novaLista.add(ListListaDeEspecialidade.getSelectedValue());

                DefaultListModel<String> listaEspecilidadeMedicoModel = new DefaultListModel<>();

                for (String acaoDoBotaoAvancar : novaLista) {
                    listaEspecilidadeMedicoModel.addElement(acaoDoBotaoAvancar);
                }
                jListMedico.setModel(listaEspecilidadeMedicoModel);

            } else {
                JOptionPane.showMessageDialog(null,
                        "Você não pode adicionar ema especialidade já cadastrada!",
                        "Médico",
                        JOptionPane.WARNING_MESSAGE);
            }

        } else {
            JOptionPane.showMessageDialog(
                    this,
                    "Selecione uma especialidade",
                    "Médico",
                    JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_ButtonDireitoMedicoActionPerformed

    private void ButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSalvarActionPerformed
        CharSequence s = " ";

        if (TextFildCrmMedico1.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor,digite o número do CRM");
            TextFildCrmMedico1.requestFocus();
        } else if (textFieldNomeMedico.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor,digite o nome do Médico");
            textFieldNomeMedico.requestFocus();
        } else if (textFildTelefoneMedico.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor,digite o Telefone do Médico");
            textFildTelefoneMedico.requestFocus();
        } else if (textFieldEmail.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor,digite o e-mail do Médico");
            textFieldEmail.requestFocus();
        } else if (textFildDataNascimento.getText().contains(s) == true) {
            JOptionPane.showMessageDialog(this, "Por favor,digite a Validade do Plano");
            textFildDataNascimento.requestFocus();
        } else {
            if (operacao == OperacaoEnum.ADICIONAR) {
                adicionar();
            } else {
                editar();
            }

        }
    }//GEN-LAST:event_ButtonSalvarActionPerformed
//evento do button salvar
    private ArrayList<Especialidade> pegarEspecialidades(JList<String> lista) {
        int tamanho = lista.getModel().getSize();
       
        ArrayList<Especialidade> listaNova = new ArrayList();
        
        for (int i = 0; i < tamanho; i++) {
            int codigo = Integer.valueOf(lista.getModel().getElementAt(i).substring(0, 3));// 100 - Cardiologia
            Especialidade e = EspecialodadeDAO.getEspecialidade(codigo);
            listaNova.add(e);
        }
        return listaNova;
    }
    private void ButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCancelarActionPerformed

        dispose();

    }//GEN-LAST:event_ButtonCancelarActionPerformed

    private void textFieldEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldEmailActionPerformed

    private void TextFildCrmMedico1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFildCrmMedico1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFildCrmMedico1ActionPerformed

    private void editar() {
        medico.setCrm(TextFildCrmMedico1.getText());
        medico.setNome(textFieldNomeMedico.getText());
        medico.setTelefone(textFildTelefoneMedico.getText());
        medico.setEmail(textFieldEmail.getText());
        medico.setDataDeNascimento(LocalDate.parse(textFildDataNascimento.getText(), DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        MedicoDAO.atualizar(medico);

        JOptionPane.showMessageDialog(
                null,
                "Médico atualizado com sucesso!",
                "Médico",
                JOptionPane.INFORMATION_MESSAGE);

        dispose();
    }

    private void adicionar() {

        if (TextFildCrmMedico1.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "O CRM do médico é obrigatório!", "Erro", JOptionPane.WARNING_MESSAGE);
            TextFildCrmMedico1.requestFocus();
        } else if (textFieldEmail.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "O email do médico é obrigatório!", "Erro", JOptionPane.WARNING_MESSAGE);
            textFieldEmail.requestFocus();
        } else if (textFieldNomeMedico.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "O nome do médico é obrigatório!", "Erro", JOptionPane.WARNING_MESSAGE);
            textFieldNomeMedico.requestFocus();
        } else if (textFildDataNascimento.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "A data de nascimento do médico é obrigatório!", "Erro", JOptionPane.WARNING_MESSAGE);
            textFildDataNascimento.requestFocus();
        } else if (textFildTelefoneMedico.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "O telefone do médico é obrigatório!", "Erro", JOptionPane.WARNING_MESSAGE);
            textFildTelefoneMedico.requestFocus();
        } else {

            // Criar um objeto Medico
            Medico novoMedico = new Medico();
            novoMedico.setCrm(TextFildCrmMedico1.getText());
            novoMedico.setNome(textFieldNomeMedico.getText());
            novoMedico.setTelefone(textFildTelefoneMedico.getText());
            novoMedico.setEmail(textFieldEmail.getText());
            novoMedico.setDataDeNascimento(LocalDate.parse(textFildDataNascimento.getText(), DateTimeFormatter.ofPattern("dd/MM/yyyy")));

            // Gravar o objeto, através do Dao.
            MedicoDAO.gravar(novoMedico);

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
    private javax.swing.JLabel LabelNomeDoMedico;
    private javax.swing.JList<String> ListListaDeEspecialidade;
    private javax.swing.JTextField TextFildCrmMedico1;
    private javax.swing.JLabel codigoLabel;
    private javax.swing.JLabel codigoLabel4;
    private javax.swing.JLabel codigoLabel5;
    private javax.swing.JLabel crmMedicoLabel;
    private javax.swing.JPanel detalhesPanel;
    private javax.swing.JList<String> jListMedico;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelDataNascimento;
    private javax.swing.JLabel labelEmailMedico;
    private javax.swing.JLabel labelMedicoAdicionar;
    private javax.swing.JLabel labelTelefoneMedico;
    private javax.swing.JTextField textFieldCodigoMedico;
    private javax.swing.JTextField textFieldEmail;
    private javax.swing.JTextField textFieldNomeMedico;
    private javax.swing.JFormattedTextField textFildDataNascimento;
    private javax.swing.JTextField textFildTelefoneMedico;
    // End of variables declaration//GEN-END:variables

    private void adicionandoNaList() {

        ListListaDeEspecialidade.setModel(EspecialodadeDAO.getListaEspecialidade());

    }

}
