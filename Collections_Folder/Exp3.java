package Collections_Folder;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Exp3 {
    public static void main(String[] args) {
        HashMap<String , Integer > data = new HashMap<>();
        data.put("lenovo", 234);
        data.put("dell", 45);
        data.put("asus", 38);
        data.put("dell", 300);
        System.out.println(data.size());
        Iterator<Map.Entry<String , Integer>> itr = data.entrySet().iterator(); // map is outer interface // entry is inner interface
        while(itr.hasNext()){
            Entry<String , Integer> et = itr.next();
            // System.out.println(Entry::getKey()+ " "  + Entry::getValue + " " + Entry::getClass);
            System.out.println(et.getKey() + "<==> " + et.getValue());
        }
    }
    
}
