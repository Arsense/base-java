package com.base.java.jvm;

/**
 * 手动GC测试
 *
 * @author Clay
 * @date 2018/12/20 9:19
 */
public class ReferenceCountingGC {

    public Object instance = null;

    public static void main(String[] args) {
        ReferenceCountingGC objA = new ReferenceCountingGC();
        ReferenceCountingGC objB = new ReferenceCountingGC();
        objA.instance = objB;
        objB.instance = objA;

        objA = null;
        objB = null;

        System.gc();//GC
    }
}
