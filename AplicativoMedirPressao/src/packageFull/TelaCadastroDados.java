package packageFull;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;


public class TelaCadastroDados extends javax.swing.JFrame {

    public TelaCadastroDados() {
        initComponents();
        AtalhoCadastrarMedicao();
    }

            public void AtalhoCadastrarMedicao() {

            //ASSOCIA TECLA DE ATALHO "ATL + A" PARA CADASTRO
            btnCadastrarMedicao.setMnemonic(KeyEvent.VK_S);
        }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblData = new javax.swing.JLabel();
        lblHorario = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblPressaoDiastolica = new javax.swing.JLabel();
        txtData = new javax.swing.JTextField();
        txtHorario = new javax.swing.JTextField();
        txtPressaoSistolica = new javax.swing.JTextField();
        txtPressaoDiastolica = new javax.swing.JTextField();
        btnCadastrarMedicao = new javax.swing.JButton();
        boxEstresse = new javax.swing.JCheckBox();

        jLabel5.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("CADASTRO DE MEDIÇÃO");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("Informe os dados solicitados abaixo:");

        lblData.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lblData.setForeground(new java.awt.Color(0, 153, 153));
        lblData.setText("Data");

        lblHorario.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lblHorario.setForeground(new java.awt.Color(0, 153, 153));
        lblHorario.setText("Horário");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 153));
        jLabel4.setText("Pressão Sistólica");

        lblPressaoDiastolica.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lblPressaoDiastolica.setForeground(new java.awt.Color(0, 153, 153));
        lblPressaoDiastolica.setText("Pressão Diastólica");

        txtData.setBackground(new java.awt.Color(255, 255, 255));
        txtData.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        txtData.setForeground(new java.awt.Color(255, 102, 0));
        txtData.setToolTipText("Informe a data (dd/mm/aaaa) que esta medindo sua pressão");
        txtData.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        txtData.setCaretColor(new java.awt.Color(0, 0, 0));

        txtHorario.setBackground(new java.awt.Color(255, 255, 255));
        txtHorario.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        txtHorario.setForeground(new java.awt.Color(255, 102, 0));
        txtHorario.setToolTipText("Informe a hora (hh:mm) que esta sendo medida sua pressão");
        txtHorario.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        txtHorario.setCaretColor(new java.awt.Color(0, 0, 0));

        txtPressaoSistolica.setBackground(new java.awt.Color(255, 255, 255));
        txtPressaoSistolica.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        txtPressaoSistolica.setForeground(new java.awt.Color(255, 102, 0));
        txtPressaoSistolica.setToolTipText("Informe sua pressão sistólica (Apenas números)");
        txtPressaoSistolica.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        txtPressaoSistolica.setCaretColor(new java.awt.Color(0, 0, 0));

        txtPressaoDiastolica.setBackground(new java.awt.Color(255, 255, 255));
        txtPressaoDiastolica.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        txtPressaoDiastolica.setForeground(new java.awt.Color(255, 102, 0));
        txtPressaoDiastolica.setToolTipText("Informe sua pressão diatólica (Apenas números)");
        txtPressaoDiastolica.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        txtPressaoDiastolica.setCaretColor(new java.awt.Color(0, 0, 0));

        btnCadastrarMedicao.setBackground(new java.awt.Color(51, 255, 51));
        btnCadastrarMedicao.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        btnCadastrarMedicao.setForeground(new java.awt.Color(0, 0, 0));
        btnCadastrarMedicao.setText("Cadastrar medição");
        btnCadastrarMedicao.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCadastrarMedicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarMedicaoActionPerformed(evt);
            }
        });

        boxEstresse.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        boxEstresse.setForeground(new java.awt.Color(255, 102, 0));
        boxEstresse.setText("Está sob estresse?");
        boxEstresse.setToolTipText("Marque aqui se estiver sob estresse");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(btnCadastrarMedicao)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(34, 34, 34)
                                        .addComponent(lblData)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtHorario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblHorario)
                                        .addGap(18, 18, 18)))
                                .addGap(50, 50, 50))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(boxEstresse)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtPressaoSistolica)
                                    .addComponent(jLabel4))
                                .addGap(63, 63, 63)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblPressaoDiastolica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtPressaoDiastolica, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(14, 14, 14)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblData)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblHorario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtHorario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lblPressaoDiastolica))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPressaoSistolica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPressaoDiastolica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addComponent(boxEstresse)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(btnCadastrarMedicao)
                .addGap(25, 25, 25))
        );

        lblData.getAccessibleContext().setAccessibleDescription("");
        txtData.getAccessibleContext().setAccessibleName("");
        txtHorario.getAccessibleContext().setAccessibleDescription("Informe a hora que esta sendo medida sua pressão");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarMedicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarMedicaoActionPerformed
        cadastrarAgendamento();
    }//GEN-LAST:event_btnCadastrarMedicaoActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadastroDados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroDados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroDados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroDados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroDados().setVisible(true);
            }
        });
    }
    
    public void cadastrarAgendamento() {

        if (!validarCampos()) {
            return;
        }

        dadosMedicao d = new dadosMedicao();

        try {

            d.setData(txtData.getText());
            d.setHora(txtHorario.getText());
            d.setPressaoSistolica(Integer.parseInt(txtPressaoSistolica.getText()));
            d.setPressaoDiastolica(Integer.parseInt(txtPressaoDiastolica.getText()));
            d.setEstresse(boxEstresse.isSelected() ? "Sim" : "Não");

            if (DadosCSV.AdicionarDados(d)) {
                JOptionPane.showMessageDialog(null, "Dados de medição cadastrados com sucesso!");
            }
            dispose();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao cadastrar sua medição");
        }

        Medicao m = new Medicao();
        m.adicionarMedicao(d);

    }

    private boolean validarCampos() {
        if (txtData.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "O campo 'DATA' é obrigatório", "ATENÇÃO", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        if (txtHorario.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "O campo 'Hora' é obrigatório", "ATENÇÃO", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        if (txtPressaoSistolica.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "O campo 'Pressão Sistólica' é obrigatório", "ATENÇÃO", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        if (txtPressaoDiastolica.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "O campo 'Pressão diastólica' é obrigatório", "ATENÇÃO", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        return true;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox boxEstresse;
    private javax.swing.JButton btnCadastrarMedicao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel lblHorario;
    private javax.swing.JLabel lblPressaoDiastolica;
    private javax.swing.JTextField txtData;
    private javax.swing.JTextField txtHorario;
    private javax.swing.JTextField txtPressaoDiastolica;
    private javax.swing.JTextField txtPressaoSistolica;
    // End of variables declaration//GEN-END:variables
}
