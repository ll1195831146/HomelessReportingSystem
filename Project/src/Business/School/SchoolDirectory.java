/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.School;

import Business.Police.*;
import Business.Hospital.Ward;
import java.util.ArrayList;

/**
 *
 * @author liulei
 */
public class SchoolDirectory {
     private ArrayList<School> schoolList;

    public SchoolDirectory() {
        schoolList = new ArrayList();
    }

    public ArrayList<School> getschoolList() {
        return schoolList;
    }

        public School addSchool(School s){
        schoolList.add(s);
        return s;
    }
}
