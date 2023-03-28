package homework12;

public class Main {

    public static void main (String[] args) {
        Author Pushkin = new Author("Александр", "Пушкин");
        Author Rowling = new Author("Joanne", "Rowling");
        Book queenOfSpades = new Book("Пиковая дама", Pushkin, 1834);
        Book harryPotter = new Book("Harry Potter and the Goblet of Fire", Rowling, 2000);
        System.out.println(Pushkin);
        System.out.println(queenOfSpades);
        System.out.println(harryPotter.getPublicationYear());
        harryPotter.setPublicationYear(2001);
        System.out.println(harryPotter.getPublicationYear());
    }



}
