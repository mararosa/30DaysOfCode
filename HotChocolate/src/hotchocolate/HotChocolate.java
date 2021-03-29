package hotchocolate;

import java.util.concurrent.TimeUnit;

public class HotChocolate {

    public static final double tooHot = 185;
    public static final double tooCold = 160;

    public static void drinkotChocolate(double cocoaTemperature) throws TooHotException, TooColdException {
        if (cocoaTemperature >= tooHot) {
            throw new TooHotException();
        } else if (cocoaTemperature <= tooCold) {
            throw new TooColdException();
        }
    }

    public static void main(String[] args) throws TooColdException,
            TooHotException, InterruptedException {
        // TODO code application logic here
        double currentCocoaTemp = 170;
        boolean wrongTemp = true;
        while (wrongTemp) {
            try {
                drinkotChocolate(currentCocoaTemp);
                System.out.println("That cocoa was good!");
                wrongTemp = false;
            } catch (TooHotException e) {
                System.out.println("THAT'S TOO HOT!");
                currentCocoaTemp -= 5;
            } catch (TooColdException e) {
                System.out.println("THAT'S SO COLD! It's like the artic");
                currentCocoaTemp += 5;
            }
            TimeUnit.SECONDS.sleep(2);
        }
        System.out.println("And it's gone.");
    }
}
