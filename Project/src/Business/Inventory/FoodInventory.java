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
public class FoodInventory extends Inventory{
    private String targetAge;
    private int inventory;
    
    public FoodInventory() {
        super(Inventory.Type.Food.getValue());
    }

    public String getTargetAge() {
        return targetAge;
    }

    public void setTargetAge(String targetAge) {
        this.targetAge = targetAge;
    }

    public int getInventory() {
        return inventory;
    }

    public void setInventory(int inventory) {
        this.inventory = inventory;
    }
    
    
    
}
