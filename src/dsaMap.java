import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class dsaMap {

    HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
    HashMap<Integer, String> hashMap1 = new HashMap<Integer, String>();
    public static void main(String[] args){
        dsaMap objMap = new dsaMap();
        objMap.createmap();
        objMap.appendmap();

    }

    public void createmap(){

        hashMap.put(2134, "nivi");
        hashMap.put(4321, "mickey");
        hashMap.put(3452, "naba");

        System.out.println(hashMap.get(4321));
        Set<Map.Entry<Integer,String>> entrySet = hashMap.entrySet();

        for(Map.Entry entry : entrySet){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }

    public void appendmap(){
        hashMap1.putAll(hashMap);

        Set<Map.Entry<Integer,String>> entrySet = hashMap1.entrySet();

        for(Map.Entry entry : entrySet){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }
}
