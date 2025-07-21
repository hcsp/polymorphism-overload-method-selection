package com.github.hcsp.polymorphism;

public class Main {
    // 猜一下输出结果是什么，然后运行一下看看是不是和你预期相符
    // 请修改下面的代码，使之输出
    // "I am Sub, the param is ParamSub"
    public static void main(String[] args) {     //程序开始
        Base object = new Sub();                 // 父类的引用类型指向子类的对象
        ParamBase param = new ParamSub();        // 父类的引用类型指向子类的对象
        ParamSub paramsub = new ParamSub();
        object.print(paramsub);                     // 参数静态,方法动态
                                                 // 👉参数指向的对象是子类, 所以调用子类的Paramsub
                                                 // 👉参数本身是父类的, 所以将调用子类方法的父类参数
        /* 现在题目要求调用子类方法的子类参数
        因为对象本身就是子类的, 所以调用方法不用改
        但是参数要改成子类的才可以, 因为参数是静态的,编译的时候是什么 运行的时候就是什么
         */
    }
}
