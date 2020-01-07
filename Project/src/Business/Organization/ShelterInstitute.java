/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Inventory.InventoryDirectory;
import Business.Role.PoliceRole;
import Business.Role.Role;
import Business.Role.ClothInstituteRole;
import Business.Role.ShelterInstituteRole;
import java.util.ArrayList;

/**
 *
 * @author liulei
 */
public class ShelterInstitute extends Organization{
    private InventoryDirectory inventoryDirectory;
    
    public ShelterInstitute() {
        super(Organization.Type.ShelterInstitute.getValue());
    }

    public InventoryDirectory getInventoryDirectory() {
        return inventoryDirectory;
    }

    public void setInventoryDirectory(InventoryDirectory inventoryDirectory) {
        this.inventoryDirectory = inventoryDirectory;
    }


    

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new ShelterInstituteRole());
        return roles;
    }
}
