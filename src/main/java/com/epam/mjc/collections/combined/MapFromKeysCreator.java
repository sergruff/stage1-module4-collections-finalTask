package com.epam.mjc.collections.combined;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
        Map<Integer, Set<String>> resultMap = new HashMap<>();
        for (String key : sourceMap.keySet()) {
            Set<String> toAdd;
            if (!resultMap.containsKey(key.length())){
                toAdd = new HashSet<>();
            } else {
                toAdd = resultMap.get(key.length());
            }
            toAdd.add(key);
            resultMap.put(key.length(),toAdd);
        }
        return resultMap;
    }
}
