package IKApp;
import java.time.LocalDate;
import java.time.Period;

public class Female extends Employee {

    public Female(String name, String surname, LocalDate birthDate) {
        super(name, surname, birthDate);
    }

    public int retiredTime(){
        int ageFemale=60;
        int currentAgeFemale= Period.between(getBirthDate(), LocalDate.now()).getYears(); //getYear neden olmuyor?
        int retiredAgeFemale= ageFemale - currentAgeFemale;
        return retiredAgeFemale;
    }
   /* @Override
    public int retiredTimeFemale() {
        return super.retiredTimeFemale();
    }*/
}
