package homework;

public class Persister {
    private final User user;

    public Persister(User user) {
        this.user = user;
    }

    public void save() {
        System.out.println("Save user: " + user.getName());
    }
}

//Класс Persister остается без изменений, так как он уже выполняет свою единственную обязанность — сохранение данных пользователя.
