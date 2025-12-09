public class Magazine extends Libraryitem{
    private String issue;
    public String getIssue(){
        return this.issue;
    }
    @Override
    public void getDetails(){
        System.out.println("Magazine title: "+getTitle());
        System.out.println("Year of publication: "+getYear());
        System.out.println("Author of magazine: "+getAuthor());
        System.out.println("Get the issue: "+getIssue());
    }
}