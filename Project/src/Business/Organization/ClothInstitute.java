/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Inventory.InventoryDirectory;
import Business.Role.Role;
import Business.Role.ClothInstituteRole;
import java.util.ArrayList;

/**
 *
 * @author liulei
 */
public class ClothInstitute extends Organization{
    
 

    private InventoryDirectory inventoryDirectory;
    
 

    public ClothInstitute() {
        super(Organization.Type.ClothInstitute.getValue());
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
        roles.add(new ClothInstituteRole());
        return roles;
    }
    

}
