package com.renteng.study;

/**
 * Created by renteng on 15/1/1.
 */
public class Parcel7 {
    public Contents contents(){
        return new Contents() {
            private int i = 1;
            @Override
            public int value() {
                return i;
            }
        };
    }

    public static void main(String[] args){
        Parcel7 p = new Parcel7();
        Contents c = p.contents();
    }
}
