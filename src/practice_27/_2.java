package practice_27;

import practice_21._2_3.ArrayTest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class _2 {
    public static void main(String[] args) {
        Map<String, String> names = createMap();
        
    }

    public static Map<String, String> createMap() {
        String[] names = new String[]{
                "Пашовкин Кирилл",
                "Абдулов Кирилл",
                "Пашовкин Дмитрий",
                "Пашовкин Александр",
                "Кобозев Егор",
                "Нагрудный Семён",
                "Марьина Александра",
                "Ефременко Алексей",
                "Булынин Денис",
                "Орехова Дарья"
        };
        Map<String, String> map = new HashMap<>();
        ArrayList<String> repeatedNames = new ArrayList<>();
        ArrayList<String> repeatedSurNames = new ArrayList<>();
        int countUniqueNames = 10;
        int countUniqueSurNames = 10;
        for (String name : names) {
            String[] s = name.split(" ");
            map.put(s[0], s[1]);
            if (repeatedSurNames.contains(s[0])) countUniqueSurNames--;
            if (repeatedNames.contains(s[1])) countUniqueNames--;
            repeatedSurNames.add(s[0]);
            repeatedNames.add(s[1]);
        }
        System.out.println("Уникальные имена:" + countUniqueNames);
        System.out.println("Уникальные фамилии:" + countUniqueSurNames);
        return map;
    }

}
