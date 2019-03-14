package com.test.awmsome.structure;


import com.test.awmsome.structure.impl.StackImpl;

/**
 * @author tangwei
 * @date 2019/3/14 10:56
 */
public class StructureTest {

    public static void main(String[] args) {
//        LinkList list = new LinkList();
//
//        list.add("第一个元素");
//        list.add("第二个元素");
//        list.add("第3个元素");
//        list.add("第4个元素");
//        System.out.println("-------添加结果为:");
//        list.print();
//
//        list.insert(1,"插入值");
//        System.out.println("------插入结果为:");
//        list.print();
//
//        list.remove(1);
//        System.out.println("---------删除结果为:");
//        list.print();
//
//        list.query(1);
//        //单链表测试  END

        StackImpl stack = new StackImpl();
        stack.push("No 1");
        stack.push("No 2");
        stack.push("No 3");
        System.out.println("Stack push操作后结果为:");
        stack.print();

        System.out.println("Stack peek操作后结果为:" + stack.peek());
        stack.print();


        stack.pop();
        System.out.println("Stack pop操作后结果为:");
        stack.print();

    }
}
