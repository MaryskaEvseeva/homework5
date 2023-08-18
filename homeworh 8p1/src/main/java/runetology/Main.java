package runetology;

public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Иван";
        post.passport = "5555 №656233";
        post.patronymic = "Иванович";
        post.phone = "+7 (999)-999-99-12";
        post.surname = "Смирнов";
        post.subscription = true;
        post.birthday = new FormDate();
        post.birthday.day = 13;
        post.birthday.month = 7;
        post.birthday.year = 1986;
    }
}