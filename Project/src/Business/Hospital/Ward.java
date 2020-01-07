/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Hospital;

import Business.WorkQueue.ReportWorkRequest;
import java.util.ArrayList;

/**
 *
 * @author liulei
 */
public class Ward {
    private ArrayList<ReportWorkRequest> patientlist;
    private String wardNumber;
    private int patientNumber = 0;

    public String getWardNumber() {
        return wardNumber;
    }

    public void setWardNumber(String wardNumber) {
        this.wardNumber = wardNumber;
    }

    public int getPatientNumber() {
        return patientNumber;
    }

    public void setPatientNumber(int patientNumber) {
        this.patientNumber = patientNumber;
    }
    
        public Ward() {
        patientlist = new ArrayList();
    }

    public ArrayList<ReportWorkRequest> getPatientlist() {
        return patientlist;
    }
    
        public ReportWorkRequest addReportWorkRequest(ReportWorkRequest r){
        patientlist.add(r);
        return r;
    }

        @Override
    public String toString() {
        return wardNumber;
    }
}
