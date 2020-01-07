/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.ClothInstitute;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.network.Country;
import Interface.ClothInstituteWorkArea.ClothInstituteWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author liulei
 */
public class ClothInstituteRole extends Role{
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem system) {
        return new ClothInstituteWorkAreaJPanel(userProcessContainer, enterprise,(ClothInstitute)organization,account,system);
    }
    
    public String toString() {
        return "Cloth Institute";
    }
}
