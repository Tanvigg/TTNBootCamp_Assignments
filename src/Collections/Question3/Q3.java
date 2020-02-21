package Collections.Question3;
// Write a program to sort HashMap by value.

import java.util.*;

public class Q3{
    public static
    Map<String, Integer> map = new HashMap<String, Integer>();

    public static void main(String[] args) {

        map.put("eesha", 20);
        map.put("tannu", 100);
        map.put("subo", 40);
        map.put("gonu", 1);
        map.put("tripy", 41);
        map.put("guni", 26);

        printMap(map);
        System.out.println("\n");
        sortMap(map);

        printMap(sortMap(map));


    }

    private static HashMap<String, Integer> sortMap(Map<String, Integer> map) {

        List<Map.Entry<String, Integer>> list = new LinkedList<Map.Entry<String, Integer>>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });

        HashMap<String, Integer> sortedMap = new LinkedHashMap<String, Integer>();
        for (Map.Entry<String, Integer> map1 : list){
            sortedMap.put(map1.getKey(), map1.getValue());
        }

        return sortedMap;
    }

    private static void printMap(Map map) {
        Iterator<String> keyIterator = map.keySet().iterator();
        Iterator<Integer> valueIterator = map.values().iterator();
        while (keyIterator.hasNext()&&valueIterator.hasNext()){
            System.out.println(keyIterator.next()+": "+valueIterator.next());
        }
    }


}
