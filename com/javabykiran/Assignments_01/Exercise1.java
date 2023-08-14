  package com.javabykiran.Assignments_01;

  import jdk.nashorn.internal.ir.Block;

  public class Exercise1 {
    void show(String p) {
        System.out.println(111);
    }

    void show(Object p) {
        System.out.println(222);
    }

    public static void main(String[] args) {
        Exercise1 b = new Exercise1();
        Object o = new Object();
        o = null;
        b.show(null);       //111

        b.show((Object) null);  //222
        b.show(o);              //222


    }
    
}
