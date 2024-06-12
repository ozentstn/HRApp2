package IKApp;

import java.util.List;

//takım lideri, personel listesi ve atanmış iş listesi içeren bir sınıf
public class Departman {
   private String teamLead;
   private List<String> employeeList;
   private List<String> jobList;
   private String departmentName;

    public Departman(String teamLead, List<String> employeeList, List<String> jobList,String departmentName) {
        this.teamLead = teamLead;
        this.employeeList = employeeList;
        this.jobList = jobList;
        this.departmentName=departmentName;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getTeamLead() {
        return teamLead;
    }

    public void setTeamLead(String teamLead) {
        this.teamLead = teamLead;
    }

    public List<String> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<String> employeeList) {
        this.employeeList = employeeList;
    }

    public List<String> getJobList() {
        return jobList;
    }

    public void setJobList(List<String> jobList) {
        this.jobList = jobList;
    }

    public void addEmployee(String string){
        this.employeeList.add(string);
    }

    public void deleteEmployee(String string) {
        this.employeeList.remove(string);
    }

    public void changeEmployee(String oldEmployee, String newEmployee) {
        int i = this.employeeList.indexOf(oldEmployee);
        if (i != -1) {
            this.employeeList.set(i, newEmployee);
        }
    }

    public void addJob(String job){
        this.jobList.add(job);
    }
    public void deleteJob(String job){
        this.jobList.remove(job);
    }

    public  String DepartmanList() {
        String dpList= (
                "Takim Lideri:" + teamLead +
                ", Personel Listesi: " + employeeList +
                ", İş Listesi: " + jobList+
                ", Departman adı: " + departmentName);
        return dpList;
    }

}
