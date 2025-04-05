package Interfaces;

import Class.model.Agendamentos;
import Class.model.Consulta;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TelaInicial extends javax.swing.JFrame {

    public TelaInicial() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnNovaConsulta = new javax.swing.JButton();
        btnFinalizarConsulta = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblAgendamentos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("Bem vindo ao sistema de agendamentos");

        btnNovaConsulta.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnNovaConsulta.setText("Nova consulta");
        btnNovaConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovaConsultaActionPerformed(evt);
            }
        });

        btnFinalizarConsulta.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnFinalizarConsulta.setText("Finalizar consulta");
        btnFinalizarConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarConsultaActionPerformed(evt);
            }
        });

        btnExcluir.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnExcluir.setText("Excluir consulta");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        tblAgendamentos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Paciente", "CPF", "Telefone", "Data", "Já paciente", "Consulta realizada"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblAgendamentos);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnNovaConsulta)
                        .addGap(130, 130, 130)
                        .addComponent(btnFinalizarConsulta)
                        .addGap(127, 127, 127)
                        .addComponent(btnExcluir))
                    .addComponent(jScrollPane2))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovaConsulta)
                    .addComponent(btnFinalizarConsulta)
                    .addComponent(btnExcluir))
                .addContainerGap(23, Short.MAX_VALUE))
        );

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
    }// </editor-fold>//GEN-END:initComponents

    private void btnNovaConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovaConsultaActionPerformed
        TelaCadastrarConsulta novaConsulta = new TelaCadastrarConsulta();
        novaConsulta.setVisible(true);

    }//GEN-LAST:event_btnNovaConsultaActionPerformed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        tblAgendamentos.setModel(montarTabela());
    }//GEN-LAST:event_formWindowGainedFocus

    private void btnFinalizarConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarConsultaActionPerformed
        TelaFinalizarConsulta finalizar = new TelaFinalizarConsulta();
        finalizar.setVisible(true); 
    }//GEN-LAST:event_btnFinalizarConsultaActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        Agendamentos.excluir(getPosicao());
    }//GEN-LAST:event_btnExcluirActionPerformed

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
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicial().setVisible(true);
            }
        });
    }

    private DefaultTableModel montarTabela() {
        String[] colunas = {"Paciente", "CPF", "Telefone", "Data", "Já paciente", "Consulta realizada"};

        DefaultTableModel tabela = new DefaultTableModel(colunas, 0);

        ArrayList<Consulta> lista = Agendamentos.listar();

        for (int i = 0; i < lista.size(); i++) {
            Consulta c = lista.get(i);

            String consultaRealizada = "Agendado";
            c.getConsultaRealizada();

            String[] linhas = {
                c.getNome(),
                c.getCpf(),
                c.getTelefone(),
                c.getData(),
                c.getJaPaciente(),
                consultaRealizada};

            tabela.addRow(linhas); //Não esquecer de adicionar a linha!
        }

        return tabela;

    }

    public int getPosicao() {
        int pos = tblAgendamentos.getSelectedRow();

        if (pos < -1) {
            JOptionPane.showMessageDialog(null, "Selecione um agendamento");
        }
        return pos;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnFinalizarConsulta;
    private javax.swing.JButton btnNovaConsulta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblAgendamentos;
    // End of variables declaration//GEN-END:variables
}
