package com.renteng.study.com.renteng.study.innerclassb;

import com.renteng.study.com.renteng.study.innerclassa.IInterfaceInA;

/**
 * Created by renteng on 15/1/1.
 */
public class InnerClassB {

    protected class InnerClass implements IInterfaceInA{
        @Override
        public String name() {
            return "RenTeng";
        }
    }
}
