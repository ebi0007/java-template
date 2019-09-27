package Swing_JOption;

import javax.swing.*;
import java.util.Random;

public class Swing_Joption {
    public static void main (String[] args){

//   دریافت ورودی از نوع String******************************
        String st =JOptionPane.showInputDialog(null,"Inter your number: ","Question",3);


//    دریافت ورودی از نوع int با گزینه های yes no cansel   ************************

       int x=JOptionPane.showConfirmDialog(null,"Are you ready?","Question",1,3);

//********************************************************************
        int[] arr=new int[5];
        Random rand=new Random();
        String[] str=new String[5];
        for(int i=0;i<5;i++) {
            arr[i]=rand.nextInt(70)+10;
            str[i] = Integer.toString(arr[i]);
        }
// دریافت ورودی از طریق لیستی از گزینه ها ... آرایه ورودی  و مقدار خروجی از جنس String
        JOptionPane.showInputDialog(null,"Your choice ?","Question",3,null,str,str[0]);







    }
}
