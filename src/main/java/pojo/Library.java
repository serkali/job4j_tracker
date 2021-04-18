package pojo;

public class Library {
    public static void main(String[] args) {
        Book book = new Book("Metro", 500);
        Book book1 = new Book("Java", 800);
        Book book2 = new Book("Clean code", 300);
        Book book3 = new Book("Pulp Art", 600);
        Book[] books = new Book[4];
        books[0] = book;
        books[1] = book1;
        books[2] = book2;
        books[3] = book3;
        for (int i = 0; i < books.length; i++) {
            Book bookarray = books[i];
            System.out.println(bookarray.getName() + " - " + bookarray.getNumberOfPages());
        }
        System.out.println("Rearranged books with index 0 and 3");
        Book tmp = books[0];
        books[0] = books[3];
        books[3] = tmp;
        for (int i = 0; i < books.length; i++) {
            Book bk = books[i];
            System.out.println(bk.getName() + " - " + bk.getNumberOfPages());
        }
        System.out.println("Display books with the name \"Clean code\"");
        for (int i = 0; i < books.length; i++) {
            Book buka = books[i];
            if (buka.getName().equals("Clean code")) {
                System.out.println(buka.getName() + " - " + buka.getNumberOfPages());
            }
        }
    }
}
