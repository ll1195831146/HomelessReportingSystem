/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Organization.Organization;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import Business.network.Country;
import java.util.ArrayList;

/**
 *
 * @author liulei
 */
public class EcoSystem extends Organization{
    
    private static EcoSystem system;
    private ArrayList<Country> countrylist;
    
    
    public ArrayList<Country> getCountryList() {
        return countrylist;
    }

    public void setCountryList(ArrayList<Country> countrylist) {
        this.countrylist = countrylist;
    }
    
    public static EcoSystem getInstance()
    {
        if(system == null)
        {
            system = new EcoSystem();
        }
        return system;
    }

    public Country createAndAddCountry(String name){
        Country country = new Country();
        country.setName(name);
        countrylist.add(country);
        return country;
        
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList = new ArrayList();
        roleList.add(new SystemAdminRole());
        return roleList;
    }
    //error
    private EcoSystem(){
        super(null);
        countrylist = new ArrayList();
    }
    
    public boolean checkIfUserNameIsUnique(String username)
    {
        if(!this.getUserAccountDirectory().checkIfUsernameIsUnique(username)){
            return false;
        }
        
        for(Country network : countrylist){
            
        }
        return true;
    }

}
