package com.javarush.test.level04.lesson16.home02;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/



import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        int a=Integer.parseInt(reader.readLine());
        int b=Integer.parseInt(reader.readLine());
        int c=Integer.parseInt(reader.readLine());
        int mid;
        if(a>b&&a<c||a>c&&a<b)
            System.out.println(a);
        if(b>a&&b<c||b>c&&b<a)
            System.out.println(b);
        if(c>a&&c<b||c<a&&c>b)
            System.out.println(c);
    }
}
