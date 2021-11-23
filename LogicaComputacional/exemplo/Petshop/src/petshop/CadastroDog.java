/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petshop;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import util.Validacao;

/**
 *
 * @author SESI_SENAI
 */
public class CadastroDog extends javax.swing.JFrame {

    /**
     * Creates new form CadastroDog
     */
    ArrayList<Animal> list;
    Animal animal;
    ArrayList<Dog> dogList = new ArrayList<>();
    public CadastroDog() {
    }
    public CadastroDog(Animal a, ArrayList<Animal> animalList) {
        initComponents();
        animal = a;
        list = animalList;
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
        labelDog = new javax.swing.JLabel();
        porteLabel = new javax.swing.JLabel();
        porteText = new javax.swing.JTextField();
        racaLabel = new javax.swing.JLabel();
        racaText = new javax.swing.JTextField();
        focinheiraLabel = new javax.swing.JLabel();
        naoLabel = new javax.swing.JLabel();
        focinheiraDeslizante = new javax.swing.JSlider();
        simLabel = new javax.swing.JLabel();
        cadastrarButton = new javax.swing.JButton();
        listarButton = new javax.swing.JButton();
        VoltarButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelDog.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelDog.setText("Informações caso seja um cachorro");

        porteLabel.setText("Porte");

        porteText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                porteTextActionPerformed(evt);
            }
        });

        racaLabel.setText("Raça");

        focinheiraLabel.setText("Focinheira");

        naoLabel.setText("não");

        focinheiraDeslizante.setMaximum(1);

        simLabel.setText("sim");

        cadastrarButton.setText("Cadastrar Cachorro");
        cadastrarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarButtonActionPerformed(evt);
            }
        });

        listarButton.setText("Listar Cachorros");
        listarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarButtonActionPerformed(evt);
            }
        });

        VoltarButton.setText("Voltar");
        VoltarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoltarButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(listarButton)
                .addGap(37, 37, 37)
                .addComponent(cadastrarButton)
                .addGap(0, 76, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(porteLabel)
                                    .addComponent(racaLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(porteText, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                                    .addComponent(racaText)))
                            .addComponent(labelDog)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(focinheiraLabel)
                                .addGap(18, 18, 18)
                                .addComponent(naoLabel)
                                .addGap(18, 18, 18)
                                .addComponent(focinheiraDeslizante, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(simLabel))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(VoltarButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelDog)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(porteLabel)
                    .addComponent(porteText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(racaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(racaLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(focinheiraLabel)
                        .addComponent(naoLabel))
                    .addComponent(focinheiraDeslizante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(simLabel))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cadastrarButton)
                    .addComponent(listarButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(VoltarButton)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 79, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void porteTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_porteTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_porteTextActionPerformed

    private void cadastrarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarButtonActionPerformed
        if (Validacao.validaDog(porteText, racaText) == true) {
            Dog dog = new Dog();
            dog.setNome(animal.getNome());
            dog.setIdade(animal.getIdade());
            dog.setPeso(animal.getPeso());
            dog.setDono(animal.getDono());
            dog.setTelefone(animal.getTelefone());
            dog.setSexo(animal.getSexo());

            dog.setPorte(porteText.getText());
            dog.setRaca(racaText.getText());
            if (focinheiraDeslizante.getValue() == 1) {
                dog.setFocinheira(true);
            }else{
                dog.setFocinheira(false);
            }
            dogList.add(dog);
        }else{
            JOptionPane.showMessageDialog(null, "Preecha os campos obrigatorios");
        }
        
    }//GEN-LAST:event_cadastrarButtonActionPerformed

    private void VoltarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltarButtonActionPerformed
        setVisible(false);
        Cadastro cadastro = new Cadastro(list);
        cadastro.setVisible(true);
    }//GEN-LAST:event_VoltarButtonActionPerformed

    private void listarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarButtonActionPerformed
        String listar = "Cadastro de Cachorro: \n";
        for (Dog dog : dogList) {
            listar += "Dono: " + dog.getDono() + " Raça: " + dog.getRaca()+ " Sexo: " + dog.getSexo() + "\n";
        }
        JOptionPane.showMessageDialog(null, listar);
    }//GEN-LAST:event_listarButtonActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroDog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroDog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroDog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroDog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroDog().setVisible(false);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton VoltarButton;
    private javax.swing.JButton cadastrarButton;
    private javax.swing.JSlider focinheiraDeslizante;
    private javax.swing.JLabel focinheiraLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelDog;
    private javax.swing.JButton listarButton;
    private javax.swing.JLabel naoLabel;
    private javax.swing.JLabel porteLabel;
    private javax.swing.JTextField porteText;
    private javax.swing.JLabel racaLabel;
    private javax.swing.JTextField racaText;
    private javax.swing.JLabel simLabel;
    // End of variables declaration//GEN-END:variables
}
