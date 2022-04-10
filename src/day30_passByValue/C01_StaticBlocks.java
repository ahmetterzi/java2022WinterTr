package day30_passByValue;

import day29_staticKeyword.C01_Static;

public class C01_StaticBlocks {

    static {
        System.out.println("Static block calisti");
    }//static baslangic


    C01_StaticBlocks() {
        System.out.println("Constructor calisti");
    }

    public static void main(String[] args) {
        System.out.println("main method baslangici");
        C01_StaticBlocks obj1;
        new  C01_StaticBlocks();


    }//main method
}
