/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Inventory;

/**
 *
 * @author liulei
 */
public class ShelterInventory extends Inventory {
    private String targetGender;
    private int inventory;
    
        public ShelterInventory() {
        super(Inventory.Type.Shelter.getValue());
    }

    public String getTargetGender() {
        return targetGender;
    }

    public void setTargetGender(String targetGender) {
        this.targetGender = targetGender;
    }

    public int getInventory() {
        return inventory;
    }

    public void setInventory(int inventory) {
        this.inventory = inventory;
    }
    
    
    
}
