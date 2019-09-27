package Examples;

public class Example_Rules {
    public static void main (String [] args) {

        //////////////////////////////////print format
        int i = 1990;
        System.out.println("Ebinem");
        System.out.println(i);
        int page = 1013;
        System.out.println("page " + page + " is about Android");

        //////////////////////////////////number range
        float f1 = 12.25f;
        System.out.println("f1 is float= " + f1);
        float f2 = (float) 12.25;
        System.out.println("f2 is float= " + f2);

        ////////////////////////////////////// String
        String a = "abcdefghijklmno";
        String b;
        b = a.substring(2, 5);
        System.out.println("sub string is = " + b);
        // lenght of string
        int len = a.length();
        System.out.println("length is = " + len);

        String str = "Wellcome to Android Academy";
        String sub1, sub2, sub3, sub4;
        System.out.println();
        sub1 = str.substring(0, 8);
        System.out.println("sub1 is = " + sub1);
        sub2 = str.substring(9, 11);
        System.out.println("sub2 is = " + sub2);
        sub3 = str.substring(12, 19);
        System.out.println("sub3 is = " + sub3);
        sub4 = str.substring(20, 27);
        System.out.println("sub4 is = " + sub4);

        /////////////////////////////////////////boolean
        boolean isday = true;
        boolean isnight = false;
        System.out.println("is day right now ? " + isday);
        System.out.println("is night right now ? " + isnight);

        /////////////////////////////////////////////Operators
        int m = 5, n = 3;
        float x;
        x = (float) m / n;
        System.out.println("m/n = " + x);

        //////////////////////////////////////Conditional operators
        int age = 11;
        if (age >= 18) {
            System.out.println("user age is 18 or younger.");
        }
        if (age < 18) {
            System.out.println("user age is older than 18.");
        }
        /////// if else
        if (age >= 18) {
            System.out.println("user age is 18 or younger.");
        } else {
            System.out.println("user age is older than 18.");
        }

        ///////////////////////////// else if
        int day=4;
        if (day==0){ System.out.println("day is shanbe.");}
        else if (day==1){ System.out.println("day is 1shanbe.");}
        else if (day==2){ System.out.println("day is 2shanbe.");}
        else if (day==3){ System.out.println("day is 3shanbe.");}
        else if (day==4){ System.out.println("day is 4shanbe.");}
        else if (day==5){ System.out.println("day is 5shanbe.");}
        else { System.out.println("day is jome.");}

        ////////////////////////////////////// switch
        day = 5;
        switch (day){
            case 0 : System.out.println("day is shanbe"); break;
            case 1 : System.out.println("day is 1shanabe");break;
            case 2 : System.out.println("day is 2shanabe");break;
            case 3 : System.out.println("day is 3shanabe");break;
            case 4 : System.out.println("day is 4shanabe");break;
            case 5 : System.out.println("day is 5shanabe");break;
            case 6 : System.out.println("day is jome");break;
        }

        int childage=4;
        switch (childage){
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Group A");
                break;
            case 7:
            case 8:
            case 9:
                System.out.println("Group B");
                break; }
/////////////////////////////////////while
        i=0;
        while(i<10){
            System.out.print(" "+10*i);
            i++; }
//////////////////////////// for /////////////////////////
        System.out.println();
        for (i=0 ;i<10;i++){
            System.out.print(" "+10*i);}

        System.out.println();
        for(i=9;-1<i;i--){
            System.out.print(" "+10*i);}

        System.out.println();
        for (i=20;i<41;i+=2) {
            System.out.print(" "+i);}





    }
}
