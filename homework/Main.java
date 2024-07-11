package homework;

public class Main {
    public static void main(String[] args) {
        User user = new User("Bob");
        Reporter reporter = new Reporter();
        Persister persister = new Persister(user);

        reporter.report(user);
        persister.save();
    }
}

//Мы создаем объекты Reporter и Persister в классе Main, а не внутри User. Это улучшает Single Responsibility Principle (SRP), так как каждый класс выполняет только одну обязанность. Теперь User не отвечает за сохранение и отчет.
