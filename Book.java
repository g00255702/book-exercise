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
    private int pages;
    private String refNumber;
    private int borrowed;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle,int bookPages, boolean bookCoursetext)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
        refNumber = "";
    }

    // Add the methods here ...
 
    public String getAuthor()
    {
        return author;
    }
    
    public String getTitle()
    {
        return title;
    }
    
    public void printAuthor()
    {
        System.out.println(author);
    }
    
    public void printTitle()
    {
        System.out.println(title);
    }
    
    public int getPages()
    {
        return pages;
    }
    
    public void printDetails()
    {
        if(refNumber == "")
        {
            refNumber = "ZZZ";
        }
        else{
        
        System.out.print("\n" + "Title: " + title + "\n" + "Author: " + author + "\n" + "Pages: " + pages + "\n" + "Ref Number: " + refNumber
        + "\n" + "Books borrowed: " + borrowed + "\n");
    }
    }
    
    public void setRefNumber(String ref)
    {
        if(ref.length() < 3)
        {
            System.out.println("Invalid must be atleast 3 characters");
        }
        else
        {
            refNumber = ref;
        }
    }
    
    public String getRefNumber()
    {
        return refNumber;
    }
    
    public void setBorrowed(int borrow)
    {
        borrowed += borrow;
    }
    
    public int getBorrowed()
    {
        return borrowed;
    }
    
    
    
}
