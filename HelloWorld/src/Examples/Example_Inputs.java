package Examples;

import java.util.Scanner;
import javax.swing.JOptionPane;
public class Example_Inputs {
    public static void main (String[] args) {

/////////////////////////// New Object //////////////////////////
        Scanner user_input = new Scanner(System.in);

/////////////////////////// Input String   sentense /////////////////////////
     /* System.out.println("insert ur txt: ");
        String A=user_input.nextLine();
        System.out.println("input txt is: "+A);


/////////////////////////// Input number ////////////////////////
        System.out.println("insert ur Number: ");
        int  B=user_input.nextInt();
        System.out.println("input Number is: "+B);

///////////////////////////  Input char //////////////////////////
        System.out.println("insert ur char: ");
        String  C=user_input.next();
        char ch=C.charAt(2);
        System.out.println("input char is: "+ch);*/

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

////////////////////////////////////****** Show GUI msg
        JOptionPane.showMessageDialog(null, "EBI is shakh shekan", "First Message", 2);
////// -1: palin **** 0: error **** 1: information **** 2: warning **** 3: question  **************

/////////////////////////////////////******** input
        String s_input = JOptionPane.showInputDialog(null,"ins ur input","question",3);
        JOptionPane.showMessageDialog(null, "ur input is: "+s_input, "First Message", -1);

        String[] array={"A+","A-","B+","B-","AB+","AB-","O+","O-"};
        String s1_input = (String)JOptionPane.showInputDialog(null,"ins ur input","question",3,null,array,array[0]);
        JOptionPane.showMessageDialog(null, "your blood group is: "+s1_input, "First Message", -1);

///////////////////////////////////************* confirm question  yes no cansel
        int co = JOptionPane.showConfirmDialog(null,"u want continue: "," ebi",1,0);
        JOptionPane.showMessageDialog(null,"output value is: "+co,"output",1);
        //**** option type==>> -1:ok ****** 0:yes no ****** 1: yes no cansel ******* 2: ok cansel


/////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    }
}