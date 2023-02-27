package Seminar_2402;

import java.util.HashMap;
import java.util.Map;

public class Passports {
    private Map<String, String> map = new HashMap<>();

    void add(String passport, String name) {
        map.put(passport, name);
    }

    void print(String name) {
        for (Map.Entry<String, String> entry : map.entrySet()) { // for (String passport: map.keySet()){
            if (entry.getValue().equals(name)) { //     if (map.get(passport).equal(name)) {
                System.out.println(entry);       //         System.out.println(passport + map.get(passport));
            }                                    //     }
        }                                        // }
    }
}
