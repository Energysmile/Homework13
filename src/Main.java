public class Main {


    public static void main(String[] args) {

        Author author1 = new Author("Сьюзен", "Коллинз");
        Author author2 = new Author("Мэри", "Шелли");
        Book book1 = new Book("Голодные игры", author1, 2008);
        Book book2 = new Book("Франкенштейн", author2, 1818);
        Book book3 = new Book("Франкенштейн", author2, 1818);

        //изменение года публикации
        book1.setPublicationYear(1999);


        System.out.println("Название книги: " + book1.getTitle() + "\nАвтор книги: " + book1.getAuthor().getFirstName() + " " + book1.getAuthor().getLastName() + "\nГод публикации: " + book1.getPublicationYear());
        System.out.println();
        System.out.println("Название книги: " + book2.getTitle() + "\nАвтор книги: " + book2.getAuthor().getFirstName() + " " + book2.getAuthor().getLastName() + "\nГод публикации: " + book2.getPublicationYear());

        //метод toString
        System.out.println();
        System.out.println(book1);
        System.out.println();
        System.out.println(book2);
        System.out.println();
        System.out.println(book3);

        //метод equals
        System.out.println();
        System.out.println(book2.equals(book1));
        System.out.println(book2.equals(book3));
        System.out.println(book1.equals(book3));
    }
}