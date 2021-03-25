
package calendarpractice;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

//import java.util.*;

public class CalendarPractice {

    public static void main(String[] args) {
        // TODO code application logic here
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DATE, 0);
        System.out.println(calendar.getTime());
        calendar.add(Calendar.DATE, 31);
        System.out.println(calendar.getTime());
        
        SimpleDateFormat simpleFormat = new SimpleDateFormat("yyyy-MM-dd");
        String formatted = simpleFormat.format(calendar.getTime());
        System.out.println(formatted);
    }
    
}
