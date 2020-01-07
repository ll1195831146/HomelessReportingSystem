/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.network;

import java.util.ArrayList;

/**
 *
 * @author linke
 */
public class State {
    private String name;
    private ArrayList<City> citylist;
    
    public State(){
        this.citylist = new ArrayList<>();
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<City> getCitylist() {
        return citylist;
    }

    public void setCitylist(ArrayList<City> citylist) {
        this.citylist = citylist;
    }
    
    public City CreateandAddNewCity(String name){
        City city = new City();
        city.setName(name);
        citylist.add(city);
        return city;
        
    }
            
    @Override
    public String toString(){
        return name;
        
    }
}
