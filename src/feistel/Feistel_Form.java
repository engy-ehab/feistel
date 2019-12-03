
package feistel;

import javax.swing.JOptionPane;

public class Feistel_Form extends javax.swing.JFrame {

    
    public Feistel_Form() {
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

        jDesktopPane1 = new javax.swing.JDesktopPane();
        Plain_text = new javax.swing.JTextField();
        Keyword = new javax.swing.JTextField();
        Function_Combo = new javax.swing.JComboBox<>();
        Cipher_Text = new javax.swing.JTextField();
        Encrypt = new javax.swing.JButton();
        Decrypt = new javax.swing.JButton();
        Clear = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        NO_Rounds = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Keyword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KeywordActionPerformed(evt);
            }
        });

        Function_Combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose function", "AND", "OR", "XOR" }));
        Function_Combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Function_ComboActionPerformed(evt);
            }
        });

        Encrypt.setText("Encrypt");
        Encrypt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EncryptActionPerformed(evt);
            }
        });

        Decrypt.setText("Decrypt");
        Decrypt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DecryptActionPerformed(evt);
            }
        });

        Clear.setText("Clear");
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });

        jLabel1.setText("Keyword :");

        jLabel2.setText("NO Round :");

        NO_Rounds.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NO_RoundsActionPerformed(evt);
            }
        });

        jLabel3.setText("Plain Text :");

        jLabel4.setText("Cipher text :");

        jLabel5.setForeground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Keyword, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(NO_Rounds, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(Function_Combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Plain_text, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Cipher_Text, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(Encrypt)
                        .addGap(109, 109, 109)
                        .addComponent(Decrypt)
                        .addGap(107, 107, 107)
                        .addComponent(Clear))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(jLabel5)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Plain_text, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Function_Combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(NO_Rounds, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Keyword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cipher_Text, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Encrypt)
                    .addComponent(Decrypt)
                    .addComponent(Clear))
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DecryptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DecryptActionPerformed
        if (Plain_text.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Enter the text you want to "
                    + "be decrypted ,please!", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (Keyword.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Enter the key ,please!", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (NO_Rounds.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Enter the number of rounds ,please!", "Error", JOptionPane.ERROR_MESSAGE);

        } else if (Function_Combo.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Enter the function ,please!", "Error", JOptionPane.ERROR_MESSAGE);

        } else {
            String s = Feistel.FeistelCipher(Plain_text.getText(), Keyword.getText(), Integer.parseInt(NO_Rounds.getText()), Function_Combo.getSelectedItem().toString());
            Cipher_Text.setText(s);
        }
    }//GEN-LAST:event_DecryptActionPerformed

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
        Plain_text.setText("");
        Keyword.setText("");
        Cipher_Text.setText("");
        NO_Rounds.setText("");
        Function_Combo.setSelectedIndex(0);    }//GEN-LAST:event_ClearActionPerformed

    private void KeywordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KeywordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_KeywordActionPerformed

    private void NO_RoundsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NO_RoundsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NO_RoundsActionPerformed

    private void Function_ComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Function_ComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Function_ComboActionPerformed

    private void EncryptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EncryptActionPerformed
        if (Plain_text.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Enter the text you want to "
                    + "be encrypted ,please!", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (Keyword.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Enter the key ,please!", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (NO_Rounds.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Enter the number of rounds ,please!", "Error", JOptionPane.ERROR_MESSAGE);

        } else if (Function_Combo.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Enter the  function ,please!", "Error", JOptionPane.ERROR_MESSAGE);

        } else {
            String s = Feistel.FeistelCipher(Plain_text.getText(), Keyword.getText(), Integer.parseInt(NO_Rounds.getText()),
                    Function_Combo.getSelectedItem().toString());
            Cipher_Text.setText(s);
        }
    }//GEN-LAST:event_EncryptActionPerformed

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
            java.util.logging.Logger.getLogger(Feistel_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Feistel_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Feistel_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Feistel_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Feistel_Form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Cipher_Text;
    private javax.swing.JButton Clear;
    private javax.swing.JButton Decrypt;
    private javax.swing.JButton Encrypt;
    private javax.swing.JComboBox<String> Function_Combo;
    private javax.swing.JTextField Keyword;
    private javax.swing.JTextField NO_Rounds;
    private javax.swing.JTextField Plain_text;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
