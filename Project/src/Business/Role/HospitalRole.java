/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.network.Country;
import Interface.HospitalWorkArea.HospitalWorkAreaJPanel;
import javax.swing.JPanel;
import Business.Organization.Hospital;
/**
 *
 * @author liulei
 */
public class HospitalRole extends Role{
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem system) {
        return new HospitalWorkAreaJPanel(userProcessContainer, enterprise,(Hospital)organization,account,system);
    }
    
    public String toString() {
        return "Government Hospital";
    }
}
