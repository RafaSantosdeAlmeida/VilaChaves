/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package modeloPesonagens.view;

/**
 *
 * @author profslvo
 */
public class Vila extends javax.swing.JFrame {

    /**
     * Creates new form Vila
     */
    public Vila() {
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

        jPanel1 = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        Chaves = new javax.swing.JLabel();
        Kiko = new javax.swing.JLabel();
        VidaHeroi = new javax.swing.JLabel();
        EnergiaHeroi = new javax.swing.JLabel();
        VidaVilao = new javax.swing.JLabel();
        EnergiaVilao = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setLayout(null);

        Titulo.setBackground(new java.awt.Color(0, 0, 0));
        Titulo.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        Titulo.setForeground(new java.awt.Color(0, 0, 0));
        Titulo.setText("Segunda Guerra Chavial");
        jPanel1.add(Titulo);
        Titulo.setBounds(80, 29, 339, 35);

        Chaves.setIcon(new javax.swing.ImageIcon(getClass().getResource("/modeloPesonagens/imagens/Chapolin.png"))); // NOI18N
        jPanel1.add(Chaves);
        Chaves.setBounds(0, 240, 190, 260);

        Kiko.setIcon(new javax.swing.ImageIcon(getClass().getResource("/modeloPesonagens/imagens/Kiko.png"))); // NOI18N
        jPanel1.add(Kiko);
        Kiko.setBounds(400, 100, 190, 150);

        VidaHeroi.setBackground(new java.awt.Color(0, 0, 0));
        VidaHeroi.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        VidaHeroi.setForeground(new java.awt.Color(0, 0, 0));
        VidaHeroi.setText("Vida: 100");
        jPanel1.add(VidaHeroi);
        VidaHeroi.setBounds(40, 220, 70, 20);

        EnergiaHeroi.setBackground(new java.awt.Color(0, 0, 0));
        EnergiaHeroi.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        EnergiaHeroi.setForeground(new java.awt.Color(0, 0, 0));
        EnergiaHeroi.setText("Energia: 100");
        jPanel1.add(EnergiaHeroi);
        EnergiaHeroi.setBounds(130, 220, 90, 18);

        VidaVilao.setBackground(new java.awt.Color(0, 0, 0));
        VidaVilao.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        VidaVilao.setForeground(new java.awt.Color(0, 0, 0));
        VidaVilao.setText("Vida: 100");
        jPanel1.add(VidaVilao);
        VidaVilao.setBounds(400, 270, 70, 30);

        EnergiaVilao.setBackground(new java.awt.Color(0, 0, 0));
        EnergiaVilao.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        EnergiaVilao.setForeground(new java.awt.Color(0, 0, 0));
        EnergiaVilao.setText("Energia: 100");
        jPanel1.add(EnergiaVilao);
        EnergiaVilao.setBounds(480, 270, 90, 30);

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

    
    //Alterar atributos heroi
    public void setVilaAtb(int vidaHeroi,int vidaVilao,int energiaHeroi,int energiaVilao){
        
    }
    
    //Alterar atributos vilao
    
    
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
            java.util.logging.Logger.getLogger(Vila.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vila.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vila.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vila.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vila().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Chaves;
    private javax.swing.JLabel EnergiaHeroi;
    private javax.swing.JLabel EnergiaVilao;
    private javax.swing.JLabel Kiko;
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel VidaHeroi;
    private javax.swing.JLabel VidaVilao;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
