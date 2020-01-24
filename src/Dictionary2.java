// a dictionary which is a child of a book
public class Dictionary2 extends Book2
{
    private int definitions;
    //sets up dictionary with a call to super class book2

    public Dictionary2(int pages, int definitions)
    {
        super(pages);
        this.definitions = definitions;
    }
    //prints local and inherited variables
    public void definitionMessage()
    {
        System.out.println("NUmber of Definitions: " + definitions);
        System.out.println("Definitions per page: " + definitions/pages);
    }//end of print out method
}//end of dictionary2 class
