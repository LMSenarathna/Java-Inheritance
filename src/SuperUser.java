class SuperUser {

    public void login(){
        System.out.println("Login with credintials");
    }

}

class User extends SuperUser{

    public void dataEntry(){
        System.out.println("Enter cashier data");
    }

}

class subUser extends User{

    public void reporting(){
        System.out.println("Income report generate");
    }

}

class Test1 {
    public static void main(String[] args){
        subUser Su = new subUser();
        Su.login();
        Su.dataEntry();
        Su.reporting();
    }
}