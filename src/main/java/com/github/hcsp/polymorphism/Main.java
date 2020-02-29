package com.github.hcsp.polymorphism;

public class Main {
    // 猜一下输出结果是什么，然后运行一下看看是不是和你预期相符
    // 请修改下面的代码，使之输出
    // "I am Sub, the param is ParamSub"
    public static void main(String[] args) {
        Base object = new Sub();
        ParamSub param = new ParamSub();
        //参数静态绑定，接受者动态绑定
        object.print(param);
        //消息的接受者是子类类型Sub，故先调用子类Sub的print()方法
        //print()方法的参数在编译期间静态绑定
    }
}
