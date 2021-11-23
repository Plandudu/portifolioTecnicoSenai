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
public class Cadastro extends javax.swing.JFrame {

    
    /**
     * Creates new form Cadastro
     */
    ArrayList<Animal> list = new ArrayList<>();
    CadastroDog cd;
    CadastroCat cc;
    public Cadastro() {
        initComponents();
    }
    public Cadastro(ArrayList<Animal> listAnimal) {
        initComponents();
        list = listAnimal;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AnimaisGroup = new javax.swing.ButtonGroup();
        tituloLabel = new javax.swing.JLabel();
        infoLabel = new javax.swing.JLabel();
        nomeLabel = new javax.swing.JLabel();
        idadeLabel = new javax.swing.JLabel();
        pesoLabel = new javax.swing.JLabel();
        racaLabel = new javax.swing.JLabel();
        nomeDonoLabel = new javax.swing.JLabel();
        telefoneLabel = new javax.swing.JLabel();
        sexoLabel = new javax.swing.JLabel();
        nomeText = new javax.swing.JTextField();
        pesoText = new javax.swing.JTextField();
        racaText = new javax.swing.JTextField();
        nomeDonoText = new javax.swing.JTextField();
        sexoText = new javax.swing.JTextField();
        telefoneText = new javax.swing.JTextField();
        idadeText = new javax.swing.JTextField();
        cadastrarButton = new javax.swing.JButton();
        dogRadio = new javax.swing.JRadioButton();
        gatoRadio = new javax.swing.JRadioButton();
        idLabel = new javax.swing.JLabel();
        idText = new javax.swing.JTextField();
        ListarButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tituloLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tituloLabel.setText("Cadastro Pet Shop");

        infoLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        infoLabel.setText("Informações gerais");

        nomeLabel.setText("Nome");

        idadeLabel.setText("idade");

        pesoLabel.setText("Peso");

        racaLabel.setText("Raça");

        nomeDonoLabel.setText("Nome do dono:");

        telefoneLabel.setText("Telefone:");

        sexoLabel.setText("Sexo:");

        pesoText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesoTextActionPerformed(evt);
            }
        });

        nomeDonoText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeDonoTextActionPerformed(evt);
            }
        });

        cadastrarButton.setText("Cadastrar");
        cadastrarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarButtonActionPerformed(evt);
            }
        });

        AnimaisGroup.add(dogRadio);
        dogRadio.setText("Cachorro");

        AnimaisGroup.add(gatoRadio);
        gatoRadio.setText("gato");

        idLabel.setText("ID:");

        ListarButton.setText("Listar");
        ListarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListarButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(tituloLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(nomeLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(nomeText))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(nomeDonoLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(nomeDonoText))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(telefoneLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(dogRadio)
                                        .addGap(18, 18, 18)
                                        .addComponent(gatoRadio)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(pesoLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(pesoText, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(31, 31, 31)
                                        .addComponent(racaLabel)
                                        .addGap(18, 18, 18)
                                        .addComponent(racaText, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(idLabel))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(telefoneText, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                                                .addComponent(sexoLabel)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(sexoText, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(idText, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(infoLabel)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(idadeLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(idadeText, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(120, 120, 120)
                                        .addComponent(cadastrarButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ListarButton)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(43, 43, 43))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloLabel)
                .addGap(5, 5, 5)
                .addComponent(infoLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeLabel)
                    .addComponent(nomeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(idadeLabel)
                    .addComponent(idadeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pesoLabel)
                    .addComponent(pesoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(racaLabel)
                    .addComponent(racaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeDonoLabel)
                    .addComponent(nomeDonoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(telefoneLabel)
                    .addComponent(telefoneText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sexoLabel)
                    .addComponent(sexoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idLabel)
                    .addComponent(idText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dogRadio)
                    .addComponent(gatoRadio))
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cadastrarButton)
                    .addComponent(ListarButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nomeDonoTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeDonoTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeDonoTextActionPerformed

    private void pesoTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesoTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pesoTextActionPerformed

    private void cadastrarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarButtonActionPerformed
        if (Validacao.validaAnimal(nomeText, idadeText, pesoText, racaText, nomeDonoText, telefoneText, sexoText, AnimaisGroup) == true) {
            
            if(Validacao.validaMatricula(list, Integer.valueOf(idText.getText())) == true){
                Animal animal = new Animal();
                animal.setId(Integer.valueOf(idText.getText()));
                animal.setNome(nomeText.getText());
                animal.setIdade(Integer.parseInt(idadeText.getText()));
                animal.setPeso(Float.parseFloat(pesoText.getText()));
                animal.setRaca(racaText.getText());
                animal.setDono(nomeDonoText.getText());
                animal.setTelefone(telefoneText.getText());
                animal.setSexo(sexoText.getText());
                list.add(animal);
                JOptionPane.showMessageDialog(null, "Animal " + animal.getNome() +  " for realizado com sucesso");
                
                if(dogRadio.isSelected()){
                    cd = new CadastroDog(animal, list);
                    setVisible(false);
                    cd.setVisible(true);
                }else if (gatoRadio.isSelected()) {
                    cc = new CadastroCat(animal, list);
                     setVisible(false);
                    cc.setVisible(true);
                }else{
                    JOptionPane.showMessageDialog(null, "Selecione um animal");
                }
            }else{
                JOptionPane.showMessageDialog(null, "Matricula ja existe, mude o ID");
            }
            
        }else{
            JOptionPane.showMessageDialog(null, "Campos faltantes");
        }
        
    }//GEN-LAST:event_cadastrarButtonActionPerformed

    private void ListarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListarButtonActionPerformed
        String matricula = "Lista de matricula \n";
        for(Animal animal : list){
            matricula += "Matricula id: " + animal.getId() + " Nome: " + animal.getDono() + "\n";
        }
        JOptionPane.showMessageDialog(null, matricula);
    }//GEN-LAST:event_ListarButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup AnimaisGroup;
    private javax.swing.JButton ListarButton;
    private javax.swing.JButton cadastrarButton;
    private javax.swing.JRadioButton dogRadio;
    private javax.swing.JRadioButton gatoRadio;
    private javax.swing.JLabel idLabel;
    private javax.swing.JTextField idText;
    private javax.swing.JLabel idadeLabel;
    private javax.swing.JTextField idadeText;
    private javax.swing.JLabel infoLabel;
    private javax.swing.JLabel nomeDonoLabel;
    private javax.swing.JTextField nomeDonoText;
    private javax.swing.JLabel nomeLabel;
    private javax.swing.JTextField nomeText;
    private javax.swing.JLabel pesoLabel;
    private javax.swing.JTextField pesoText;
    private javax.swing.JLabel racaLabel;
    private javax.swing.JTextField racaText;
    private javax.swing.JLabel sexoLabel;
    private javax.swing.JTextField sexoText;
    private javax.swing.JLabel telefoneLabel;
    private javax.swing.JTextField telefoneText;
    private javax.swing.JLabel tituloLabel;
    // End of variables declaration//GEN-END:variables
}
