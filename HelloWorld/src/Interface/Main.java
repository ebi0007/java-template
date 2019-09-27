package Interface;

public class Main {
    public static void main (String[] args){
        System.out.println("THIS IS FIRST INTERFACE PROJECT !");
//********************************************
        Interface1 obj=new Class1();
        obj.function1();
        obj.function2();
        obj.msg();

        System.out.println();
//********************************************
        Interface2 obj1=new Class2();
        obj1.function3();

        System.out.println();
//********************************************
        Interface4 obj4=new Class3();
        obj4.function3();
        obj4.function4();
        obj4.function5();





    }
}
