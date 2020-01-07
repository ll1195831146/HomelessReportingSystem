/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Inventory.InventoryDirectory;
import Business.Role.FoodInstituteRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author liulei
 */
public class FoodInstitute extends Organization{

  private InventoryDirectory inventoryDirectory;
    
    public FoodInstitute() {
        super(Organization.Type.FoodInstitute.getValue());
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
        roles.add(new FoodInstituteRole());
        return roles;
    }
    
}
