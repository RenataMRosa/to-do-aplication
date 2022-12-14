
package view;

import controller.ControladorTarefa;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import model.Projeto;
import model.Tarefa;

/**
 *
 * @author renata
 */
public class TelaTarefa extends javax.swing.JDialog {

    ControladorTarefa controlador;
    Projeto projeto = null;
    
    public TelaTarefa(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        controlador = new ControladorTarefa();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelTelaTarefaCabecalho = new javax.swing.JPanel();
        jLabelTituloTelaTarefa = new javax.swing.JLabel();
        jLabelSalvarTelaTarefa = new javax.swing.JLabel();
        jPanelTelaTarefa = new javax.swing.JPanel();
        jLabelNomeTarefa = new javax.swing.JLabel();
        jTextFieldNomeTarefa = new javax.swing.JTextField();
        jLabelDescricaoTarefa = new javax.swing.JLabel();
        jScrollPaneDescricaoTarefa = new javax.swing.JScrollPane();
        jTextAreaDescricaoTarefa = new javax.swing.JTextArea();
        jLabelPrazoTarefa = new javax.swing.JLabel();
        jFormattedTextFieldPrazoTarefa = new javax.swing.JFormattedTextField();
        jLabelNotasTarefa = new javax.swing.JLabel();
        jScrollPaneNotasTarefa = new javax.swing.JScrollPane();
        jTextAreaNotasTarefa = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanelTelaTarefaCabecalho.setBackground(new java.awt.Color(153, 204, 255));

        jLabelTituloTelaTarefa.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabelTituloTelaTarefa.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTituloTelaTarefa.setText("Tarefa");

        jLabelSalvarTelaTarefa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/check32.png"))); // NOI18N
        jLabelSalvarTelaTarefa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelSalvarTelaTarefaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelTelaTarefaCabecalhoLayout = new javax.swing.GroupLayout(jPanelTelaTarefaCabecalho);
        jPanelTelaTarefaCabecalho.setLayout(jPanelTelaTarefaCabecalhoLayout);
        jPanelTelaTarefaCabecalhoLayout.setHorizontalGroup(
            jPanelTelaTarefaCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTelaTarefaCabecalhoLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabelTituloTelaTarefa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelSalvarTelaTarefa)
                .addGap(14, 14, 14))
        );
        jPanelTelaTarefaCabecalhoLayout.setVerticalGroup(
            jPanelTelaTarefaCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelTituloTelaTarefa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabelSalvarTelaTarefa, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        jPanelTelaTarefa.setBackground(new java.awt.Color(255, 255, 255));

        jLabelNomeTarefa.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelNomeTarefa.setForeground(new java.awt.Color(71, 71, 71));
        jLabelNomeTarefa.setText("Nome");

        jTextFieldNomeTarefa.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextFieldNomeTarefa.setForeground(new java.awt.Color(71, 71, 71));
        jTextFieldNomeTarefa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeTarefaActionPerformed(evt);
            }
        });

        jLabelDescricaoTarefa.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelDescricaoTarefa.setForeground(new java.awt.Color(71, 71, 71));
        jLabelDescricaoTarefa.setText("Descri??o");

        jTextAreaDescricaoTarefa.setColumns(20);
        jTextAreaDescricaoTarefa.setRows(5);
        jScrollPaneDescricaoTarefa.setViewportView(jTextAreaDescricaoTarefa);

        jLabelPrazoTarefa.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelPrazoTarefa.setForeground(new java.awt.Color(71, 71, 71));
        jLabelPrazoTarefa.setText("Prazo");

        jFormattedTextFieldPrazoTarefa.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/yyyy"))));
        jFormattedTextFieldPrazoTarefa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextFieldPrazoTarefaActionPerformed(evt);
            }
        });

        jLabelNotasTarefa.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelNotasTarefa.setForeground(new java.awt.Color(71, 71, 71));
        jLabelNotasTarefa.setText("Notas");

        jTextAreaNotasTarefa.setColumns(20);
        jTextAreaNotasTarefa.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextAreaNotasTarefa.setForeground(new java.awt.Color(71, 71, 71));
        jTextAreaNotasTarefa.setRows(5);
        jScrollPaneNotasTarefa.setViewportView(jTextAreaNotasTarefa);

        javax.swing.GroupLayout jPanelTelaTarefaLayout = new javax.swing.GroupLayout(jPanelTelaTarefa);
        jPanelTelaTarefa.setLayout(jPanelTelaTarefaLayout);
        jPanelTelaTarefaLayout.setHorizontalGroup(
            jPanelTelaTarefaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTelaTarefaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelTelaTarefaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPaneNotasTarefa)
                    .addComponent(jFormattedTextFieldPrazoTarefa)
                    .addComponent(jTextFieldNomeTarefa, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPaneDescricaoTarefa, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 458, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelTelaTarefaLayout.createSequentialGroup()
                        .addGroup(jPanelTelaTarefaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelNomeTarefa)
                            .addComponent(jLabelDescricaoTarefa)
                            .addComponent(jLabelPrazoTarefa)
                            .addComponent(jLabelNotasTarefa))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelTelaTarefaLayout.setVerticalGroup(
            jPanelTelaTarefaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTelaTarefaLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabelNomeTarefa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldNomeTarefa, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelDescricaoTarefa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPaneDescricaoTarefa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelPrazoTarefa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jFormattedTextFieldPrazoTarefa, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelNotasTarefa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPaneNotasTarefa, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelTelaTarefaCabecalho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelTelaTarefa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelTelaTarefaCabecalho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelTelaTarefa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldNomeTarefaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeTarefaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNomeTarefaActionPerformed

    private void jFormattedTextFieldPrazoTarefaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextFieldPrazoTarefaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextFieldPrazoTarefaActionPerformed

    private void jLabelSalvarTelaTarefaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSalvarTelaTarefaMouseClicked
        try {
            Tarefa tarefa = new Tarefa();
            tarefa.setIdProjeto(5);
            tarefa.setNome(jTextFieldNomeTarefa.getText());
            tarefa.setDescricao(jTextAreaDescricaoTarefa.getText());
            tarefa.setNotas(jTextAreaNotasTarefa.getText());
            tarefa.setCompletada(false);
            
            SimpleDateFormat dataFormatada = new SimpleDateFormat("dd/MM/yyyy");
            Date dataLimite = null;
            dataLimite = dataFormatada.parse(jFormattedTextFieldPrazoTarefa.getText());
            tarefa.setDataLimite(dataLimite);
                    
            controlador.salvar(tarefa);
            JOptionPane.showMessageDialog(rootPane, "Tarefa salva com sucesso");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
        this.dispose();
    }//GEN-LAST:event_jLabelSalvarTelaTarefaMouseClicked

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
                if ("Java swing".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaTarefa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaTarefa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaTarefa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaTarefa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TelaTarefa dialog = new TelaTarefa(new javax.swing.JFrame(), true);
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
    private javax.swing.JFormattedTextField jFormattedTextFieldPrazoTarefa;
    private javax.swing.JLabel jLabelDescricaoTarefa;
    private javax.swing.JLabel jLabelNomeTarefa;
    private javax.swing.JLabel jLabelNotasTarefa;
    private javax.swing.JLabel jLabelPrazoTarefa;
    private javax.swing.JLabel jLabelSalvarTelaTarefa;
    private javax.swing.JLabel jLabelTituloTelaTarefa;
    private javax.swing.JPanel jPanelTelaTarefa;
    private javax.swing.JPanel jPanelTelaTarefaCabecalho;
    private javax.swing.JScrollPane jScrollPaneDescricaoTarefa;
    private javax.swing.JScrollPane jScrollPaneNotasTarefa;
    private javax.swing.JTextArea jTextAreaDescricaoTarefa;
    private javax.swing.JTextArea jTextAreaNotasTarefa;
    private javax.swing.JTextField jTextFieldNomeTarefa;
    // End of variables declaration//GEN-END:variables

    public void setProjeto(Projeto projeto) {
        this.projeto = projeto;
    }


    
}

