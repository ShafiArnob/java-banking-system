/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fortknox.banking.system;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
/**
 *
 * @author Arnob
 */
public class withdrawPage extends javax.swing.JFrame {

    /**
     * Creates new form withdrawPage
     */
    public withdrawPage() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ac_number = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        amount = new javax.swing.JTextField();
        submitwithdrawBtn = new javax.swing.JButton();
        shoBalanceBtn = new javax.swing.JLabel();
        balanceAmount = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        password = new javax.swing.JTextField();
        backBtn = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        jLabel1.setText("Withdraw");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("AC Number :");

        ac_number.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        ac_number.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ac_numberActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("Enter Amount :");

        amount.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        submitwithdrawBtn.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        submitwithdrawBtn.setText("Submit");
        submitwithdrawBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitwithdrawBtnActionPerformed(evt);
            }
        });

        shoBalanceBtn.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        shoBalanceBtn.setForeground(new java.awt.Color(0, 0, 204));
        shoBalanceBtn.setText("Show Balance : -");
        shoBalanceBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                shoBalanceBtnMouseClicked(evt);
            }
        });

        balanceAmount.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        balanceAmount.setText("0");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setText("Password :");

        password.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        backBtn.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        backBtn.setText("< Back");
        backBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(144, 144, 144)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(27, 27, 27)
                                                .addComponent(jLabel2))
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel4)
                                                .addComponent(jLabel3)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(ac_number, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(amount, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(shoBalanceBtn)
                                        .addGap(18, 18, 18)
                                        .addComponent(balanceAmount)))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(submitwithdrawBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(backBtn)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(ac_number, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(amount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(submitwithdrawBtn)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(shoBalanceBtn)
                    .addComponent(balanceAmount))
                .addGap(57, 57, 57))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ac_numberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ac_numberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ac_numberActionPerformed

    private void submitwithdrawBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitwithdrawBtnActionPerformed
        // withdraw from account
        Connection con = null;
        String amountStr = amount.getText();
        int amountInt = Integer.parseInt(amountStr);
        int accountNumberInt = Integer.parseInt(ac_number.getText());
        String passwordInput = password.getText();
        
        try {
            String sql = "SELECT * FROM register WHERE ac_number='" + accountNumberInt + "' AND password='" + passwordInput + "'";
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank?zeroDateTimeBehavior=convertToNull", "root", "");
            Statement s = con.createStatement();
            ResultSet result = s.executeQuery(sql);

            if (result.next() && !(amountInt <= 0)) {
                int accountNumberDb = Integer.parseInt(result.getString("ac_number"));
                int amountDb = Integer.parseInt(result.getString("amount"));

                if (accountNumberInt == accountNumberDb) {
                    if(amountInt<=amountDb){
                        int newAmount = amountDb - amountInt;
                        ///try updating the new amount
                        try {
                            String sql2 = "UPDATE register SET amount='" + newAmount + "'WHERE ac_number='" + accountNumberDb + "'";
                            Class.forName("com.mysql.jdbc.Driver");
                            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank?zeroDateTimeBehavior=convertToNull", "root", "");
                            Statement st = con.createStatement();
                            st.executeUpdate(sql2);
                            JOptionPane.showMessageDialog(null, "Withdraw Successfull");
                        } catch (Exception e) {
                            System.out.println(e);
                        }
                    }
                    
                } else {
                    JOptionPane.showMessageDialog(null, "Account Not Registered");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Not Found or Invalid Amount");
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }//GEN-LAST:event_submitwithdrawBtnActionPerformed

    private void shoBalanceBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_shoBalanceBtnMouseClicked
        // Show Balance
        try{
            String sql = "SELECT * FROM register WHERE ac_number='" + ac_number.getText() + "'";
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank?zeroDateTimeBehavior=convertToNull", "root", "");
            Statement s = con.createStatement();
            ResultSet result = s.executeQuery(sql);
            if (result.next()){
                String amountDb = result.getString("amount");
                balanceAmount.setText(amountDb);
            }
            else{
                balanceAmount.setText("NA");
            }
        }catch(Exception e){

        }
    }//GEN-LAST:event_shoBalanceBtnMouseClicked

    private void backBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backBtnMouseClicked
        // Back to dashboard
        dashboard acc = new dashboard();
        acc.setVisible(true);
        dispose();
    }//GEN-LAST:event_backBtnMouseClicked

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
            java.util.logging.Logger.getLogger(withdrawPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(withdrawPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(withdrawPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(withdrawPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new withdrawPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ac_number;
    private javax.swing.JTextField amount;
    private javax.swing.JLabel backBtn;
    private javax.swing.JLabel balanceAmount;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField password;
    private javax.swing.JLabel shoBalanceBtn;
    private javax.swing.JButton submitwithdrawBtn;
    // End of variables declaration//GEN-END:variables
}
