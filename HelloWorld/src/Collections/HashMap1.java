package Collections;

import java.util.HashMap;
import java.util.Map;

public class HashMap1 {
    public static void main(String[] args) {
        Map<String,Integer> map= new HashMap<>();
        map.put("ebi",25);
        map.put("hasan",28);
        map.put("miri",22);
        map.put("shakh",225);
        map.put("shekan",215);
        map.put("shekan",215);
        int i=map.get("miri");
        System.out.println(i);

        System.out.println("contain ebi: "+map.containsKey("ebi"));
        System.out.println("contain 25: "+map.containsValue(215));

        map.remove("miri");
        System.out.println(map.size());

        //////////////// exmaple 2
        Map<Student,Double> map1=new HashMap<>();
        map1.put(new Student("ebi"),25.2);
        map1.put(new Student("shakh"),new Double(84.52));
        map1.put(new Student("hasan"),new Double(15));

        map1.remove(new Student("ebi"));

        Double sum=0.0;
        for(Double c:map1.values()){
            sum+=c;
        }
        System.out.println("avg: "+(sum/map1.size()));








    }
}
