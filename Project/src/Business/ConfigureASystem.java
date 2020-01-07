package Business;

import Business.Employee.Employee;
import Business.Role.SystemAdminRole;
import Business.Employee.Person;
import Business.Employee.WorkArea;
import Business.Enterprise.Enterprise;
import Business.Role.PoliceRole;
import Business.Role.UserRole;
import Business.Role.HospitalRole;
import Business.UserAccount.UserAccount;
import Business.network.Country;
import Business.Enterprise.Enterprise;
import Business.Enterprise.Government;
import Business.Enterprise.Institute;
import Business.Organization.Organization;
import Business.Organization.Police;
import Business.Organization.Hospital;
import Business.Enterprise.User;
import Business.Organization.ClothInstitute;
import Business.Organization.FoodInstitute;
import Business.Organization.ShelterInstitute;
import Business.Role.ClothInstituteRole;
import Business.Role.FoodInstituteRole;
import Business.Role.ShelterInstituteRole;
import Business.network.State;
import Business.network.City;
/**
 *
 * @author rrheg
 */
public class ConfigureASystem {
    
        public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
        WorkArea w = new WorkArea();
        w.setName("East");
        Employee employee = system.getEmployeeDirectory().createEmployee("admin staff",w);
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("admin", "admin", employee, new SystemAdminRole(),100);
       /* Country us = system.createAndAddCountry("America");
        State ma = us.createAndAddState("Massachusetts");
        City boston = ma.CreateandAddNewCity("Boston");
        
        Government g = (Government)boston.getEnterprisedirectory().createAndAddEnterprise("goverment", Enterprise.EnterpriseType.Government);
        Police p = (Police)g.getOrganizationDirectory().createOrganization(Organization.Type.Police);
        Hospital h = (Hospital)g.getOrganizationDirectory().createOrganization(Organization.Type.Hospital); 
        Institute i = (Institute)boston.getEnterprisedirectory().createAndAddEnterprise("institute", Enterprise.EnterpriseType.Institute);
        ClothInstitute c = (ClothInstitute)i.getOrganizationDirectory().createOrganization(Organization.Type.ClothInstitute);
        FoodInstitute f = (FoodInstitute)i.getOrganizationDirectory().createOrganization(Organization.Type.FoodInstitute);
        ShelterInstitute s = (ShelterInstitute)i.getOrganizationDirectory().createOrganization(Organization.Type.ShelterInstitute);
        
        User u = (User)boston.getEnterprisedirectory().createAndAddEnterprise("user", Enterprise.EnterpriseType.User);
        
        
        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account

        
        
        Employee employee1 = p.getEmployeeDirectory().createEmployee("police staff",w);//police
        
        Employee employee2 = u.getEmployeeDirectory().createEmployee("user", w);//user
    
        Employee employee3 = h.getEmployeeDirectory().createEmployee("doctor staff", w);
        Employee employee4 = c.getEmployeeDirectory().createEmployee("Cloth staff", w);
        Employee employee5 = f.getEmployeeDirectory().createEmployee("Food staff", w);
        Employee employee6 = s.getEmployeeDirectory().createEmployee("Shelter staff", w);
        
        
        UserAccount police = p.getUserAccountDirectory().createUserAccount("police", "1", employee1, new PoliceRole(),100);
        UserAccount user = u.getUserAccountDirectory().createUserAccount("user", "1", employee2, new UserRole(),100);
        UserAccount doctor = h.getUserAccountDirectory().createUserAccount("doctor", "1", employee3, new HospitalRole(),100);
        UserAccount cloth = c.getUserAccountDirectory().createUserAccount("cloth", "1", employee4, new ClothInstituteRole(),100);
        UserAccount food = f.getUserAccountDirectory().createUserAccount("food", "1", employee5, new FoodInstituteRole(),100);
        UserAccount shelter = s.getUserAccountDirectory().createUserAccount("shelter", "1", employee6, new ShelterInstituteRole(),100);
        */
        return system;
    }
    
}
