/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.MapsData;

/**
 *
 * @author liulei
 */
public class ReportWorkRequest extends WorkRequest{
    private String firstname;
    private String lastname;
    private int age;
    private String gender;
    private String height;
    private String race;
    private String condition;
    private int facenumber;
    private String result;
    private boolean policepass;
    private boolean hospitalpass;
    private boolean clothes;
    private boolean food;
    private boolean shelter;
    private String foodname;
    private String clothname;
    private int foodquantity;
    private int clothquantity;
    private int shelterquantity;
    private MapsData mapsdata;
    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public int getFacenumber() {
        return facenumber;
    }

    public void setFacenumber(int facenumber) {
        this.facenumber = facenumber;
    }

    public boolean isPolicepass() {
        return policepass;
    }

    public void setPolicepass(boolean policepass) {
        this.policepass = policepass;
    }

    public boolean isHospitalpass() {
        return hospitalpass;
    }

    public void setHospitalpass(boolean hospitalpass) {
        this.hospitalpass = hospitalpass;
    }

    public boolean isClothes() {
        return clothes;
    }

    public void setClothes(boolean clothes) {
        this.clothes = clothes;
    }

    public boolean isFood() {
        return food;
    }

    public void setFood(boolean food) {
        this.food = food;
    }

    public boolean isShelter() {
        return shelter;
    }

    public void setShelter(boolean shelter) {
        this.shelter = shelter;
    }

    public String getFoodname() {
        return foodname;
    }

    public void setFoodname(String foodname) {
        this.foodname = foodname;
    }

    public String getClothname() {
        return clothname;
    }

    public void setClothname(String clothname) {
        this.clothname = clothname;
    }

    public int getFoodquantity() {
        return foodquantity;
    }

    public void setFoodquantity(int foodquantity) {
        this.foodquantity = foodquantity;
    }

    public int getClothquantity() {
        return clothquantity;
    }

    public void setClothquantity(int clothquantity) {
        this.clothquantity = clothquantity;
    }

    public int getShelterquantity() {
        return shelterquantity;
    }

    public void setShelterquantity(int shelterquantity) {
        this.shelterquantity = shelterquantity;
    }

    public MapsData getMapsdata() {
        return mapsdata;
    }

    public void setMapsdata(MapsData mapsdata) {
        this.mapsdata = mapsdata;
    }
    
    

    public String toString(){
        return firstname+lastname;
    }
    
}
