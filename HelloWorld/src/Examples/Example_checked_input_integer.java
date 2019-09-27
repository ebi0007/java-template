package Examples;
import javax.swing.*;
import java.util.Scanner;

public class Example_checked_input_integer {
    public static void main (String args[]){
        // in hasnextint  to Scanner estefade mishe.
        Scanner keyboard = new Scanner(System.in);
        int truePassword=1256;
        System.out.println("Insert password: ");

        // میگه اگه ورودی از نوع int بود
        if(keyboard.hasNextInt()){
            if (truePassword==keyboard.nextInt()) System.out.println("login is success.");
            else System.out.println("Password in wrong !");
        }
        // در غیر این صورت
        else System.out.println("Sorry, please enter the right format.");

        //*************************** password ra be soorate int daryaft konad dar gheire in sorat error dahad ******************
       // int truePassword=1256;
        String input= JOptionPane.showInputDialog(null,"Insert password: ","Question",3);

        if(isStringInteger(input)){
            int b=Integer.parseInt(input);
            if (truePassword==b)  JOptionPane.showMessageDialog(null,"login is success.","Result",1);
            else JOptionPane.showMessageDialog(null,"Password in wrong !","",0);
        }
        else JOptionPane.showMessageDialog(null,"Sorry, please enter the right format.","Warning",2);
        //********************************************************************************



    }
//*********************************************************
    // raveshe dovom : moshakhs mikone vorodi integere ya int ( to showinptdialog estefade mishe.)
    public static boolean isStringInteger(String number ){
        try{
            Integer.parseInt(number);
        }catch(Exception e ){
            return false;
        }
        return true;
    }
//***********************************************************



}
