// 2. Напишите функцию, для поиска наиболее длинного общего префикса,
// среди массива строк. Если общего префикса нет, то возвращать пустую строку.
// Пример ["aabb", "aabbb", "aaabb"] - ответ "aa"

package ru.geekbrains;

public class Task002 {
    public static void main(String[] args) {
        String[] words = {"aabb", "aabbb", "aaabb"};
//        String[] words = {"qwer", "aabbb", "oii"};
        int minLength = words[0].length();
        for (String item : words) {
            if (item.length() < minLength) {
                minLength = item.length();
            }
        }
//        System.out.println(minLength);
//        StringBuilder str = new StringBuilder();
        String str = "";
        String resultString = "";
        for (int i = 0; i < minLength; i++) {
//            str.append(words[0].charAt(i));
            str += words[0].charAt(i);
//            System.out.println(str);
            boolean result = false;
            for (String item : words) {
                if (item.startsWith(str) == true) {
                    result = true;
//                    System.out.printf("str = %s ", str);
//                    System.out.printf("item = %s ", item);
//                    System.out.printf("result = %s\n", result);
                }
                else {
                    result = false;
//                    System.out.printf("str = %s ", str);
//                    System.out.printf("item = %s ", item);
//                    System.out.printf("result = %s\n", result);
                    break;
                }
            }
            if (result == true) {
                resultString = str;
//                System.out.printf("resultString = %s ", resultString);
//                System.out.printf("result = %s\n", result);
            }
        }
        System.out.printf("Наиболее длинный общий префикс - '%s'", resultString);
    }
}
