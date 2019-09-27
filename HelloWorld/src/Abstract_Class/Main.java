package Abstract_Class;

public class Main {
    public static void main(String[] args){

        AbstractClass obj=new Child_for_AbstractClass();
        obj.print();
        obj.x=60;
        obj.y="hasan";
        obj.printMethod();

        System.out.println();

        AbstractClass obj2=new child2_for_absClass();
        obj2.x=80;
        obj2.y="test2";
        obj2.print();
        obj2.printMethod();




    }
}
