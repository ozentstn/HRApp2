package IKApp;

import java.time.LocalDate;
import java.time.Period;

public class Male extends Employee{

    public Male(String name, String surname, LocalDate birthDate) {
        super(name, surname, birthDate);
    }
    public int retiredTime(){
        int ageMale=65;
        int currentAgeMale= Period.between(getBirthDate(), LocalDate.now()).getYears();
        int retiredAgeMale= ageMale - currentAgeMale;
        return retiredAgeMale;
    }
   /* @Override
    public int retiredTimeMale() {
        return super.retiredTimeMale();
    }*/
}
