/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author (Emeka Okonkwo)
 * @version (9/20/2017)
 */
class Book
{
    // The fields.
    private String author;
    private String title;
    
    //Exercise 2.85
    private int pages;
    
    //Exercise 2.88
    private String refNumber;
    
    //Exercise 2.91
    private int borrowed;
    
    //Exercise 2.92
    private int courseText;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle,int bookPages, int bookCoursetext)
    {
        author = bookAuthor;
        title = bookTitle;
        
        //Exercise 2.85
        pages = bookPages;
        
        //Exercise 2.88
        refNumber = "";
        
        //Exercise 2.92
        courseText = bookCoursetext;
        
       
    }

    // Add the methods here ...
    
    //Exercise 2.83
    public String getAuthor()
    {
        return author;
    }
    
    public String getTitle()
    {
        return title;
    }
    
    //Exercise 2.84
    public void printAuthor()
    {
        System.out.println(author);
    }
    
    public void printTitle()
    {
        System.out.println(title);
    }
    
    //Exercise 2.85
    public int getPages()
    {
        return pages;
    }
    
    //Exercise 2.87
    /*
    public void printDetails()
    {
        System.out.println("Title: " + title + ", " + "Author: " + author + ", " + "Pages: " + pages);
    }
    
    
    //Exercise 2.89
    public void printDetails()
    {
        if(refNumber == "")
        {
            refNumber = "ZZZ";
        }
        else{
        
        System.out.println("Title: " + title + ", " + "Author: " + author + ", " + "Pages: " + pages + ", " + "Ref Number: " + refNumber);
    }
    }
    */
    //Exercise 2.91
    public void printDetails()
    {
        if(refNumber == "")
        {
            refNumber = "ZZZ";
        }
        else{
        
        System.out.println("Title: " + title + ", " + "Author: " + author + ", " + "Pages: " + pages + ", " + "Ref Number: " + refNumber
        + ", " + "Books borrowed: " + borrowed);
    }
    }
    //Exercise 2.88
    /*
    public void setRefNumber(String ref)
    {
        refNumber = ref;
    }
    */
    
    //Exercise 2.90
    public void setRefNumber(String ref)
    {
        refNumber = ref;
    }
    
    public String getRefNumber()
    {
        return refNumber;
    }
    
    //Exercise 2.91
    public void setBorrowed(int borrow)
    {
        borrowed += borrow;
    }
    
    public int getBorrowed()
    {
        return borrowed;
    }
    
    public int getisCourseText()
    {
        return courseText;
    }
    
}
