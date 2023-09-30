package observer;

import java.util.Random;

public class WebDeveloper implements Vacancy{
    private static Random random = new Random();




    @Override
    public void openedVacancy(Company company) {
        double salary = random.nextDouble(2500, company.getMaxSalary());
        company.getJobAgency().sendOffer(company.getNameCompany(), salary,VacancyType.WEBDEVELOPER);

    }
}
