/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarycatalogue;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author mararosa
 */
public class LibraryCatalogueReview {

    Map<String, BookReview> bookColection = new HashMap<String, BookReview>();
    int currentDay = 0;
    int lengthOfCheckOutPeriod = 7;
    double initialLateFee = 0.50;
    double feePerLateDay = 1.00;

    public LibraryCatalogueReview(Map<String, BookReview> collection) {
        this.bookColection = collection;
    }

    public LibraryCatalogueReview(Map<String, BookReview> collection, int lengthOfCheckOutPeriod, double initialLateFee, double feePerLateDay) {
        this.bookColection = collection;
        this.lengthOfCheckOutPeriod = lengthOfCheckOutPeriod;
        this.initialLateFee = initialLateFee;
        this.feePerLateDay = feePerLateDay;
    }

    public Map<String, BookReview> getBookColection() {
        return bookColection;
    }

    public BookReview getBook(String title) {
        return getBookColection().get(title);
    }

    public int getCurrentDay() {
        return currentDay;
    }

    public int getLengthOfCheckOutPeriod() {
        return lengthOfCheckOutPeriod;
    }

    public double getInitialLateFee() {
        return initialLateFee;
    }

    public double getFeePerLateDay() {
        return feePerLateDay;
    }

    public void setCurrentDay(int currentDay) {
        this.currentDay = currentDay;
    }

    public void counterDays(int day) {
        currentDay++;
    }

    public void checkOutBook(String title) {
        BookReview bookReview = getBook(title);
        if (bookReview.getIsCheckOut()) {
            sorryBookAlreadyCheckedOut(bookReview);
        } else {
            bookReview.setIsCheckOut(true, currentDay);
            System.out.println("You just checked out " + title + ". It is due on day "
                    + (getCurrentDay() + getLengthOfCheckOutPeriod()) + ".");
        }
    }

    public void returnBook(String title) {
        BookReview bookReview = getBook(title);
        int daysLate = currentDay - (bookReview.getDayCheckOut() + getLengthOfCheckOutPeriod());
        if (daysLate > 0) {
            System.out.println("You own the library $" + (getInitialLateFee() + daysLate * getFeePerLateDay())
                    + " because your book is " + daysLate + " days overdue");
        } else {
            System.out.println("Book Returned. Thank you!");
        }
        bookReview.setIsCheckOut(false, -1);
    }

    private void sorryBookAlreadyCheckedOut(BookReview bookReview) {
        System.out.println("Sorry, " + bookReview.getTitle() + " is already checked out. "
                + "It should be back on day " + (bookReview.getDayCheckOut() + getLengthOfCheckOutPeriod()) + ".");
    }

    public static void main(String[] args) {
        BookReview becoming = new BookReview("Becoming", "Michelle Obama", 500, 11111);
        BookReview farewell = new BookReview("Farewell Speeches", "Michelle Obama", 300, 22222);
        Map<String, BookReview> collection = new HashMap<String, BookReview>();
        collection.put("Becoming", becoming);
        collection.put("Farewell Speeches", farewell);
        LibraryCatalogueReview lib = new LibraryCatalogueReview(collection);
        lib.checkOutBook("Becoming");
    }
}
