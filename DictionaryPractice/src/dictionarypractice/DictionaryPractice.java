package dictionarypractice;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author maraosa
 */
public class DictionaryPractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // English to Spanish Dictionary
        Map<String, String> englSpanDictionary = new HashMap<String, String>();
        // Putting things inside our dictionary
        englSpanDictionary.put("Monday", "Lunes");
        englSpanDictionary.put("Tuesday", "Martes");
        englSpanDictionary.put("Wednesday", "Miércules");
        englSpanDictionary.put("Thursday", "Jueves");
        englSpanDictionary.put("Friday", "Viernes");
        englSpanDictionary.put("Saturday", "Sábado");
        englSpanDictionary.put("Sunday", "Domingo");
        // Retrieve things from our dictionary
        System.out.println(englSpanDictionary.get("Monday"));
        System.out.println(englSpanDictionary.get("Tuesday"));
        System.out.println(englSpanDictionary.get("Wednesday"));
        System.out.println(englSpanDictionary.get("Thursday"));
        System.out.println(englSpanDictionary.get("Friday"));
        // Print out all keys
        System.out.println(englSpanDictionary.keySet());
        // Print out all values
        System.out.println(englSpanDictionary.values());
        // Print out size
        System.out.println("The size of our Dictionary is " + englSpanDictionary.size());

        System.out.println();
        System.out.println();

        // Shopping List
        Map<String, Boolean> shoppingList = new HashMap<String, Boolean>();
        // Put some stuff in Dictionary
        shoppingList.put("Ham", Boolean.FALSE);
        shoppingList.put("Bread", Boolean.TRUE);
        shoppingList.put("Oreos", Boolean.TRUE);
        shoppingList.put("Eggs", false);
        shoppingList.put("Sugar", true);
        // Retrieve items
        System.out.println(shoppingList.get("Sugar"));
        System.out.println(shoppingList.get("Ham"));
        // Key-Value Pairs Print Out
        System.out.println(shoppingList.toString());
        //Is empty?
        System.out.println("Is Empty? " + shoppingList.isEmpty());
        //Remove things
        shoppingList.remove("Eggs");
        // Replace values for a certain key
        shoppingList.replace("Bread", Boolean.FALSE);
        // Key-Value Pairs Print Out
        System.out.println(shoppingList.toString());
        // Returns true if the map contains a mapping for Key
        System.out.println("Tem a Key Bread?");
        System.out.println(shoppingList.containsKey("Bread"));

        // Clear our dictionary
        shoppingList.clear();
        System.out.println(shoppingList.toString());
        //Is empty?
        System.out.println("Is Empty? " + shoppingList.isEmpty());

    }

}
