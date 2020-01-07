/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Hospital;

import java.util.ArrayList;

/**
 *
 * @author liulei
 */
public class WardDirectory {
        private ArrayList<Ward> wardList;

    public WardDirectory() {
        wardList = new ArrayList();
    }

    public ArrayList<Ward> getWardList() {
        return wardList;
    }
    
        public Ward addWard(Ward w){
        wardList.add(w);
        return w;
    }
        
         public void deleteWard(Ward ward){
        wardList.remove(ward);
    }
}
