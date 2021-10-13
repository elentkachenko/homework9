package com.itAcademy;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        String text = "Здесь должна быть первая глава Войны и Мира, но ее не будет. Постройте частотный словарь букв русского (или английского 96) алфавита";
        String str = text.toLowerCase().replaceAll("([^а-я*])", "");

        Map<Character, Integer> strMap = new TreeMap<>();
        for (int i = 0; i < str.length(); i++) {
            char element = str.charAt(i);
            if (strMap.containsKey(element)) {
                strMap.put(element, strMap.get(element) + 1);
            } else {
                strMap.put(element, 1);
            }
        }
        System.out.println(strMap);
    }
}
