public class InheritanceDemo {
    public static void main(String args[]){
        Fish f=new Fish();
        f.breathe();
        f.swim();
        bird parrot=new bird();
        parrot.eats();
        parrot.fly();
    }
}
class Animal{
    String colour;

    void eats(){
        System.out.println("eats");
    }

    protected void breathe(){
        System.out.println("breathes");
    }
}
class Fish extends Animal{
    void swim(){
        System.out.println("swims");
    }
}
class Mammal extends Animal{
    void walk(){
        System.out.println("walks");
    }
}
class Dog extends Mammal{
    int legs;
    void dog(){
        System.out.println("It is a dog");
    }
}

class bird extends Animal {
    void fly(){
        System.out.println("flies");
    }
}
