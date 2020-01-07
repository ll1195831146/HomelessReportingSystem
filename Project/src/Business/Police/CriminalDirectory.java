/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Police;

import Business.Hospital.Ward;
import java.util.ArrayList;

/**
 *
 * @author liulei
 */
public class CriminalDirectory {
     private ArrayList<Criminal> criminalList;

    public CriminalDirectory() {
        criminalList = new ArrayList();
    }

    public ArrayList<Criminal> getCriminalList() {
        return criminalList;
    }

        public Criminal addCriminal(){
        Criminal criminal = new Criminal();
        criminalList.add(criminal);
        return criminal;
    }
}
