package car;

/**
 *
 * @author mararosa
 */
public class Car {

    int maxSpeed = 100;
    int minSpeed = 0;

    double weight = 4079;

    boolean isTheCarOn = false;
    char condition = 'A';
    String nameOfCar = "Lucy";

    double maxFuel = 16;
    double currentFuel = 8;
    double mpg = 26.4;

    int numberOfPeopleInCar = 1;
    int maxNumberOfPeopleInCar = 6;

    public Car() {
    }

    // f(x, y, z) = x + 1;
    // Say x = 5;
    // f(5) = 5 + 1 = 6;
    public Car(int customMaxSpeed, double customWeight, boolean customIsTheCarOn) {
        maxSpeed = customMaxSpeed;
        weight = customWeight;
        isTheCarOn = customIsTheCarOn;
    }

    public int getMaxSpeed() {
        return this.maxSpeed;
    }
     public void setMaxSpeed(int newMaxSpeed) {
        this.maxSpeed = newMaxSpeed;
    }
    
    public int getMinSpeed() {
        return this.minSpeed;
    }
    
    public double getWeight() {
        return this.weight;
    }
    
    public boolean getIsTheCarOn() {
        return this.isTheCarOn;
    }

    public boolean isIsTheCarOn() {
        return isTheCarOn;
    }

    public char getCondition() {
        return condition;
    }

    public String getNameOfCar() {
        return nameOfCar;
    }

    public double getMaxFuel() {
        return maxFuel;
    }

    public double getCurrentFuel() {
        return currentFuel;
    }

    public double getMpg() {
        return mpg;
    }

    public int getNumberOfPeopleInCar() {
        return numberOfPeopleInCar;
    }

    public int getMaxNumberOfPeopleInCar() {
        return maxNumberOfPeopleInCar;
    }

   
    
    public void printVariables() {
        System.out.println("maximum speed = " + maxSpeed);
        System.out.println("minSpeed speed = " + minSpeed);
        System.out.println("weight = " + weight);
        System.out.println("isTheCarOn = " + isTheCarOn);
        System.out.println("condition = " + condition);
        System.out.println("nameOfCar = " + nameOfCar);
        System.out.println("numberOfPeopleInCar = " + numberOfPeopleInCar);
    }

    public void upgradeMaxSpeed() {
        setMaxSpeed(getMaxSpeed() + 10);
    }

    public void getIn() {
        //if there aren't too many people in the car
        if (numberOfPeopleInCar < maxNumberOfPeopleInCar) {
            //then someone can get in
            numberOfPeopleInCar++;
            System.out.println("Someone got in");
        } else {
            //otherwise print out the fact the car is full
            System.out.println("The car is full! " + numberOfPeopleInCar + " = " + maxNumberOfPeopleInCar);
        }
    }

    public void getOut() {
        if (numberOfPeopleInCar > 0) {
            numberOfPeopleInCar--;
        } else {
            System.out.println("No one is in the car: " + numberOfPeopleInCar);
        }
    }

    public Double howManyMilesTillOutOfGas() {
        return currentFuel * mpg;
    }

    public Double maxMilesPerFillUp() {
        return maxFuel * mpg;
    }

    public void turnTheCarOn() {
        if (!isTheCarOn) {
            isTheCarOn = true;
        } else {
            System.out.println("The car is already on: " + isTheCarOn);
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Car tommyCar = new Car();
        tommyCar.getOut();
        tommyCar.getOut();
        tommyCar.getIn();
        tommyCar.getIn();
        tommyCar.getIn();
        tommyCar.getIn();
        tommyCar.getIn();
        tommyCar.getIn();
        tommyCar.getIn();
        tommyCar.turnTheCarOn();
        tommyCar.turnTheCarOn();

//        Car birthdayCar = new Car(180, 5000.545, true);
//        System.out.println("-----Birthday's Car v1-----");
//        birthdayCar.printVariables();
//        birthdayCar.getIn();
//        birthdayCar.getIn();
//        birthdayCar.getIn();
//        System.out.println("Miles Left: " + birthdayCar.howManyMilesTillOutOfGas());
//        System.out.println("Max Miles: " + birthdayCar.maxMilesPerFillUp());
//        System.out.println("-----Birthday's Car v2-----");
//        birthdayCar.printVariables();
//        birthdayCar.getOut();
//        System.out.println("-----Birthday's Car v3-----");
//        birthdayCar.printVariables();
    }

}
