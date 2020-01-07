/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Enterprise.Enterprise.EnterpriseType;
import Business.network.City;
import java.util.ArrayList;

/**
 *
 * @author liulei
 */
public class EnterpriseDirectory {
    
    private ArrayList<Enterprise> enterpriselist;
    

    public ArrayList<Enterprise> getEnterpriselist() {
        return enterpriselist;
    }

    public void setEnterpriselist(ArrayList<Enterprise> enterpriselist) {
        this.enterpriselist = enterpriselist;
    }
    
    
    public EnterpriseDirectory(){
        enterpriselist = new ArrayList();
    }
    
    //Create Enterprise
    
    public Enterprise createAndAddEnterprise(String name, EnterpriseType type, City city)
    {
        Enterprise enterprise = null;
        if(type == EnterpriseType.Government)
        {
            enterprise = new Government(name);
            enterprise.setCity(city);
            enterpriselist.add(enterprise);
            
        }
        else if(type == EnterpriseType.Institute)
        {
            enterprise = new Institute(name);
            enterprise.setCity(city);
            enterpriselist.add(enterprise);
            
        }
        else if(type == EnterpriseType.User)
        {
            enterprise = new User(name);
            enterprise.setCity(city);
            enterpriselist.add(enterprise);
            
        }
        return enterprise;
    }
}
