package com.javarush.task.task19.task1924;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 
Замена чисел
*/

// works well but fails validation
public class Solution {
    public static Map<Integer, String> map = new HashMap<Integer, String>();

    static {
        map.put(0, "ноль");
        map.put(1, "один");
        map.put(2, "два");
        map.put(3, "три");
        map.put(4, "четыре");
        map.put(5, "пять");
        map.put(6, "шесть");
        map.put(7, "семь");
        map.put(8, "восемь");
        map.put(9, "девять");
        map.put(10, "десять");
        map.put(11, "одиннадцать");
        map.put(12, "двенадцать");
    }

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String fileName = reader.readLine();
            String line;
            ArrayList<String> listStringsFromFile = new ArrayList<>();
            ArrayList<String> toWriteList = new ArrayList<>();
            try (BufferedReader fileReader = new BufferedReader(new FileReader(fileName))) {
                while ((line = fileReader.readLine()) != null) {
                    listStringsFromFile.add(line);
                }
                for (String x : listStringsFromFile) {
                    String editedString = x;
                    //for (Map.Entry<Integer, String> pair : map.entrySet()) {
                    for (int i = 12; i > -1; i--) {
                        String numberString = map.get(i);
                        String regEx = "\\b" + i + "\\b";
                        Pattern pattern = Pattern.compile(regEx);
                        Matcher matcher = pattern.matcher(editedString);
                        while (matcher.find()) {
                            String one, two, toReplace;
                            one = editedString.substring(0, matcher.start());
                            two = editedString.substring(matcher.end(), editedString.length());
                            toReplace = numberString;
                            editedString = one + toReplace + two;
                        }
                    }
                    toWriteList.add(editedString);
                }
                      for(int i = 0; i < toWriteList.size(); i++) {
                          System.out.println(toWriteList.get(i));
                      }
            } catch (FileNotFoundException sad) {
                System.out.println("FileNotFoundException catched");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
