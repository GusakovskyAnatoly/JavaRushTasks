package com.javarush.task.task19.task1922;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 
Ищем нужные строки
*/

public class Solution {
    public static List<String> words = new ArrayList<String>();

    static {
        words.add("файл");
        words.add("вид");
        words.add("В");
    }
    public static void main(String[] args) {
try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
    String fileName = reader.readLine();
    try(FileReader fileReader = new FileReader(fileName);
    BufferedReader bufferedReader = new BufferedReader(fileReader)){
        String line;
        while((line = bufferedReader.readLine()) != null) {
          int count = 0;
          for(String word : words) {
              Pattern pattern = Pattern.compile("\\b" + word + "\\b");
              Matcher matcher = pattern.matcher(line);
               while(matcher.find())
                  count = count + 1;
          }
          if(count == 2)
              System.out.println(line);
        }
    }
}
 catch (IOException e) {
    e.printStackTrace();
 }
    }
}
