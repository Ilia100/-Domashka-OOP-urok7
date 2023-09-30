package observer;

import java.util.Random;

public class Student implements Observer {

    private static Random random = new Random();

    private String name;

    private double minSalary;

    private VacancyType vacancyType;

    public Student(String name, VacancyType vacancyType) {
        this.name = name;
        minSalary = random.nextDouble(2000, 3000);
        this.vacancyType = vacancyType;
    }

    @Override
    public void receiveOffer(String nameCompany, double salary, VacancyType vacancyType) {
        if (this.vacancyType == vacancyType) {
            if (minSalary <= salary) {
                System.out.printf("Студент %s (%.2f, %s) >>> Мне нужна эта работа! (%s - %.2f, %s)\n",
                        name, minSalary,this.vacancyType, nameCompany, salary, vacancyType);
                minSalary = salary;
            } else {
                System.out.printf("Студент %s (%.2f, %s) >>> Я найду работу получше! (%s - %.2f, %s)\n",
                        name, minSalary,this.vacancyType, nameCompany, salary, vacancyType);

            }
        } else {
            System.out.printf("Студент %s (%.2f, %s) >>> Эта вакансия мне не подходит! (%s - %.2f, %s)\n",
                    name, minSalary,this.vacancyType, nameCompany, salary, vacancyType);

        }
    }
}
