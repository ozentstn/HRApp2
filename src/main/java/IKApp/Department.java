package IKApp;

import java.util.ArrayList;
import java.util.List;

//takım lideri, personel listesi ve atanmış iş listesi içeren bir sınıf
public class Department {
   private Employee teamLead;  //List<Employee> teamLead;
    private String departmentName;
   private List<Employee> employeeList;
   private List<String> jobList;

    public Department(Employee teamLead, String departmentName) { //List<Employee> employeeList, List<String> jobList
        this.teamLead = teamLead;
        this.departmentName=departmentName;
        this.employeeList = new ArrayList<>();
        this.jobList = new ArrayList<>();
    }

    //region [Getter Setter]
    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Employee getTeamLead() {
        return teamLead;
    }

    public void setTeamLead(Employee teamLead) {
        this.teamLead = teamLead;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    public List<String> getJobList() {
        return jobList;
    }

    public void setJobList(List<String> jobList) {
        this.jobList = jobList;
    }
//endregion

    public void addEmployee(Employee employee){
        this.employeeList.add(employee);
    }

    public void deleteEmployee(Employee employee) {
        this.employeeList.remove(employee);
    }

    public void changeEmployee(Employee oldEmployee, Employee newEmployee) {
        int i = this.employeeList.indexOf(oldEmployee);
        if (i != -1) {
            this.employeeList.set(i, newEmployee);
        }
    }

   /* public void changeTeamLead(Employee oldTeamLead, Employee newTeamLead){
        int x=this.teamLead.indexOf(oldTeamLead);
        if(x != -1){
            this.teamLead.set(x,newTeamLead);
        }

    }*/

    public void addJob(String job){

        this.jobList.add(job);
    }
    public void deleteJob(String job){
       // int i=this.jobList.indexOf(job);
        this.jobList.remove(job);
        System.out.println("İş tamamlandı ve silindi.");
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
