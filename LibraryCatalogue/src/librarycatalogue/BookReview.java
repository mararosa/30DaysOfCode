/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarycatalogue;

/**
 *
 * @author mararosa
 */
public class BookReview {
    
    private String title;
    private String author;
    private int pageCount;
    private int ISBN;
    private boolean isCheckOut;
    private int dayCheckout = -1;

    public BookReview(String title, String author, int pageCount, int ISBN) {
        this.title = title;
        this.author = author;
        this.pageCount = pageCount;
        this.ISBN = ISBN;
        isCheckOut = false;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPageCount() {
        return pageCount;
    }

    public int getISBN() {
        return ISBN;
    }

    public boolean getIsCheckOut() {
        return isCheckOut;
    }

    public int getDayCheckOut() {
        return dayCheckout;
    }

    public void setIsCheckOut(boolean isCheckout, int currentDayCheckout) {
        this.isCheckOut = isCheckout;
        setDayCheckout(currentDayCheckout);
    }
    
    private void setDayCheckout(int day) {
        this.dayCheckout = day;
    }
    
    
    
    
    
}
