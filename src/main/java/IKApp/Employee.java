package IKApp;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

//sınıfta da ad, soyad, doğum tarihi alanlarına sahip olmalı.
 abstract class Employee {
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
    public abstract int retiredTime();

}
