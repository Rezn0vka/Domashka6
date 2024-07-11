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

//Метод save удален из класса User. Теперь класс User отвечает только за данные пользователя. Это также следует принципу SRP.
