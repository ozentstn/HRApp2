package IKApp;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

//sınıfta da ad, soyad, doğum tarihi alanlarına sahip olmalı.
public class Employee {
    private String name;
    private String surname;
    private LocalDate birthDate;

    public Employee(String name, String surname, LocalDate birthDate) {
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String EmployeeList() {
        String epList=("Personelin adı: " + name +
                ", soyadı: '" + surname +
                "ve doğum tarihi: " + birthDate
                );
        return epList;
    }

    //erkek ve kadın için emekli olma zamanını hesaplama
    public int retiredTimeMale(){
        int ageMale=65;
        int currentAgeMale= Period.between(getBirthDate(), LocalDate.now()).getYears(); //getYear neden olmuyor?
        int retiredAgeMale= ageMale - currentAgeMale;
        return retiredAgeMale;
    }
    public int retiredTimeFemale(){
        int ageFemale=60;
        int currentAgeFemale= Period.between(getBirthDate(), LocalDate.now()).getYears(); //getYear neden olmuyor?
        int retiredAgeFemale= ageFemale - currentAgeFemale;
        return retiredAgeFemale;
    }
}
