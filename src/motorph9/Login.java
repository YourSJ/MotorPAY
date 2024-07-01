
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package motorph9;

import javax.swing.JOptionPane;
import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import static com.opencsv.ICSVWriter.NO_QUOTE_CHARACTER;
import com.opencsv.exceptions.CsvException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.lang.String;
import javax.swing.*;

/**
 *
 * @author Shekinah Jabez
 */
public class Login extends javax.swing.JFrame {

    private static final String CSV_FILE = "src/motorph9/Credentials.csv";
    private String fname;
    
    
    
    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPnlBlack = new javax.swing.JPanel();
        jPnlDarkBlue = new javax.swing.JPanel();
        jLblLogo = new javax.swing.JLabel();
        jLblUname = new javax.swing.JLabel();
        jLblmotorPay = new javax.swing.JLabel();
        jLblPword = new javax.swing.JLabel();
        jUnameField = new javax.swing.JTextField();
        jPwordField = new javax.swing.JPasswordField();
        jBtnLogin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPnlBlack.setBackground(new java.awt.Color(0, 0, 51));

        jPnlDarkBlue.setBackground(new java.awt.Color(0, 0, 0));

        jLblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logos9/empdes3.png"))); // NOI18N

        jLblUname.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLblUname.setForeground(new java.awt.Color(255, 255, 255));
        jLblUname.setText("Username");

        jLblmotorPay.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLblmotorPay.setForeground(new java.awt.Color(255, 255, 255));
        jLblmotorPay.setText("PAY");

        jLblPword.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLblPword.setForeground(java.awt.Color.white);
        jLblPword.setText("Password");

        jUnameField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jUnameField.setForeground(new java.awt.Color(0, 0, 51));
        jUnameField.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        jUnameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jUnameFieldActionPerformed(evt);
            }
        });

        jPwordField.setForeground(new java.awt.Color(0, 0, 51));
        jPwordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPwordFieldActionPerformed(evt);
            }
        });

        jBtnLogin.setText("LOGIN");
        jBtnLogin.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBtnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPnlDarkBlueLayout = new javax.swing.GroupLayout(jPnlDarkBlue);
        jPnlDarkBlue.setLayout(jPnlDarkBlueLayout);
        jPnlDarkBlueLayout.setHorizontalGroup(
            jPnlDarkBlueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnlDarkBlueLayout.createSequentialGroup()
                .addGroup(jPnlDarkBlueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPnlDarkBlueLayout.createSequentialGroup()
                        .addGap(219, 219, 219)
                        .addComponent(jLblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLblmotorPay))
                    .addGroup(jPnlDarkBlueLayout.createSequentialGroup()
                        .addGap(211, 211, 211)
                        .addGroup(jPnlDarkBlueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLblPword, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLblUname))
                        .addGap(18, 18, 18)
                        .addGroup(jPnlDarkBlueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jUnameField, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(202, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPnlDarkBlueLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jBtnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(255, 255, 255))
        );
        jPnlDarkBlueLayout.setVerticalGroup(
            jPnlDarkBlueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnlDarkBlueLayout.createSequentialGroup()
                .addGroup(jPnlDarkBlueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPnlDarkBlueLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPnlDarkBlueLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLblmotorPay)
                        .addGap(42, 42, 42)))
                .addGroup(jPnlDarkBlueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLblUname)
                    .addComponent(jUnameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPnlDarkBlueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLblPword, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jBtnLogin)
                .addContainerGap(205, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPnlBlackLayout = new javax.swing.GroupLayout(jPnlBlack);
        jPnlBlack.setLayout(jPnlBlackLayout);
        jPnlBlackLayout.setHorizontalGroup(
            jPnlBlackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnlBlackLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jPnlDarkBlue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
        );
        jPnlBlackLayout.setVerticalGroup(
            jPnlBlackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnlBlackLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jPnlDarkBlue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPnlBlack, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPnlBlack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnLoginActionPerformed
        
                String userName = jUnameField.getText();
                String passWord = new String(jPwordField.getPassword());
                User user = null;

                try {
                    user = validateLogin(userName, passWord);
                    user.setFirstname(fname);
                } catch (IOException ex) {
                    Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                }

                if (user == null) {
                    JOptionPane.showMessageDialog(Login.this, 
                                                  "Incorrect Credential.",
                                                  "",
                                                  JOptionPane.ERROR_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(Login.this, 
                                                  "Log In Successful!!!",
                                                  "",
                                                  JOptionPane.PLAIN_MESSAGE);

                    
                    Dashboard newClassInstance = new Dashboard(user.getFirstName());
                        newClassInstance.setVisible(true);
                        
                    dispose();
                }
    }//GEN-LAST:event_jBtnLoginActionPerformed
 
     private User validateLogin(String userName, String passWord) throws IOException {
        String line;
        CSVReader csvReader = null;

        try {
            csvReader = new CSVReader(new FileReader(new File(CSV_FILE)));
            List<String[]> allData = csvReader.readAll();
            for (String[] row : allData) {
                if (row[0].equalsIgnoreCase(userName) && row[1].equals(passWord)) {
                    fname = row[2];
                    return new User(userName, row[2]);
                }
            }
        } catch (CsvException e) {
            e.printStackTrace();
        } finally {
            if (csvReader != null) {
                csvReader.close();
            }
        }
        return null;
    }
    
    private void jPwordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPwordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPwordFieldActionPerformed

    private void jUnameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jUnameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jUnameFieldActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnLogin;
    private javax.swing.JLabel jLblLogo;
    private javax.swing.JLabel jLblPword;
    private javax.swing.JLabel jLblUname;
    private javax.swing.JLabel jLblmotorPay;
    private javax.swing.JPanel jPnlBlack;
    private javax.swing.JPanel jPnlDarkBlue;
    private javax.swing.JPasswordField jPwordField;
    private javax.swing.JTextField jUnameField;
    // End of variables declaration//GEN-END:variables
}