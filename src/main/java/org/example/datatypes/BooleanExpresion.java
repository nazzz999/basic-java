package org.example.datatypes;

public class BooleanExpresion {

    public static void main(String[] args) {
        boolean bool1 = true;
        boolean b = false;

        if (bool1 && b){
            System.out.println();
        }
        if (bool1 || b){
            System.out.println();
        }
        if(!bool1){
            System.out.println();
        }
        boolean c = true;
        if((bool1 && b)||c){
            System.out.println();
        }

    }
}
