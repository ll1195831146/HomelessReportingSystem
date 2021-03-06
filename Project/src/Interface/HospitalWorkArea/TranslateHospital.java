/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.HospitalWorkArea;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.WorkQueue.ReportWorkRequest;
import javax.swing.JPanel;
import Business.Organization.Hospital;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.network.City;
import Business.network.Country;
import Business.network.State;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author linke
 */
public class TranslateHospital extends javax.swing.JPanel {

    JPanel userProcessContainer;
    EcoSystem system;
    ReportWorkRequest request;
    private Hospital hospital;
    private UserAccount account;
    private ArrayList<Hospital> cityallhospital;
    private ArrayList<Organization> allorganization;
    private ArrayList<Hospital> allhospital;
    /**
     * Creates new form TranslateHospital
     */
    public TranslateHospital(JPanel userProcessContainer, ReportWorkRequest request, EcoSystem system, UserAccount ua,Hospital hospital) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.request = request;
        this.system = system;
        this.account = ua;
        this.hospital = hospital;
        this.allorganization = new ArrayList<>();
        txtoriginalhospital.setText(hospital.getName());
        for(Country c:system.getCountryList()){
            for(State s:c.getStatelist()){
                for(City city:s.getCitylist()){
                    for(Enterprise e:city.getEnterprisedirectory().getEnterpriselist()){
                        for(Organization o:e.getOrganizationDirectory().getOrganizationList()){
                            allorganization.add(o);
                        }
                    }
                }
            }
        }
        populateCountryCombobox();
        
    }
    private void populateCountryCombobox(){
        cbxcountry.removeAllItems();
        for (Country c:system.getCountryList()){
            cbxcountry.addItem(c);
        }
    }
    
    private void populateStateCombobox(Country country){
        cbxstate.removeAllItems();
        for (State s:country.getStatelist()){
            cbxstate.addItem(s);
        }
    }
    
    private void populateCityCombox(State state){
        cbxcity.removeAllItems();
        for (City c:state.getCitylist()){
            cbxcity.addItem(c);
        }
    }
    private void populateHospitalCombox(City city){
        cbxhospital.removeAllItems();
        this.allorganization = new ArrayList<>();
        this.cityallhospital = new ArrayList<>();
        System.out.println(city);
        for(Enterprise e:city.getEnterprisedirectory().getEnterpriselist()){
                System.out.println(e);
                for(Organization o:e.getOrganizationDirectory().getOrganizationList()){
                    System.out.println(o);
                    allorganization.add(o);       
                }
            }
        System.out.println(allorganization);
        for (Organization o:allorganization){
            if (o.getClass().getSimpleName().equals("Hospital")){
                
                cityallhospital.add((Hospital)o);
                
            }
        }
        System.out.println(cityallhospital);
        for(Hospital h:cityallhospital){
            cbxhospital.addItem(h);
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

        jLabel1 = new javax.swing.JLabel();
        txtoriginalhospital = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtareacondition = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cbxcountry = new javax.swing.JComboBox();
        cbxstate = new javax.swing.JComboBox();
        cbxcity = new javax.swing.JComboBox();
        cbxhospital = new javax.swing.JComboBox();
        btnSend = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        enterpriseLabel = new javax.swing.JLabel();

        jLabel1.setText("Original Hospital:");

        txtoriginalhospital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtoriginalhospitalActionPerformed(evt);
            }
        });

        txtareacondition.setColumns(20);
        txtareacondition.setRows(5);
        jScrollPane1.setViewportView(txtareacondition);

        jLabel2.setText("Condition Discribtion");

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel3.setText("Translate to:");

        cbxcountry.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " " }));
        cbxcountry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxcountryActionPerformed(evt);
            }
        });

        cbxstate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxstateActionPerformed(evt);
            }
        });

        cbxcity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxcityActionPerformed(evt);
            }
        });

        btnSend.setText("Send");
        btnSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendActionPerformed(evt);
            }
        });

        backJButton.setText("Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        jLabel4.setText("Country:");

        jLabel5.setText("State:");

        jLabel6.setText("City:");

        jLabel7.setText("Hospital:");

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("Hospital Translate Work Area:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(backJButton)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(cbxcountry, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtoriginalhospital, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cbxstate, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cbxcity, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cbxhospital, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(btnSend))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtoriginalhospital, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel2)))
                .addGap(7, 7, 7)
                .addComponent(jLabel3)
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxcountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxstate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxcity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxhospital, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSend)
                    .addComponent(backJButton))
                .addContainerGap(31, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtoriginalhospitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtoriginalhospitalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtoriginalhospitalActionPerformed

    private void cbxcountryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxcountryActionPerformed
        // TODO add your handling code here:
        Country country = (Country) cbxcountry.getSelectedItem();
        if (country != null){
            populateStateCombobox(country);
        }
    }//GEN-LAST:event_cbxcountryActionPerformed

    private void btnSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendActionPerformed
        // TODO add your handling code here:
        Hospital h = (Hospital) cbxhospital.getSelectedItem();
        for (Organization hospital :allorganization){
            if(hospital.getName().equals(h.getName())){
                hospital.getWorkQueue().getWorkRequestList().add(request);
                request.setStatus("Translated to Hospital");
                break;
            }
        }
        JOptionPane.showMessageDialog(null, "Translate Successful");
        btnSend.setEnabled(false);
    }//GEN-LAST:event_btnSendActionPerformed

    private void cbxstateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxstateActionPerformed

        // TODO add your handling code here:
        State state = (State) cbxstate.getSelectedItem();
        if (state != null){
            populateCityCombox(state);
        }
    }//GEN-LAST:event_cbxstateActionPerformed

    private void cbxcityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxcityActionPerformed
        // TODO add your handling code here:
        City city = (City) cbxcity.getSelectedItem();
        if (city != null){
            populateHospitalCombox(city);
        }
    }//GEN-LAST:event_cbxcityActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JButton btnSend;
    private javax.swing.JComboBox cbxcity;
    private javax.swing.JComboBox cbxcountry;
    private javax.swing.JComboBox cbxhospital;
    private javax.swing.JComboBox cbxstate;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtareacondition;
    private javax.swing.JTextField txtoriginalhospital;
    // End of variables declaration//GEN-END:variables
}
