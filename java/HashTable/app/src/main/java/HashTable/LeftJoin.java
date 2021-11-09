package HashTable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class LeftJoin {
    public static HashMap<String, String[]> leftJoin(HashMap<String, String> hashetable1, HashMap<String, String> hashtable2) {

        HashMap<String, String[]> result = new HashMap<>();
        ArrayList<String> result2Arry2 =new ArrayList<>();

        for (String key : hashetable1.keySet()) {
            String[] s = new String[2];
            s[0] = hashetable1.get(key);
            s[1] = hashtable2.containsKey(key) ? hashtable2.get(key) : null;
            result.put(key,s);
            System.out.println(key+":"+" "+ Arrays.toString(s));


        }
        return result;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
