//represents a book as a parent class
public class Book2
{
    public int pages;
    //sets up a set number of pages for a book

    public Book2(int pages)
    {
        this.pages = pages;
    }// end of method

    public void pageMessage()
    {
        System.out.println("Number of Pages: " + pages);
    }//end of out put method
}//end of book2 class
