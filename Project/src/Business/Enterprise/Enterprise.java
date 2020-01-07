/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.network.City;

/**
 *
 * @author liulei
 */
public abstract class Enterprise extends Organization{
    
    private EnterpriseType enterprisetype;
    
    private OrganizationDirectory organizationDirectory;
    private City city;


    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }

    public EnterpriseType getEnterprisetype() {
        return enterprisetype;
    }

    public void setEnterprisetype(EnterpriseType enterprisetype) {
        this.enterprisetype = enterprisetype;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    
    public enum EnterpriseType{
        Government("Government"),
        Institute("Institute"),
        User("User");
        
        private String value;

        public String getValue() {
            return value;
        }

        private EnterpriseType(String value){
            this.value = value;
        }
        
        public void setValue(String value) {
            this.value = value;
        }
        
        
        @Override
        public String toString(){
            return value;
        }
    }
    
    //missing constructor
    public Enterprise(String name, EnterpriseType type) {
        super(name);
        this.enterprisetype = type;
        this.organizationDirectory = new OrganizationDirectory();
    }
    
}
