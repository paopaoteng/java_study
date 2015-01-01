package com.renteng.study;

import java.util.PriorityQueue;

/**
 * Created by renteng on 14/12/28.
 */
public class Parcel5 {
    private String name;
    public Destination destination(String s){
        class PDestination implements Destination{
            private String label;
            private PDestination(String s){
                label = s;
            }
            public String readLabel(){
                name = "123";
                return label;
            }
        }
        return new PDestination(s);
    }

    public static void main(String[]args){
        Parcel5 p = new Parcel5();
        Destination d = p.destination("Hangzhou");
    }
}
