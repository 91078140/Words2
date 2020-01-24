//Timothy Wilks
//demonstrates the use of super reference
public class Word2
{
    //instantiates a driver class and invokes its inherited/local methods
    public static void main(String[] args)
    {
        Dictionary2 webster = new Dictionary2(1500, 52500);
        webster.pageMessage();
        webster.definitionMessage();
    }//end of main method
}//end of word class
