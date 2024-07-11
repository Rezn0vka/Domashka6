package homework;

public class Reporter {
    public void report(User user) {
        System.out.println("Report for user: " + user.getName());
    }
}

//Создан новый класс Reporter, который отвечает за отчет. Это позволяет нам отделить функциональность отчета от данных пользователя, улучшая SRP.
