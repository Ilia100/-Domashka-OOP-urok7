package observer;

import java.util.Random;

public class Company {

    private static Random random = new Random();
    private String nameCompany;
    private  double maxSalary;

    private Publisher jobAgency;

    public Company(String nameCompany, double maxSalary, Publisher jobAgency) {
        this.nameCompany = nameCompany;
        this.maxSalary = maxSalary;
        this.jobAgency = jobAgency;
    }

    public double getMaxSalary() {
        return maxSalary;
    }

    public String getNameCompany() {
        return nameCompany;
    }

    public Publisher getJobAgency() {
        return jobAgency;
    }
    //    public void needEmployee(Vacancy vacancy){
//        vacancy(nameCompany, maxSalary);

//    }

}
