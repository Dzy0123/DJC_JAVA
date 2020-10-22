package djc.day16;

import java.util.HashMap;
import java.util.Hashtable;

public class Demo06Hashtable { //Hashtable集合

    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();
        map.put(null,"a");
        map.put("b",null);
        map.put(null,null); //取代第一个
        System.out.println(map); //{null=null, b=null}

        Hashtable<String,String> table = new Hashtable<>();
        //table.put(null,"a"); //NullPointerException
        //table.put("b",null); //NullPointerException
        //table.put(null,null); //NullPointerException
        System.out.println(table);
    }
}
