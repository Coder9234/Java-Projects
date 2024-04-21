public class Inheritance {
    public static void main(String args[]){
        Dog pug = new Dog();
        pug.eat();
        pug.legs = 4;
        System.out.println(pug.legs);
    }
}

// Base Class
class Animal {
    String color;

    void eat(){
        System.out.println("eats");
    }

    void breathe(){
        System.out.println("breathes");
    }
}

class Mammal extends Animal{
    void walk(){
        System.out.println("walks");
    }
}

class Fish extends Mammal{
    void swim(){
        System.out.println("swim");
    }
}

class Bird extends Mammal{
    void fly(){
        System.out.println("fly");
    }
}


// Derived Class
// class Fish extends Animal {
//     int fins;
//     void swim(){
//         System.out.println("Swims in water");
//     }
// }