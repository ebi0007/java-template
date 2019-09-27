package Test_Package_Code;


import java.util.*;

public class MainClass{

    public static void main(String[] args) {
        ArrayList<String> list= new ArrayList<>();
        list.add("ebi");
        list.add("hasan");
        list.add("mehfi");
        list.add("shakh");
        list.remove(0);
        list.remove("shah");
        for(String st:list){
            System.out.println(st);
        }
        System.out.println();
        System.out.println(list.get(0));

















    }





}