package com.epam.mjc.collections.combined;

import java.util.*;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {
        List<String> resultList = new ArrayList<>();
        for (String project : projects.keySet()) {
            if (projects.get(project).contains(developer)){
                resultList.add(project);
            }
        }
        resultList.sort(Comparator.comparing(String::length).reversed());
        return resultList;
    }
}
