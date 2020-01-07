/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Hospital.WardDirectory;
import Business.Role.HospitalRole;
import Business.Role.SchoolRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author liulei
 */
public class Hospital extends Organization{
    private WardDirectory wardDirectory;
    
    public Hospital() {
        super(Organization.Type.Hospital.getValue());
    }

    public WardDirectory getWardDirectory() {
        return wardDirectory;
    }

    public void setWardDirectory(WardDirectory wardDirectory) {
        this.wardDirectory = wardDirectory;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new HospitalRole());
        return roles;
    }
}
