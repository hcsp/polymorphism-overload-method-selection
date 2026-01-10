package com.github.hcsp.polymorphism;

public class Main {
    // 猜一下输出结果是什么，然后运行一下看看是不是和你预期相符
    // 请修改下面的代码，使之输出
    // "I am Sub, the param is ParamSub"
    public static void main(String[] args) {
        Sub object = new Sub();
        ParamSub param = new ParamSub();
        object.print(param);
    }

    /*  object 的声明类型是 Base
    先去 Base 类看看有没有print(param）方法  （ 有 ）
    然后看看参数 param 的声明类型 👉 是 ParamBase
    所以调用的是 print方法 + 传递参数为 ParamBase
    然后看 Object 变量的真实对象是 Sub
    所以是调用 Sub 类的 print 方法 参数为 ParamBase

    现在题目要求是调用 Sub 类型的 print 方法 参数为 ParamSub
    所以问题出在参数的声明类型
    要从 ParamBase 改成 ParamSub
     */
}
