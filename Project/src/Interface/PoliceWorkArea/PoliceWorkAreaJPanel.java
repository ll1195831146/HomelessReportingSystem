/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.PoliceWorkArea;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.MapsData;
import Business.Organization.Police;
import Business.Police.CriminalDirectory;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.ReportWorkRequest;
import Business.WorkQueue.WorkRequest;
import Business.network.Country;
import java.awt.CardLayout;
import java.awt.Image;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author liulei
 */
public class PoliceWorkAreaJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    EcoSystem system;
    Country network;
    private Police police;
    private UserAccount account;
    private ArrayList<MapsData> alldata;
    private static String m;
    private String jsonPayload;
    private ArrayList<ReportWorkRequest> allrequest;
    private static String s;
    private static String p;
    private static String pass;
    private static String f;
    /**
     * Creates new form PoliceWorkArea
     */

    public PoliceWorkAreaJPanel(JPanel userProcessContainer, Enterprise enterprise, Police organization, UserAccount account, EcoSystem system) {

        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.account = account;
        this.police = organization;
        this.alldata = new ArrayList<>();
        this.allrequest = new ArrayList<>();
        populateTable();
        populateMaps(police);
        
    }
    
        public void populateTable(){
        DefaultTableModel model = (DefaultTableModel)tblReport.getModel();
        
        model.setRowCount(0);
        System.out.println(police.getWorkQueue().getWorkRequestList() +"1");
        for(WorkRequest request : police.getWorkQueue().getWorkRequestList()){
            Object[] row = new Object[3];
            row[0] = request;
            row[1] = request.getSender().getEmployee().getName();
            row[2] = request.getStatus();
            model.addRow(row);
        }
    }
        
        public void populateMaps(Police police){
            for(WorkRequest request : police.getWorkQueue().getWorkRequestList()){
                ReportWorkRequest report = (ReportWorkRequest) request;
                allrequest.add(report);
                alldata.add(report.getMapsdata()) ;
            }
            
            //System.out.println(alldata);
            StringBuilder marker = new StringBuilder();
            for(ReportWorkRequest re:allrequest){
                if(re.getStatus().equals("Sent")){
                  int streetnum = re.getMapsdata().getStreetnum();
                  String streetname = re.getMapsdata().getStreetname();
                  String city = re.getMapsdata().getCity();
                  String state = re.getMapsdata().getState();
                  String country = re.getMapsdata().getCountry();
                  marker
                  .append("%7C")
                  .append(streetnum)
                  .append("+")
                  .append(streetname)
                  .append(",")
                  .append(city)
                  .append(",")
                  .append(state);
                   }
                
            }
            s=marker.toString();
            StringBuilder marker1 = new StringBuilder();
            for(ReportWorkRequest re:allrequest){
                if(re.getStatus().equals("Police Passed")||re.getStatus().equals("Hospital Passed")
                        ||re.getStatus().equals("Hospital Failed")||re.getStatus().equals("Cloth Processing")||
                        re.getStatus().equals("Food Processing")||re.getStatus().equals("Shelter Processing")||re.getStatus().equals("Pending")){
                  int streetnum = re.getMapsdata().getStreetnum();
                  String streetname = re.getMapsdata().getStreetname();
                  String city = re.getMapsdata().getCity();
                  String state = re.getMapsdata().getState();
                  String country = re.getMapsdata().getCountry();
                  marker1
                  .append("%7C")
                  .append(streetnum)
                  .append("+")
                  .append(streetname)
                  .append(",")
                  .append(city)
                  .append(",")
                  .append(state);
                   }
                
            }
            p = marker1.toString();
            StringBuilder marker2 = new StringBuilder();
            for(ReportWorkRequest re:allrequest){
                if(re.getStatus().contains("Received")||re.getStatus().contains("Completed")){
                  int streetnum = re.getMapsdata().getStreetnum();
                  String streetname = re.getMapsdata().getStreetname();
                  String city = re.getMapsdata().getCity();
                  String state = re.getMapsdata().getState();
                  String country = re.getMapsdata().getCountry();
                  marker2
                  .append("%7C")
                  .append(streetnum)
                  .append("+")
                  .append(streetname)
                  .append(",")
                  .append(city)
                  .append(",")
                  .append(state);
                   }
                
            }
            pass = marker2.toString();
            StringBuilder marker3 = new StringBuilder();
            for(ReportWorkRequest re:allrequest){
                if(re.getStatus().equals("Police Failed")){
                  int streetnum = re.getMapsdata().getStreetnum();
                  String streetname = re.getMapsdata().getStreetname();
                  String city = re.getMapsdata().getCity();
                  String state = re.getMapsdata().getState();
                  String country = re.getMapsdata().getCountry();
                  marker3
                  .append("%7C")
                  .append(streetnum)
                  .append("+")
                  .append(streetname)
                  .append(",")
                  .append(city)
                  .append(",")
                  .append(state);
                   }
                
            }
            f= marker3.toString();
     
            jsonPayload = translatrURL(alldata.get(0));
            System.out.println(jsonPayload);
            String imageUrl = jsonPayload;
            String destinationFile = "src/images/image2.jpg";
        try {
            saveImage(imageUrl, destinationFile);
        } catch (IOException ex) {
            Logger.getLogger(PoliceWorkAreaJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        ImageIcon icon = new ImageIcon(destinationFile);
        icon.setImage(icon.getImage().getScaledInstance(600,300,Image.SCALE_DEFAULT));
        image.setIcon(icon);
            }
        public  String translatrURL(MapsData data){
        
        int streetnum = data.getStreetnum();
        String streetname = data.getStreetname();
        String city = data.getCity();
        String state = data.getState();
        String country = data.getCountry();
        int zoom = zoomslider.getValue();
                //data.getZoom();
        int width = data.getWidth();
        int height = data.getHeight();

        
        
        
        String jsonPayload = new StringBuilder()
        .append("http://maps.googleapis.com/maps/api/staticmap?center=")
        .append(streetnum)
        .append("+")
        .append(streetname)
        .append("+Steet,")
        .append(city)
        .append(",")
        .append(state)
        .append(",")
        .append(country)
        .append("&zoom=")
        .append(zoom)
        .append("&size=")
        .append(width)
        .append("x")
        .append(height)
        .append("&markers=color:blue%7Clabel:S")
        .append(s)
        .append("&markers=color:yellow%7Clabel:P")
        .append(p)
        .append("&markers=color:green%7Clabel:P")
        .append(pass)
        .append("&markers=color:red%7Clabel:F")
        .append(f)
        .append("&key=AIzaSyDFQ_LC3EeIShTRhwBJivnWPF4xrvUhmi4")
        .toString();

        return jsonPayload;
    }

    public static void saveImage(String imageUrl, String destinationFile) throws IOException {
    URL url = new URL(imageUrl);
    InputStream is = url.openStream();
    OutputStream os = new FileOutputStream(destinationFile);

    byte[] b = new byte[2048];
    int length;

    while ((length = is.read(b)) != -1) {
        os.write(b, 0, length);
    }

    is.close();
    os.close();
}
        
        

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnProcess = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblReport = new javax.swing.JTable();
        btnAssign = new javax.swing.JButton();
        image = new javax.swing.JLabel();
        enterpriseLabel = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        zoomslider = new javax.swing.JSlider();
        txtzoom = new javax.swing.JTextField();
        btnrefresh = new javax.swing.JButton();

        btnProcess.setText("Process Report");
        btnProcess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcessActionPerformed(evt);
            }
        });

        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        tblReport.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Sender", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblReport);

        btnAssign.setText("Assign to me");
        btnAssign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignActionPerformed(evt);
            }
        });

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("Police Work Area:");

        jLabel10.setText("Zoom:");

        zoomslider.setMaximum(20);
        zoomslider.setMinimum(10);
        zoomslider.setMinorTickSpacing(1);
        zoomslider.setValue(15);
        zoomslider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                zoomsliderStateChanged(evt);
            }
        });

        txtzoom.setEditable(false);
        txtzoom.setText("15");
        txtzoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtzoomActionPerformed(evt);
            }
        });

        btnrefresh.setText("Refresh");
        btnrefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrefreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(image)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnRefresh)
                                        .addComponent(btnAssign))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnProcess, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(jLabel10)
                        .addGap(53, 53, 53)
                        .addComponent(zoomslider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtzoom, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnrefresh)))
                .addContainerGap(155, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(btnRefresh)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnProcess, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAssign, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(image)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(13, 13, 13))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtzoom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnrefresh))
                        .addComponent(zoomslider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(157, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnProcessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcessActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblReport.getSelectedRow();

        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please Select a Row First!");
        }
        
        ReportWorkRequest request = (ReportWorkRequest)tblReport.getValueAt(selectedRow, 0);
         if (request.getReceiver()==null){
            JOptionPane.showMessageDialog(null, "Please assign the request first!");
            
        }else{
            if(request.getStatus().equals("Pending")||request.getReceiver().getUsername().equals(account.getUsername())){
              
            request.setStatus("Processing");
            CriminalDirectory criminalDirectory = police.getCriminalDirectory();
            PoliceProcessReportJPanel processReportJPanel = new PoliceProcessReportJPanel(userProcessContainer, request, system, account, criminalDirectory);
            userProcessContainer.add("ProcessReportJPanel", processReportJPanel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
              
            }else{
            JOptionPane.showMessageDialog(null, "This request has been processed!");  
            }
        }
    
    }//GEN-LAST:event_btnProcessActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
        populateTable();
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnAssignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblReport.getSelectedRow();
        
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please Select a Row First!");
        }
        
        WorkRequest request = (WorkRequest)tblReport.getValueAt(selectedRow, 0);
        if(request.getStatus().equals("Sent")){
        request.setReceiver(account);
        request.setStatus("Pending");
        populateTable();
              
        }
//        if(request.getReceiver()==null||request.getReceiver().getUsername().equals(account.getUsername())){
        else{
            JOptionPane.showMessageDialog(null, "This report has been processed");
        }
    }//GEN-LAST:event_btnAssignActionPerformed

    private void zoomsliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_zoomsliderStateChanged
        // TODO add your handling code here:
        int value=zoomslider.getValue();
        txtzoom.setText(String.valueOf(value));
    }//GEN-LAST:event_zoomsliderStateChanged

    private void txtzoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtzoomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtzoomActionPerformed

    private void btnrefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrefreshActionPerformed
        // TODO add your handling code here:
        populateMaps(police);
    }//GEN-LAST:event_btnrefreshActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssign;
    private javax.swing.JButton btnProcess;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnrefresh;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel image;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblReport;
    private javax.swing.JTextField txtzoom;
    private javax.swing.JSlider zoomslider;
    // End of variables declaration//GEN-END:variables
}
