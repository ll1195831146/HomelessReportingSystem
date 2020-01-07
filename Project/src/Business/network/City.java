/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.network;

import Business.Enterprise.EnterpriseDirectory;

/**
 *
 * @author linke
 */
public class City {
    private String name;
       
    private EnterpriseDirectory enterprisedirectory;
    
    public City(){
        enterprisedirectory = new EnterpriseDirectory();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EnterpriseDirectory getEnterprisedirectory() {
        return enterprisedirectory;
    }

    public void setEnterprisedirectory(EnterpriseDirectory enterprisedirectory) {
        this.enterprisedirectory = enterprisedirectory;
    }
    
    @Override
    public String toString(){
        return name;
    }
}
