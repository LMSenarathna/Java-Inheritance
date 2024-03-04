import java.sql.SQLOutput;

class Employee {

    float salary = 50000;
}

 class javaProgramer extends Employee{

    int bonus = 50000;
     public static void main(String[] args){

         javaProgramer JP = new javaProgramer();

         System.out.println("Linara Salary is " + JP.salary);
         System.out.println("Linara Salary is " + JP.bonus);
         System.out.println("Linara gross salary  is " + (JP.salary + JP.bonus));


     }


}




