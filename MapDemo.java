import java.util.*;
public class MapDemo{
    public static void main(String[] args) {
        Map<Integer,Integer> hm = new HashMap<>();
        hm.put(10,96);
        hm.put(9,95);
        hm.put(7,97);
        for(Map.Entry<Integer,Integer> i : hm.entrySet()){
            System.out.println(i.getKey()+" "+i.getValue());
        }
        if(hm.containsKey(9)){
            System.out.println(hm.get(9));
        }else{
            System.out.println("Key not found");
        }
        hm.put(10,100);
        hm.remove(9);
    }
}