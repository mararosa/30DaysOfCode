
package animal;

public class Animal {
    
    private int age;

    public Animal(int age) {
        this.age = age;
        System.out.println("An animal has been created!");
    }
    
    public int getAge() {
        return age;
    }
    
    public void eat() {
        System.out.println("An animal is eating");
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Animal a = new Animal(5);
        Dog d = new Dog();
        Cat c = new Cat();
        d.ruff();
        System.out.println(d.getAge());
        c.meow();
        System.out.println(c.getAge());
        a.eat();
        d.eat();
        c.eat();
        d.run();
        c.prance();
        
        //What happens if...
        //Dog o = new Animal(3);
        //Animal o = new Dog();
    }
    
}
