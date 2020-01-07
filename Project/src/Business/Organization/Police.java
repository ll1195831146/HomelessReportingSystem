/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Police.CriminalDirectory;
import Business.Role.HospitalRole;
import Business.Role.PoliceRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author liulei
 */
public class Police extends Organization{
    private CriminalDirectory criminalDirectory;
    public Police() {
        super(Organization.Type.Police.getValue());
    }

    public CriminalDirectory getCriminalDirectory() {
        return criminalDirectory;
    }

    public void setCriminalDirectory(CriminalDirectory criminalDirectory) {
        this.criminalDirectory = criminalDirectory;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new PoliceRole());
        return roles;
    }
}
