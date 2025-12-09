public class DVD extends Libraryitem{
    private int minutes; //duration in minutes
    public int getMinutes(){
        return this.minutes;
    }
    @Override
    public void getDetails(){
        System.out.println("Author: "+getAuthor());
        System.out.println("DVD title: "+getTitle());
        System.out.println("Year of publication: "+getYear());
        System.out.println("DVD duration in minutes: "+getMinutes());
    }

}
