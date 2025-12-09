public class Book extends Libraryitem{
    private String genre;
    public String getGenre(){
        return this.genre;
    }
    @Override
    public void showDetails(){
        System.out.println("Book tilte: "+ getTitle());
        System.out.println("Year of publication: "+getYear());
        System.out.println("Genre of the book: "+getGenre());
    }
}
