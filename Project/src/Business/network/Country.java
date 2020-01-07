/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.network;
import Business.Enterprise.EnterpriseDirectory;
import java.util.ArrayList;

/**
 *
 * @author liulei
 */
public class Country {
    
    private String name;
    private ArrayList<State> statelist;
    
    public Country(){
        statelist = new ArrayList<>();
        
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<State> getStatelist() {
        return statelist;
    }

    public void setStatelist(ArrayList<State> statelist) {
        this.statelist = statelist;
    }
    
    public State createAndAddState(String name){
        State state = new State();
        state.setName(name);
        statelist.add(state);
        return state;
        
    }
    
    

    @Override
    public String toString(){
        return name;
    }
}
