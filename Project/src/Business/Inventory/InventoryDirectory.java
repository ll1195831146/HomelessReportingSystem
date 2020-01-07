/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Inventory;

import Business.WorkQueue.WorkRequest;
import java.util.ArrayList;

/**
 *
 * @author liulei
 */
public class InventoryDirectory{
    private ArrayList<Inventory> inventoryList;

    public InventoryDirectory() {
        inventoryList = new ArrayList();
    }

    public ArrayList<Inventory> getInventoryList() {
        return inventoryList;
    }
    
            public Inventory addInventory(Inventory i){
        inventoryList.add(i);
        return i;
    }
    
}
