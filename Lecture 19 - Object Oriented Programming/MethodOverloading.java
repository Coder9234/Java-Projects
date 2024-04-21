public class MethodOverloading {
    public static void main(String args[]){
        Deer d = new Deer();
        d.eat();
    }   
}

class Animal{
    void eat(){
        System.err.println("eats anything");
    }
}

class Deer extends Animal{
    void eat(){
        System.out.println("eats grass");
    }
}

class Calculator {
    int sum(int a, int b){
        return a + b;
    }

    float sum(float a, float b){
        return a + b;
    }

    int sum(int a, int b, int c){
        return a + b + c;
    }
}