/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.FoodInstitute;
import Business.Organization.Organization;
import static Business.Organization.Organization.Type.FoodInstitute;
import Business.UserAccount.UserAccount;
import Business.network.Country;
import Interface.FoodInstituteWorkArea.FoodInstituteWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author liulei
 */
public class FoodInstituteRole extends Role{
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem system) {
        return new FoodInstituteWorkAreaJPanel(userProcessContainer, enterprise,(FoodInstitute)organization,account,system);
    }
    
    public String toString() {
        return "Food Institute";
    }
}
