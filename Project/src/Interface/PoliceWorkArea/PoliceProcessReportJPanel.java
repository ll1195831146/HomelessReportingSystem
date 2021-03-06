/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.PoliceWorkArea;

import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.WorkQueue.ReportWorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import Business.Organization.Hospital;
import Business.network.Country;
import java.util.ArrayList;
import Business.EcoSystem;
import Business.Police.Criminal;
import Business.Police.CriminalDirectory;
import Business.UserAccount.UserAccount;
import Business.network.City;
import Business.network.State;

/**
 *
 * @author liulei
 */
public class PoliceProcessReportJPanel extends javax.swing.JPanel {
    
    EcoSystem system;
    JPanel userProcessContainer;
    ReportWorkRequest request;
    ArrayList<Organization> allorganization;
    UserAccount ua;
    private ArrayList<City> allcity;
    private CriminalDirectory criminalDirectory;
    /**
     * Creates new form PoliceProcessReportJPanel
     */


    PoliceProcessReportJPanel(JPanel userProcessContainer, ReportWorkRequest request, EcoSystem system, UserAccount ua, CriminalDirectory crinimalDirectory) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.request = request;
        this.system = system;
        this.ua = ua;
        this.criminalDirectory = crinimalDirectory;
        idLabel.setText(String.valueOf(request.getFacenumber()));
        txtID.setText(String.valueOf(request.getFacenumber()));
        criminalNamejLabel.setVisible(false);
        nametagjLabel.setVisible(false);
        //System.out.println(request.getAge());
        
        this.allorganization = new ArrayList<>();
        this.allcity = new ArrayList<>();
        
                for(Country country: system.getCountryList()){
            for (State state :country.getStatelist()){
                for(City c:state.getCitylist()){
                    allcity.add(c);
                    
                }
            }
        }
        for(City city:allcity){
            for(Enterprise e:city.getEnterprisedirectory().getEnterpriselist()){
                for(Organization o:e.getOrganizationDirectory().getOrganizationList()){
                    allorganization.add(o);       
                }
            }
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

        backJButton = new javax.swing.JButton();
        btnPass2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        idLabel = new javax.swing.JLabel();
        btnMatch = new javax.swing.JButton();
        txtID = new javax.swing.JTextField();
        btnReject = new javax.swing.JButton();
        nametagjLabel = new javax.swing.JLabel();
        criminalNamejLabel = new javax.swing.JLabel();
        enterpriseLabel = new javax.swing.JLabel();

        backJButton.setText("Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        btnPass2.setText("Pass");
        btnPass2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPass2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel1.setText("Homeless Face ID:");

        idLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        idLabel.setText("<ID>");

        btnMatch.setText("Macth");
        btnMatch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMatchActionPerformed(evt);
            }
        });

        btnReject.setText("Reject");
        btnReject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRejectActionPerformed(evt);
            }
        });

        nametagjLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        nametagjLabel.setText("Criminal Name:");

        criminalNamejLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        criminalNamejLabel.setText("<name>");

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("Police Process Work Area:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnMatch, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(backJButton))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(102, 102, 102)
                                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(btnReject, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                                            .addComponent(btnPass2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                            .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(idLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(nametagjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(criminalNamejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(211, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMatch, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nametagjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(criminalNamejLabel))
                .addGap(77, 77, 77)
                .addComponent(btnPass2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReject)
                    .addComponent(backJButton))
                .addContainerGap(97, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        PoliceWorkAreaJPanel pwjp = (PoliceWorkAreaJPanel) component;
        //pwjp.populateTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void btnPass2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPass2ActionPerformed
        // TODO add your handling code here:
        request.setPolicepass(true);
        request.setStatus("Police Passed");
        JOptionPane.showMessageDialog(null, "Set sucsessful!");
        Organization org = null;
        // System.out.println(enterprise);
        UserAccount ua = request.getSender();
        int points=ua.getPoints();
        points += 10;
        ua.setPoints(points);

        for (Organization organization : allorganization){
            org = null;
            if (organization instanceof Hospital){
                org = organization;

            }
            if (org!=null){
            org.getWorkQueue().getWorkRequestList().add(request);
        }
        }
        if (org!=null){
            ua.getWorkQueue().getWorkRequestList().add(request);
        }
    }//GEN-LAST:event_btnPass2ActionPerformed

    private void btnMatchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMatchActionPerformed
        // TODO add your handling code here:
        int a =0;
        int id = Integer.parseInt(txtID.getText());
        for(Criminal criminal : criminalDirectory.getCriminalList())
        {
            if(criminal.getNumber()==id){
                JOptionPane.showMessageDialog(null, "Find the criminal!");
                criminalNamejLabel.setVisible(true);
                nametagjLabel.setVisible(true);
                criminalNamejLabel.setText(criminal.getName());
                btnPass2.setEnabled(false);
                a++;
                break;
            }

        }
        if(a==0)
        {
            JOptionPane.showMessageDialog(null, "There isn't any record");
        }
    }//GEN-LAST:event_btnMatchActionPerformed

    private void btnRejectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRejectActionPerformed
        // TODO add your handling code here:
        request.setPolicepass(false);
        request.setStatus("Police Failed");
        JOptionPane.showMessageDialog(null, "Set sucsessful!");

    }//GEN-LAST:event_btnRejectActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JButton btnMatch;
    private javax.swing.JButton btnPass2;
    private javax.swing.JButton btnReject;
    private javax.swing.JLabel criminalNamejLabel;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel idLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel nametagjLabel;
    private javax.swing.JTextField txtID;
    // End of variables declaration//GEN-END:variables
}
