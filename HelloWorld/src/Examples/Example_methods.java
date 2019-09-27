package Examples;

public class Example_methods {
    public static void main(String [] args){
        int a,b;
        printnumbers();
        printNameAge("Ebi",27);
        sum(3,5);
        sum(4,12);
        String c=ConcatStrings("ebinem is"," the best.");
        System.out.println(c);
        double d= sumd(2.75,5);
        System.out.println("sum of dubble numbers is: "+d);
        int j=fact1(10);
        System.out.println("fact "+10+"= "+j);
    }
//////////////////////// printnumber Methods /////////////////////////
    public static void printnumbers(){
        int i;
        printtxt();
        for (i=1;i<3;i++) System.out.println(i);
        printtxt();
    }
/////////////////////// در متد printnumber فراخوانی شده است. /////////////////////////////
    public static void printtxt (){
        System.out.println("this in methods test");
    }
///////////////////////method with input and print output
   public static void printNameAge(String name,int age){
        System.out.println("name is "+name+" and age is "+age);
   }
//////////////////////////sum method ////////////////////////////////////////////
    public static void sum(int a,int b){
        int c= a+b;
        System.out.println("sum of number is : "+c);
    }
//////////////////////////////// concat two strings with return ///////////////////////////////
    public static String ConcatStrings(String a,String b){
        String c=a+b;
        return c;
    }
//////////////////////////////////// sum of double number  and return result /////////////////////////
    public static double sumd(double a, double b){
        double c=a+b;
        return c;
    }

/////////////////////////////////////////// fact
    public static int fact( int a){
    int f=1;
    for (int i=a;1<=i;i--){
        f=f*i;
    }
    return f;
}
    //////////////////////// ************** recursive factorial   /////////////////////////
    public static int fact1( int a){
        if (a==1) return 1;
        else return (a*fact1(a-1));
    }
    ///////////////////////////////////////// fibonachi
    public static int fib(int a){
        if (a==1) return 1;
        else if (a==2) return 1;
        else return fib(a-1)+fib(a-2);
    }


}
