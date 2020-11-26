package com.sqh.pojo;

public class Outer {
 private int num;

    public   void open()
    {
        Inner inner=new Inner();
        inner.show();
    }

    class Inner{
    public void show(){
        num=10;
        System.out.println(num);
     }

 }
}
