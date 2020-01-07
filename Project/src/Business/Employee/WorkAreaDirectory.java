/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import java.util.ArrayList;

/**
 *
 * @author liulei
 */
public class WorkAreaDirectory {
    private ArrayList<WorkArea> workAreaList;

    public WorkAreaDirectory() {
        workAreaList = new ArrayList();
    }

    public ArrayList<WorkArea> getWorkAreaList() {
        return workAreaList;
    }
    
            public WorkArea addWorkArea(WorkArea p){
        workAreaList.add(p);
        return p;
    }
}
