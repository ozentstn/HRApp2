package IKApp;

import java.util.List;

//takım lideri, personel listesi ve atanmış iş listesi içeren bir sınıf
public class Departman {
   private String takimLideri;
   private List<String> personelList;
   private List<String> jobList;

    public Departman(String takimLideri, List<String> personelList, List<String> jobList) {
        this.takimLideri = takimLideri;
        this.personelList = personelList;
        this.jobList = jobList;
    }

    public List<String> getJobList() {
        return jobList;
    }

    public void setJobList(List<String> jobList) {
        this.jobList = jobList;
    }

    public List<String> getPersonelList() {
        return personelList;
    }

    public void setPersonelList(List<String> personelList) {
        this.personelList = personelList;
    }

    public String getTakimLideri() {
        return takimLideri;
    }

    public void setTakimLideri(String takimLideri) {
        this.takimLideri = takimLideri;
    }
}
