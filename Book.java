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

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle,int bookPages, boolean bookCoursetext)
    {
        author = bookAuthor;
        title = bookTitle;
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
    
}
