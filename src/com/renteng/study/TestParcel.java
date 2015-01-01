package com.renteng.study;

import sun.plugin.converter.resources.Converter_es;

/**
 * Created by renteng on 14/12/28.
 */

class Parcel4{
    public int f(){
        return (new PContents()).i;
    }

    private class PContents implements Contents{
        private int i = 1;
        public int value(){
            return i;
        }
    }
    protected class PDestination implements Destination{
        private String label;
        public PDestination(String whereTO){
            label = whereTO;
        }
        public String readLabel(){
            return label;
        }
    }
    public Destination destination(String s){
        return new PDestination(s);
    }
    public Contents contents(){
        return new PContents();
    }
}

public class TestParcel {
    public static void main(String[]args){
        Parcel4 p = new Parcel4();
        Contents c = p.contents();
        Destination d = p.destination("Hangzhou");
        System.out.println(p.f());
    }
}
