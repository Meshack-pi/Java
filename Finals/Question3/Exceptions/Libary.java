public class Libary {
    public static void main(String[] args) {
        Libraryitem book = new Book();
        Libraryitem magazine = new Magazine();
        Libraryitem dvd = new DVD();
        //example of setting details
        book.setAuthor("Meshack");
        magazine.setAuthor("Donal");
        dvd.setTitle("Jackie Chan");
        dvd.getDetails();
        magazine.getDetails();
        book.getDetails();

    }    
}
