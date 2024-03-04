public class Car {

    public void driveCar(){
        System.out.println("Car is driving");
    }
}
class Audi extends Car{
    public void driveAudi(){
        System.out.println("Audi is driving");
    }
}

class Mercedez extends Car{
    public void driveMercedez(){
        System.out.println("Mercedez is driving");
    }
}

class BMW extends Car{
    public void driveBMW(){
        System.out.println("BMW is driving");
    }
}
class Test2 {

    public static void main(String[] args){

        Audi a = new Audi();
        a.driveAudi();
        a.driveCar();
        Mercedez M = new Mercedez();
        M.driveMercedez();
        M.driveCar();
        BMW bmw = new BMW();
        bmw.driveBMW();
        bmw.driveCar();

    }
}
