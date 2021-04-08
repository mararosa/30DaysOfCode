
package person;

import static person.HairColor.*;

public class Person {
    
    HairColor hairColor = BLACK;
    
    public Person() {
        
    }
            
    public static void main(String[] args) {
        // TODO code application logic here
        Person peterParker = new Person();
        Person spiderMan = peterParker;
        
        spiderMan.hairColor = PINK;
        
        System.out.println("Hair Color of Peter Parker: " + peterParker.hairColor);
        System.out.println("Hair Color of Spider-Man: " + spiderMan.hairColor);
    }
    
}
