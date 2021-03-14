package librarycatalogue;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author mararosa
 */
public class LibraryCatalogue {

    // Properties/Fields/Global Variables
    Map<String, Book> bookColection = new HashMap<String, Book>();
    int currentDay = 0;
    int lengthOfCheckOutPeriod = 7;
    double initialLateFee = 0.50;
    double feePerLateDay = 1.00;

    // Constructors
    public LibraryCatalogue(Map<String, Book> collection) {
        this.bookColection = collection;
    }

    public LibraryCatalogue(Map<String, Book> collection, int lengthOfCheckoutPeriod, double initialLateFee, double feePerLateDay) {
        this.bookColection = collection;
        this.lengthOfCheckOutPeriod = lengthOfCheckoutPeriod;
        this.initialLateFee = initialLateFee;
        this.feePerLateDay = feePerLateDay;
    }

    // Getters
    public Map<String, Book> getBookColection() {
        return this.bookColection;
    }

    public Book getBook(String bookTitle) {
        return getBookColection().get(bookTitle);
    }

    public int getCurrentDay() {
        return this.currentDay;
    }

    public int getLengthOfCheckoutPeriod() {
        return this.lengthOfCheckOutPeriod;
    }

    public double getInitialLateFee() {
        return this.initialLateFee;
    }

    public double getFeePerLateDay() {
        return this.feePerLateDay;
    }

    // Setters
    public void setCurrentDay(int day) {
        currentDay = day;
    }
    
        public void nextDay() {
        currentDay++;
    }

    // INSTANCE METHODS
    public void checkOutBook(String title) {
        Book book = getBook(title);
        if (book.getIsCheckedOut()) {
            sorryBookAlreadyCheckedOut(book);
        } else {
            book.setIsCheckedOut(true, currentDay);
            System.out.println("You just checked out " + title + ". It is due on day " + (getCurrentDay() + getLengthOfCheckoutPeriod() + "."));
        }
    }

    public void returnBook(String title) {
        Book book = getBook(title);
        int daysLate = currentDay - (book.getDayCheckedOut() + getLengthOfCheckoutPeriod());
        if (daysLate > 0) {
            System.out.println("You owe the library $" + (getInitialLateFee() + daysLate * getFeePerLateDay()) + 
                    " because your book is " + daysLate + " days overdue.");
        } else {
            System.out.println("Book Returned. Thank you");
        }
        book.setIsCheckedOut(false, -1);
    }

    public void sorryBookAlreadyCheckedOut(Book book) {
        System.out.println("Sorry, " + book.getTitle() + " is already checked out. "
                + "It should be back on day " + (book.getDayCheckedOut() +
                        getLengthOfCheckoutPeriod()) + ".");

    }

    public static void main(String[] args) {
        // TODO code application logic here
        Map<String, Book> bookCollection = new HashMap<String, Book>();
        Book harry = new Book("Harry Potter", 12450, 111111);
        bookCollection.put("Harry Potter", harry);
        LibraryCatalogue lib = new LibraryCatalogue(bookCollection);
        lib.checkOutBook("Harry Potter");
        lib.nextDay();
        lib.nextDay();
        lib.checkOutBook("Harry Potter");
        lib.setCurrentDay(17);
        lib.returnBook("Harry Potter");
        lib.checkOutBook("Harry Potter");  
    }

}
