/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.ShelterInstitute;
import Business.UserAccount.UserAccount;
import Business.network.Country;
import Interface.ShelterInstituteWorkArea.ShelterInstituteWorkAreaJPanel;
import Interface.UserWorkArea.UserWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author liulei
 */
public class ShelterInstituteRole extends Role{
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem system) {
        return new ShelterInstituteWorkAreaJPanel(userProcessContainer, enterprise, (ShelterInstitute)organization,  system,account);
    }
    
    public String toString() {
        return "Shelter Institute";
    }
}
