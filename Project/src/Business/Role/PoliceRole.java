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
import Interface.PoliceWorkArea.PoliceWorkAreaJPanel;
import javax.swing.JPanel;
import Business.Organization.Police;

/**
 *
 * @author liulei
 */
public class PoliceRole extends Role{
     @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem system) {
        return new PoliceWorkAreaJPanel(userProcessContainer, enterprise, (Police)organization,account,system);
    }
    
    public String toString() {
        return "Government Police";
    }
}
