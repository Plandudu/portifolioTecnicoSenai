/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import application.Artista;
import application.Restaurante;
import dao.Conexao;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ademar_dadam-neto
 */
public class TelaInicial extends javax.swing.JFrame {

    public static Integer identificador;
    /**
     * Creates new form TelaInicial
     */
    public TelaInicial() {
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

        titulo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        senha = new javax.swing.JTextField();
        entrarBt = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        restauranteBt = new javax.swing.JButton();
        musicosBt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titulo.setFont(new java.awt.Font("Tempus Sans ITC", 3, 24)); // NOI18N
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("Senai");

        jLabel1.setText("E-mail:");

        email.setToolTipText("");
        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });

        jLabel2.setText("Senha:");

        senha.setToolTipText("");

        entrarBt.setText("Entrar");
        entrarBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entrarBtActionPerformed(evt);
            }
        });

        jLabel3.setText("Cadastre-se");

        restauranteBt.setText("Restaurantes");
        restauranteBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restauranteBtActionPerformed(evt);
            }
        });

        musicosBt.setText("Musicos");
        musicosBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                musicosBtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(titulo)
                .addGap(352, 352, 352))
            .addGroup(layout.createSequentialGroup()
                .addGap(153, 153, 153)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(40, 40, 40)
                        .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(40, 40, 40)
                        .addComponent(senha, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(177, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(342, 342, 342))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(restauranteBt)
                        .addGap(18, 18, 18)
                        .addComponent(musicosBt, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(266, 266, 266))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(entrarBt, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(320, 320, 320))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(senha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(entrarBt)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(restauranteBt)
                    .addComponent(musicosBt))
                .addContainerGap(77, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void entrarBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entrarBtActionPerformed
       
        List<Restaurante> rs = null;
        List<Artista> a = null;
        try {
            rs = Conexao.listRestaurante();
            a = Conexao.listArtista();
        } catch (SQLException ex) {
            Logger.getLogger(TelaInicial.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        if(rs != null){
            for (int i = 0; i < rs.size(); i++){
            if(email.getText().toString().equals(rs.get(i).getEmail()) && senha.getText().toString().equals(rs.get(i).getSenha())){
                Restaurante restaurante = rs.get(i);
                Home home = new Home();
                this.setVisible(false);
                home.setVisible(true);
                //restaurante
                identificador = 2;
            }
            
            }
        }   
        
        if(a != null){
            for (int i = 0; i < a.size(); i++){
            if(email.getText().toString().equals(a.get(i).getEmail()) && senha.getText().toString().equals(a.get(i).getSenha())){
                Artista artista = a.get(i);
                Home home = new Home();
                this.setVisible(false);
                 home.setVisible(true);
                 //artista
                 identificador = 1;
            }
            
            }
        }
        
        // TODO add your handling code here:
    }//GEN-LAST:event_entrarBtActionPerformed

    private void musicosBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_musicosBtActionPerformed
        CadastroArtista ca = new CadastroArtista();
        ca.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_musicosBtActionPerformed

    private void restauranteBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restauranteBtActionPerformed
        CadastroRestaurante cr = new CadastroRestaurante();
        cr.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_restauranteBtActionPerformed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

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
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField email;
    private javax.swing.JButton entrarBt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton musicosBt;
    private javax.swing.JButton restauranteBt;
    private javax.swing.JTextField senha;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
