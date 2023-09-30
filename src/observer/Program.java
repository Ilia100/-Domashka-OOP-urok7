package observer;

public class Program {


    /**
     * TODO: 1.Доработать приложение, поработать с шаблоном проектирования Observer
     *   добавить новый тип соискателя.
     *  2. Добавить новую сущность "Вакансия", компания должна рассылать вакансии.
     *  3. Только после этого вы можете усложнить ваше приложение (при желании),
     *  например, добавить тип вакансии (enum), учитывать тип вакансии при отправке предложения соискателю.
     * @param args
     */
    public static void main(String[] args) {

        JobAgency jobAgency = new JobAgency();
        ProductManager productManager = new ProductManager();
        WebDeveloper webDeveloper = new WebDeveloper();



        Company geekBrains = new Company("GeekBrains", 70000, jobAgency);
        Company google = new Company("Google", 100000, jobAgency);
        Company yandex = new Company("Yandex", 120000, jobAgency);

        Master ivanov = new Master("Ivanov",VacancyType.PRODUCTMANAGER);
        Master petrov = new Master("Petrov", VacancyType.WEBDEVELOPER);
        Student sidorov = new Student("Sidorov", VacancyType.WEBDEVELOPER);
        Professor filatov = new Professor("Filatov", VacancyType.PRODUCTMANAGER);

        jobAgency.registerObserver(ivanov);
        jobAgency.registerObserver(petrov);
        jobAgency.registerObserver(sidorov);
        jobAgency.registerObserver(filatov);

        for (int i = 0; i < 2; i++){
            productManager.openedVacancy(geekBrains);
//            webDeveloper.openedVacancy(geekBrains);
//            productManager.openedVacancy(google);
            webDeveloper.openedVacancy(google);
//            productManager.openedVacancy(yandex);
            webDeveloper.openedVacancy(yandex);

        }

    }

}
