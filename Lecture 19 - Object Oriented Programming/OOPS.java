public class OOPS{
    public static void main(String args[]){
        // Pen p1 = new Pen(); // created a pen object called p1
        // p1.setColor("Blue");
        // System.out.println(p1.getColor());
        // p1.setTip(5);
        // System.out.println(p1.getTip());

        Student s1 = new Student("Nandini");
        System.out.println(s1.name);
    }
}

class BankAccount {
    public String username;
    private String password;
    public void setPassword(String pwd){
        password = pwd;
    }
}

class Pen{
    // properties + functions
    private String color;
    private int tip;

    String getColor(){
        return this.color;
    }
    int getTip(){
        return this.tip;
    }
    void setColor(String newColor){
        this.color = newColor;    
    }

    void setTip(int newTip){
        this.tip = newTip;
    }
}

class Student{
    String name;
    int roll;

    Student(String name){
        this.name = name;
    }
}