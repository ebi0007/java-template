package Examples.Constructor;

public class SubClass {
    String name;
    int age;
    SubClass( String name,int age){
        this.name=name;
        this.age=age;
    }
    public void PrintTxt(){
        System.out.println("Name is: "+name);
        System.out.println("Age is: "+age);
    }
}
