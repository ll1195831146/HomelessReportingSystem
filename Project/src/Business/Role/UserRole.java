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
import Interface.UserWorkArea.UserWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author liulei
 */
public class UserRole extends Role{
    private String name;
    private String age;

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
    
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new UserWorkAreaJPanel(userProcessContainer, enterprise, organization, business,account);
    }
    
    public String toString() {
        return "User";
    }
}
