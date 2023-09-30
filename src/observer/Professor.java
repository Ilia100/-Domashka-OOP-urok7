package observer;


import java.util.Random;

public class Professor implements Observer {

    private static Random random = new Random();

    private String name;

    private Double minSalary;

    private VacancyType vacancyType;

    public Professor (String name,VacancyType vacancyType) {
        this.name = name;
        this.minSalary =random.nextDouble(150000, 200000);
        this.vacancyType = vacancyType;
    }

    @Override
    public void receiveOffer(String nameCompany, double salary, VacancyType vacancyType) {
        if (this.vacancyType == vacancyType) {
            if (minSalary <= salary) {
                System.out.printf("Профессор %s (%.2f, %s) >>> Мне нужна эта работа! (%s - %.2f, %s)\n",
                        name, minSalary,this.vacancyType, nameCompany, salary, vacancyType);
                minSalary = salary;
            } else {
                System.out.printf("Профессор %s (%.2f, %s) >>> Я найду работу получше! (%s - %.2f, %s)\n",
                        name, minSalary,this.vacancyType, nameCompany, salary, vacancyType);
            }
        } else {
            System.out.printf("Профессор %s (%.2f, %s) >>> Эта вакансия мне не подходит! (%s - %.2f, %s)\n",
                    name, minSalary,this.vacancyType, nameCompany, salary, vacancyType);

        }
    }
}
