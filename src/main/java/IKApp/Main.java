package IKApp;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        //Department department= new Department("X","B","")    jobList???????????????
        Employee teamLead= new Female("X","Y", LocalDate.of(1997,1,20));
        Department department=new Department(teamLead,"Meva");

        Employee p1=new Male("A","B",LocalDate.of(1970,9,19));
        Employee p2=new Female("F","N",LocalDate.of(1989,5,20));
        Employee p3=new Male("L","N",LocalDate.of(1999,6,20));
        department.addEmployee(p1);
        department.addEmployee(p2);
        department.addEmployee(p3);

        department.addJob("OKC frontendinin yazılması");
        department.addJob("OKC backendinin yazılması");
        department.addJob("Meva değer analizi ekranının yazılması");

        System.out.println();
        System.out.println(department.getDepartmentName()+" biriminde çalışan;\n"
                            +p1.getName()+" "+ p1.getSurname()+" isimli personelin emekli olmasına kalan süre " + p1.retiredTime() + "\n"
                            + p2.getName()+" "+p2.getSurname()+" isimli personelin emekli olmasına kalan süre " +p2.retiredTime() +"\n"
                            + p3.getName()+" "+p3.getSurname()+" isimli personelin emekli olmasına kalan süre " +p3.retiredTime()+"'dir.");

    }
}

