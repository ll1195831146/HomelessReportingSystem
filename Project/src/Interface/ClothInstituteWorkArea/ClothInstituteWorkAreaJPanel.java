/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.ClothInstituteWorkArea;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Inventory.ClothInventory;
import Business.Inventory.Inventory;
import Business.Organization.ClothInstitute;
import Business.Organization.Hospital;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.ReportWorkRequest;
import Business.WorkQueue.WorkRequest;
import Business.network.Country;
import Interface.UserWorkArea.ReportJPanel;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author liulei
 */
public class ClothInstituteWorkAreaJPanel extends javax.swing.JPanel {

        JPanel userProcessContainer;
    EcoSystem system;
    Country network;
    private UserAccount account;
    private ClothInstitute clothinstitute;
    private Enterprise enterprise;
    private ArrayList<ClothInventory> ciList;
    /**
     * Creates new form ClothInstituteWorkAreaJPanel
     */


    public ClothInstituteWorkAreaJPanel(JPanel userProcessContainer, Enterprise enterprise, Organization organization, UserAccount account, EcoSystem system) {
        initComponents();
                this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.account = account;
        this.enterprise = enterprise;
        this.clothinstitute = (ClothInstitute) organization;
        System.out.println(clothinstitute.getWorkQueue().getWorkRequestList());
        this.ciList = new ArrayList<>();
        for(Inventory i : clothinstitute.getInventoryDirectory().getInventoryList()){
            ciList.add((ClothInventory) i);
        }
        populateTable();
        populateInventoryTable();
    }
    
    public void populateTable(){
        DefaultTableModel model = (DefaultTableModel)tblReport.getModel();
        
        model.setRowCount(0);
        for(WorkRequest request : clothinstitute.getWorkQueue().getWorkRequestList()){
            if(request.getType().equals("report")){
            Object[] row = new Object[4];
            row[0] = request;
            row[1] = request.getSender().getEmployee().getName();
            row[2] = request.getReceiver();
            row[3] = request.getStatus();
            model.addRow(row);
            }
     }
    }
    
    public void populateInventoryTable(){
        DefaultTableModel model = (DefaultTableModel)tblInventory.getModel();
        
        model.setRowCount(0);

        for(ClothInventory ci : ciList){
            Object[] row = new Object[4];
            row[0] = ci;
            row[1] = ci.getTargetAge();
            row[2] = ci.getTargetGender();
            row[3] = ci.getInventory();
            model.addRow(row);
            }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAssign = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        btnProcess = new javax.swing.JButton();
        btnDonation = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblInventory = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblReport = new javax.swing.JTable();
        enterpriseLabel = new javax.swing.JLabel();

        btnAssign.setText("Assign to me");
        btnAssign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignActionPerformed(evt);
            }
        });

        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        btnProcess.setText("Process");
        btnProcess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcessActionPerformed(evt);
            }
        });

        btnDonation.setText("Donation");
        btnDonation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDonationActionPerformed(evt);
            }
        });

        tblInventory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Name", "Target Age", "Target Gender", "Inventory"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblInventory);

        tblReport.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Sender", "Reciever", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblReport);

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("Cloth Institution Work Area:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnRefresh)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnDonation, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnAssign, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(211, 211, 211)
                            .addComponent(btnProcess, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(97, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnRefresh)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnProcess, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAssign, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDonation, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAssignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblReport.getSelectedRow();

        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please Select a Row First!");
        }

        WorkRequest request = (WorkRequest)tblReport.getValueAt(selectedRow, 0);
        
        if(request.getStatus().equals("Hospital Passed")||request.getStatus().equals("Cloth Processing")||request.getStatus().equals("Food Processing")||request.getStatus().equals("Shelter Processing")||request.getStatus().contains("Received")||request.getStatus().contains("ShelterInstitution Completed")||request.getStatus().contains("FoodInstitution Completed")){
            request.setReceiver(account);
            request.setStatus("Pending");
            populateTable();
        }
         else{
              JOptionPane.showMessageDialog(null, "This report has been processed");
        }
    }//GEN-LAST:event_btnAssignActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
        populateTable();
        populateInventoryTable();
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnProcessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcessActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblReport.getSelectedRow();

        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please Select a Row First!");
        }

        ReportWorkRequest request = (ReportWorkRequest)tblReport.getValueAt(selectedRow, 0);
        if(request.getStatus()!=("Pending")){
            JOptionPane.showMessageDialog(null, "Please assign report to you first!");
        }
        else{
        request.setStatus("Cloth Processing");

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("ClothRequestJPanel", new ClothRequestJPanel(userProcessContainer, account, enterprise,system,request,clothinstitute));
        layout.next(userProcessContainer);
        }
        /*octorProcessReportJPanel processWorkRequestJPanel = new DoctorProcessReportJPanel(userProcessContainer, request, system, account);
        userProcessContainer.add("DoctorProcessReportJPanel", processWorkRequestJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);*/
    }//GEN-LAST:event_btnProcessActionPerformed

    private void btnDonationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDonationActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("ClothDonateJPanel", new ClothDonateJPanel(userProcessContainer, account, enterprise,system,clothinstitute));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnDonationActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssign;
    private javax.swing.JButton btnDonation;
    private javax.swing.JButton btnProcess;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblInventory;
    private javax.swing.JTable tblReport;
    // End of variables declaration//GEN-END:variables
}
