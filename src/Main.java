//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Анри", "Шарьер");
        Author author2 = new Author("Александр", "Пушкин");
        Book book1 = new Book("Мотылек", author1, 1968);
        Book book2 = new Book ("Евгений Онегин", author2, 1825);
        System.out.println(book1.getTitle() + " - " + book1.getAuthor().getNameAuthor() + " " + book1.getAuthor().getSurnameAuthor() + ", " + book1.getYearOfPublication());
        System.out.println(book2.getTitle() + " - " + book2.getAuthor().getNameAuthor() + " " + book2.getAuthor().getSurnameAuthor() + ", " + book2.getYearOfPublication());
        book1.setYearOfPublication(1969);
        System.out.println("Актуальный год: " + book1.getTitle() + ", " + book1.getYearOfPublication());



    }
}