package com.javarush.test.level05.lesson07.task05;

/* Создать класс прямоугольник (Rectangle)
Создать класс прямоугольник (Rectangle).
Его данными будут top, left, width, height (левая координата, верхняя, ширина и высота).
Создать для него как можно больше методов initialize(…)
Примеры:
-	заданы 4 параметра: left, top, width, height
-	ширина/высота не задана (оба равны 0)
-	высота не задана (равно ширине) создаём квадрат
-	создаём копию другого прямоугольника (он и передаётся в параметрах)
*/

public class Rectangle
{
    private int top;
    private int left;
    private int width;
    private int height;
    private String copy;
    public void initialize(int top,int left,int width,int height){
        this.top=top;
        this.height=height;
        this.width=width;
        this.left=left;
    }
    public void initialize(int top,int left){
        this.top=top;
        this.height=0;
        this.width=0;
        this.left=left;
    }
    public void initialize(int top,int left,int height){
        this.top=top;
        this.height=width;
        this.width=height;
        this.left=left;
    }
    public void initialize(Rectangle copy){
        copy.top=this.top;
        copy.left=this.left;
copy.width=this.width;
        copy.height=this.height;
        }
        }
