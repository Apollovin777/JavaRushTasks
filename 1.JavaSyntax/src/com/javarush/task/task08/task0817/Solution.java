package com.javarush.task.task08.task0817;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("Stallone", "Silvester");
        map.put("Taylor", "Swift");
        map.put("Jackson", "Michael");
        map.put("Pitt", "Bred");
        map.put("Brosnan", "Peers");
        map.put("Perry", "Emma");
        map.put("Hewit", "Emma");
        map.put("Berry", "Holy");
        map.put("Raider", "Jack");
        map.put("Knight", "Jack");
        return  map;
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map) {
        String[] list = new String[map.values().size()];
        HashSet<String> duplex = new HashSet<>();
        list = map.values().toArray(list);
        for(int i = 0;i<list.length;i++){
            for (int j = i+1;j<list.length;j++){
                if (list[i]==list[j])
                    duplex.add(list[i]);
            }
        }
        for(String str:duplex)
            removeItemFromMapByValue(map,str);
    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {

    }
}
