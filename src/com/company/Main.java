package com.company;

public class Main {

    public static void main(String[] args) {

    Box<Integer> newInt = new Box<>(12);
        System.out.println(newInt.getInteger());
        Box<Integer> newStr = (Box<Integer>) method();
        System.out.println(newStr.getInteger());
    }

     static Object method(){
        String o;
        o = "asa";
        return new Box<>(o);
    }

     static class Box <A>{

        private A integer;

        public Box(A integer) {
            this.integer = integer;
        }

        public A getInteger() {
            return integer;
        }

        public void setInteger(A integer) {
            this.integer = integer;
        }
    }
}
