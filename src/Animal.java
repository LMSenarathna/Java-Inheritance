import java.sql.SQLOutput;

public class Animal {

    String name;

    public void eat(){

        System.out.println("I can eat");
    }
}

class Human extends Animal{
    public void show(){
        System.out.println("My naame is :" + name);
    }
}

class Test{

    public static void main(String[] args){

        Human H = new Human();
        H.name = "Linara"; // A value was assigned to the variable.

        H.show();
        H.eat();
    }

}