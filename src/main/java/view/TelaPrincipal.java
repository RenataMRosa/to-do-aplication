/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

/**
 *
 * @author renata
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelCabecalho = new javax.swing.JPanel();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelSubtitulo = new javax.swing.JLabel();
        jPanelProjetos = new javax.swing.JPanel();
        jLabelProjetosTitulo = new javax.swing.JLabel();
        jLabelProjetosAdiciona = new javax.swing.JLabel();
        jPanelTarefas = new javax.swing.JPanel();
        jLabelTarefasTitulo = new javax.swing.JLabel();
        jLabelTarefasAdiciona = new javax.swing.JLabel();
        jPanelListaProjetos = new javax.swing.JPanel();
        jScrollPaneProjetos = new javax.swing.JScrollPane();
        jListProjetos = new javax.swing.JList<>();
        jPanel5 = new javax.swing.JPanel();
        jPanelListaVazia = new javax.swing.JPanel();
        jLabelListaVaziaIcone = new javax.swing.JLabel();
        jLabelListaVaziaTitulo = new javax.swing.JLabel();
        jLabelListaVaziaSubtitulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(600, 800));

        jPanelCabecalho.setBackground(new java.awt.Color(153, 204, 255));
        jPanelCabecalho.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 204, 255), new java.awt.Color(255, 255, 255)));

        jLabelTitulo.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/check.png"))); // NOI18N
        jLabelTitulo.setText(" ToDo ");

        jLabelSubtitulo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelSubtitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelSubtitulo.setText("Anote tudo, n�o esque�a de nada!");

        javax.swing.GroupLayout jPanelCabecalhoLayout = new javax.swing.GroupLayout(jPanelCabecalho);
        jPanelCabecalho.setLayout(jPanelCabecalhoLayout);
        jPanelCabecalhoLayout.setHorizontalGroup(
            jPanelCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCabecalhoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelSubtitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelCabecalhoLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabelTitulo)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanelCabecalhoLayout.setVerticalGroup(
            jPanelCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCabecalhoLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabelTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelSubtitulo)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanelProjetos.setBackground(new java.awt.Color(255, 255, 255));
        jPanelProjetos.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, null));

        jLabelProjetosTitulo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelProjetosTitulo.setForeground(new java.awt.Color(153, 204, 255));
        jLabelProjetosTitulo.setText("Projetos");

        jLabelProjetosAdiciona.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mais.png"))); // NOI18N

        javax.swing.GroupLayout jPanelProjetosLayout = new javax.swing.GroupLayout(jPanelProjetos);
        jPanelProjetos.setLayout(jPanelProjetosLayout);
        jPanelProjetosLayout.setHorizontalGroup(
            jPanelProjetosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelProjetosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelProjetosTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                .addComponent(jLabelProjetosAdiciona)
                .addGap(15, 15, 15))
        );
        jPanelProjetosLayout.setVerticalGroup(
            jPanelProjetosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelProjetosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelProjetosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelProjetosTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelProjetosAdiciona, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanelTarefas.setBackground(new java.awt.Color(255, 255, 255));
        jPanelTarefas.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelTarefasTitulo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelTarefasTitulo.setForeground(new java.awt.Color(153, 204, 255));
        jLabelTarefasTitulo.setText("Tarefas");

        jLabelTarefasAdiciona.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mais.png"))); // NOI18N

        javax.swing.GroupLayout jPanelTarefasLayout = new javax.swing.GroupLayout(jPanelTarefas);
        jPanelTarefas.setLayout(jPanelTarefasLayout);
        jPanelTarefasLayout.setHorizontalGroup(
            jPanelTarefasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTarefasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTarefasTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelTarefasAdiciona)
                .addGap(16, 16, 16))
        );
        jPanelTarefasLayout.setVerticalGroup(
            jPanelTarefasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTarefasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelTarefasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelTarefasTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                    .addComponent(jLabelTarefasAdiciona, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanelListaProjetos.setBackground(new java.awt.Color(255, 255, 255));
        jPanelListaProjetos.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jScrollPaneProjetos.setBorder(null);

        jListProjetos.setBorder(null);
        jListProjetos.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jListProjetos.setForeground(new java.awt.Color(71, 71, 71));
        jListProjetos.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jListProjetos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jListProjetos.setFixedCellHeight(50);
        jListProjetos.setSelectionBackground(new java.awt.Color(153, 204, 255));
        jListProjetos.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPaneProjetos.setViewportView(jListProjetos);

        javax.swing.GroupLayout jPanelListaProjetosLayout = new javax.swing.GroupLayout(jPanelListaProjetos);
        jPanelListaProjetos.setLayout(jPanelListaProjetosLayout);
        jPanelListaProjetosLayout.setHorizontalGroup(
            jPanelListaProjetosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPaneProjetos)
        );
        jPanelListaProjetosLayout.setVerticalGroup(
            jPanelListaProjetosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPaneProjetos)
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanelListaVazia.setBackground(new java.awt.Color(255, 255, 255));

        jLabelListaVaziaIcone.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelListaVaziaIcone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/to-do-list.png"))); // NOI18N
        jLabelListaVaziaIcone.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabelListaVaziaTitulo.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabelListaVaziaTitulo.setForeground(new java.awt.Color(153, 204, 255));
        jLabelListaVaziaTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelListaVaziaTitulo.setText("Nenhuma tarefa por aqui :D");
        jLabelListaVaziaTitulo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabelListaVaziaSubtitulo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelListaVaziaSubtitulo.setForeground(new java.awt.Color(153, 153, 153));
        jLabelListaVaziaSubtitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelListaVaziaSubtitulo.setText("Clique no bot�o + para adicionar uma nova tarefa");
        jLabelListaVaziaSubtitulo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanelListaVaziaLayout = new javax.swing.GroupLayout(jPanelListaVazia);
        jPanelListaVazia.setLayout(jPanelListaVaziaLayout);
        jPanelListaVaziaLayout.setHorizontalGroup(
            jPanelListaVaziaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelListaVaziaIcone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanelListaVaziaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelListaVaziaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelListaVaziaTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelListaVaziaSubtitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 640, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelListaVaziaLayout.setVerticalGroup(
            jPanelListaVaziaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelListaVaziaLayout.createSequentialGroup()
                .addGap(156, 156, 156)
                .addComponent(jLabelListaVaziaIcone)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelListaVaziaTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelListaVaziaSubtitulo)
                .addGap(65, 65, 65))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jPanelListaVazia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelListaVazia, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelCabecalho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanelProjetos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanelListaProjetos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanelTarefas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelCabecalho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelTarefas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelProjetos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelListaProjetos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelListaVaziaIcone;
    private javax.swing.JLabel jLabelListaVaziaSubtitulo;
    private javax.swing.JLabel jLabelListaVaziaTitulo;
    private javax.swing.JLabel jLabelProjetosAdiciona;
    private javax.swing.JLabel jLabelProjetosTitulo;
    private javax.swing.JLabel jLabelSubtitulo;
    private javax.swing.JLabel jLabelTarefasAdiciona;
    private javax.swing.JLabel jLabelTarefasTitulo;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JList<String> jListProjetos;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanelCabecalho;
    private javax.swing.JPanel jPanelListaProjetos;
    private javax.swing.JPanel jPanelListaVazia;
    private javax.swing.JPanel jPanelProjetos;
    private javax.swing.JPanel jPanelTarefas;
    private javax.swing.JScrollPane jScrollPaneProjetos;
    // End of variables declaration//GEN-END:variables
}