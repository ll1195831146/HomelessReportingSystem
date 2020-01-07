/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.UserWorkArea;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Enterprise.User;
import Business.UserAccount.UserAccount;
import Business.network.Country;
import java.awt.CardLayout;
import javax.swing.JPanel;
import Business.Role.UserRole;
import Business.Employee.Employee;
/**
 *
 * @author liulei
 */
public class UserWorkAreaJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    Country network;
    EcoSystem system;
    User user;
    private UserAccount account;
    private Enterprise enterprise;
    private Employee employee;
    private String name;
    private int points;
    /**
     * Creates new form UserWorkArea
     */

    public UserWorkAreaJPanel(JPanel userProcessContainer, Enterprise enterprise, Organization organization,  EcoSystem business, UserAccount account) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
       // this.network = network;
        this.system = business;
        
        this.account = account;
        this.enterprise = enterprise;
        employee = account.getEmployee();
        name = employee.getName();
        points = account.getPoints();
        txtName.setText(name);
        txtPoints.setText(String.valueOf(points));
        labeluser.setText(account.getUsername());
      //System.out.println(enterprise);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnReport = new javax.swing.JButton();
        btnDonate = new javax.swing.JButton();
        btnMyReports = new javax.swing.JButton();
        txtName = new javax.swing.JTextField();
        txtname = new javax.swing.JLabel();
        txtage = new javax.swing.JLabel();
        txtPoints = new javax.swing.JTextField();
        enterpriseLabel = new javax.swing.JLabel();
        labeluser = new javax.swing.JLabel();

        btnReport.setText("Report");
        btnReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportActionPerformed(evt);
            }
        });

        btnDonate.setText("Donate");
        btnDonate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDonateActionPerformed(evt);
            }
        });

        btnMyReports.setText("My Reports");
        btnMyReports.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMyReportsActionPerformed(evt);
            }
        });

        txtName.setEnabled(false);

        txtname.setText("UserName");

        txtage.setText("User Points");

        txtPoints.setEnabled(false);

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("User Work Area . ");

        labeluser.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labeluser.setText("<User>");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(178, 178, 178)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtage)
                            .addComponent(txtname))
                        .addGap(73, 73, 73)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPoints, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnDonate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnReport, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE))
                    .addComponent(btnMyReports, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(enterpriseLabel)
                        .addGap(18, 18, 18)
                        .addComponent(labeluser, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(257, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labeluser, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtname))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtage)
                    .addComponent(txtPoints, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addComponent(btnReport, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDonate, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnMyReports, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportActionPerformed
        // TODO add your handling code here:
                
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("ReportJPanel", new ReportJPanel(userProcessContainer, account, enterprise,system));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnReportActionPerformed

    private void btnDonateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDonateActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("DonateJPanel", new DonateJPanel(userProcessContainer, account, enterprise,system));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnDonateActionPerformed

    private void btnMyReportsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMyReportsActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("MyReportsJPanel", new MyReportsJPanel(userProcessContainer, account, enterprise, system));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnMyReportsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDonate;
    private javax.swing.JButton btnMyReports;
    private javax.swing.JButton btnReport;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel labeluser;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPoints;
    private javax.swing.JLabel txtage;
    private javax.swing.JLabel txtname;
    // End of variables declaration//GEN-END:variables
}
