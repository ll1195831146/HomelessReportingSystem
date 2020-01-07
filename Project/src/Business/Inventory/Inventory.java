/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Inventory;

import Business.Employee.EmployeeDirectory;
import Business.Employee.PersonDirectory;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.WorkQueue;

/**
 *
 * @author liulei
 */
public abstract class Inventory {
    private String name;
    
     public enum Type{
        Food("Food Institution"),
        Cloth("Food Institution"),
        Shelter("Shelter Institution");
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }
     
     public Inventory(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
        
            @Override
        public String toString() {
        return name;
    }
}
