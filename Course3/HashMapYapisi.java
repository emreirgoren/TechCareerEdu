package Course3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapYapisi {

    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();
        map.put(1,"Can");
        map.put(2,"Beliz");
        map.put(2,"Cavit");

        System.out.println(map);
        System.out.println("/////");
        System.out.println(map.size());

        System.out.println("/////");

        String value = map.get(2);
        System.out.println(value);
        System.out.println("/////");

        for(Integer key : map.keySet()) {
            System.out.println("key: " + key + " Value: " + map.get(key));
        }

        for(Map.Entry<Integer,String> entry : map.entrySet()){
            Integer key = entry.getKey();
            String value2 = entry.getValue();
            System.out.println("key: " + key + " Value: " + value2);
        }

        Map<String, List<String>> nameMap =new HashMap<>();
        List<String> famaleNames = List.of("Emine","Yagmur", "Beliz", "Nisa");
        List<String> maleNames = List.of("Salih" , "Can", "Eren");
        nameMap.put("Kadınlar",famaleNames);
        nameMap.put("Erkekler", maleNames);

        for(Map.Entry<String, List<String >> entry : nameMap.entrySet()){
            String key = entry.getKey();
            List<String> valeus = entry.getValue();
            System.out.println("Cinsiyet: " + key + " Value " + valeus);
            for(String name : valeus){
                System.out.println("Cinsiyet: " + key + " Value: " + name);
            }
        }


    }

}
