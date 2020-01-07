/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Hospital.Ward;
import Business.Hospital.WardDirectory;
import Business.Inventory.ClothInventory;
import Business.Inventory.FoodInventory;
import Business.Inventory.InventoryDirectory;
import Business.Inventory.ShelterInventory;
import Business.Organization.Organization.Type;
import Business.Police.Criminal;
import Business.Police.CriminalDirectory;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(String name,Type type){
        Organization organization = null;
        if (type.getValue().equals(Type.Police.getValue())){
            Police police = new Police();
            String csvFile = "criminalList.csv";
            BufferedReader br = null;
            String line = "";
            String cvsSplitBy = ",";
            CriminalDirectory criminalDirectory = new CriminalDirectory();
            try {

                br = new BufferedReader(new FileReader(csvFile));
                while ((line = br.readLine()) != null) {
                    String[] criminalElement = line.split(cvsSplitBy);
                    Criminal criminal = criminalDirectory.addCriminal();
                    String criminaname = criminalElement[0];
                    int number = Integer.parseInt(criminalElement[1]);
                    criminal.setName(criminaname);
                    criminal.setNumber(number);
                }


            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if (br != null) {
                    try {
                        br.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
            police.setName(name);
            police.setCriminalDirectory(criminalDirectory);
            organizationList.add(police);
        }
        else if (type.getValue().equals(Type.Hospital.getValue())){
            Hospital hospital = new Hospital();
            hospital.setName(name);            
            WardDirectory wardDirectory = new WardDirectory();
            Ward ward1 = new Ward();
        Ward ward2 = new Ward();
        Ward ward3 = new Ward();
        Ward ward4 = new Ward();
        ward1.setWardNumber("B201");
        ward2.setWardNumber("B202");
        ward3.setWardNumber("A203");
        ward4.setWardNumber("A204");
        wardDirectory.addWard(ward1);
        wardDirectory.addWard(ward2);
        wardDirectory.addWard(ward3);
        wardDirectory.addWard(ward4);
        hospital.setWardDirectory(wardDirectory);        
            organizationList.add(hospital);
        }
        else if (type.getValue().equals(Type.School.getValue())){
            organization = new School();
            organization.setName(name);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.FoodInstitute.getValue())){
            FoodInstitute foodinstitute = new FoodInstitute();
            foodinstitute.setName(name);
            InventoryDirectory id = new InventoryDirectory();
            FoodInventory fi1 = new FoodInventory();
            FoodInventory fi2 = new FoodInventory();
            FoodInventory fi3 = new FoodInventory();
            fi1.setName("Egg");
            fi1.setInventory(50);
            fi1.setTargetAge("All");
            fi2.setName("Bread");
            fi2.setInventory(50);
            fi2.setTargetAge("18-50");
            fi3.setName("Water");
            fi3.setInventory(50);
            fi3.setTargetAge("All");
            id.addInventory(fi1);
            id.addInventory(fi2);
            id.addInventory(fi3);
            foodinstitute.setInventoryDirectory(id);
            organizationList.add(foodinstitute);
        }
        else if (type.getValue().equals(Type.ClothInstitute.getValue())){
            ClothInstitute clothinstitute = new ClothInstitute();
            clothinstitute.setName(name);
            InventoryDirectory id = new InventoryDirectory();
            ClothInventory ci1 = new ClothInventory();
            ClothInventory ci2 = new ClothInventory();
            ClothInventory ci3 = new ClothInventory();
            ClothInventory ci4 = new ClothInventory();
            ClothInventory ci5 = new ClothInventory();
            ClothInventory ci6 = new ClothInventory();
            ci1.setName("Boy Clothes");
            ci1.setInventory(50);
            ci1.setTargetAge("Below 18");
            ci1.setTargetGender("male");
            ci2.setName("Male Clothes");
            ci2.setInventory(50);
            ci2.setTargetAge("18-50");
            ci2.setTargetGender("male");
            ci3.setName("Aged-male Clothes");
            ci3.setInventory(50);
            ci3.setTargetAge("Above 50");
            ci3.setTargetGender("male");
            ci4.setName("Girl Clothes");
            ci4.setInventory(50);
            ci4.setTargetAge("Below 18");
            ci4.setTargetGender("female");
            ci5.setName("Female Clothes");
            ci5.setInventory(50);
            ci5.setTargetAge("18-50");
            ci5.setTargetGender("female");
            ci6.setName("Aged-female Clothes");
            ci6.setInventory(50);
            ci6.setTargetAge("Above 50");
            ci6.setTargetGender("female");
            id.addInventory(ci1);
            id.addInventory(ci2);
            id.addInventory(ci3);
            id.addInventory(ci4);
            id.addInventory(ci5);
            id.addInventory(ci6);
            clothinstitute.setInventoryDirectory(id);
            organizationList.add(clothinstitute);
        }
        else if (type.getValue().equals(Type.ShelterInstitute.getValue())){
            ShelterInstitute shelterinstitute = new ShelterInstitute();
            shelterinstitute.setName(name);
            InventoryDirectory id = new InventoryDirectory();
            ShelterInventory si1 = new ShelterInventory();
            ShelterInventory si2 = new ShelterInventory();
            si1.setName("Male Shelter");
            si1.setInventory(20);
            si1.setTargetGender("Male");
            si2.setName("Female Shelter");
            si2.setInventory(20);
            si2.setTargetGender("Female");
            id.addInventory(si1);
            id.addInventory(si2);
            shelterinstitute.setInventoryDirectory(id);
            organizationList.add(shelterinstitute);
        }
        else if (type.getValue().equals(Type.User.getValue())){
            organization = new UserOrganization();
            organization.setName(name);
            organizationList.add(organization);
        }
        return organization;
    }
}