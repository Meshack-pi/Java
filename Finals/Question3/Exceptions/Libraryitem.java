public class Libraryitem {
    private String title;
    private String author;
    private int year;

    //getter methods
    public int getYear(){
        return this.year;
    }
    public String getAuthor(){
        return this.author;
    }
    public String getTitle(){
        return this.title;
    }
    public void setYear(int year){
        this.year = year;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public void getDetails(){
        System.out.println("Item title: "+getTitle());
        System.out.println("Author item: "+getAuthor());
        System.out.println("Year of publication: "+getYear());
    }
}