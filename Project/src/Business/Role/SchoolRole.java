/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.School;
import Business.UserAccount.UserAccount;
import Interface.SchoolWorkArea.SchoolWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author liulei
 */
public class SchoolRole extends Role{
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem system) {
        return new SchoolWorkAreaJPanel(userProcessContainer, enterprise,(School)organization,account,system);
    }
    
    public String toString() {
        return "Goverment School";
    }
}
