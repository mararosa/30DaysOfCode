package librarycatalogue;

/**
 *
 * @author mararosa
 */
public class Book {

    // Properties, Fields, Global Variables
    String title;
    int pageCount;
    int ISBN;
    boolean isCheckedOut;
    int dayCheckedOut = -1;

    // Constructor
    public Book(String bookTile, int bookPageCount, int bookISBN) {
        this.title = bookTile;
        this.pageCount = bookPageCount;
        this.ISBN = bookISBN;
        isCheckedOut = false;
    }

    // Getters -->  INSTANCE METHODS 
    public String getTitle() {
        return this.title;
    }
    
    public int getPageCount() {
        return this.pageCount;
    }
    
    public int getISBN() {
        return this.ISBN;
    }
    
    public Boolean getIsCheckedOut() {
        return this.isCheckedOut;
    }
    
     public int getDayCheckedOut() {
         return this.dayCheckedOut;
    }
     
     // Setters
     public void setIsCheckedOut(boolean newisCheckedOut, int currentCheckedOut) {
         this.isCheckedOut = newisCheckedOut;
         setDayCheckedOut(currentCheckedOut);  
     }
     
     private void setDayCheckedOut(int day) {
         this.dayCheckedOut = day;
     }

}
