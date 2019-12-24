package com.github.hcsp.polymorphism;

public class Main {
    // 猜一下输出结果是什么，然后运行一下看看是不是和你预期相符
    // 请修改下面的代码，使之输出
    // "I am Sub, the param is ParamSub"
    public static void main(String[] args) {
        Base object = new Sub();
        ParamSub param = new ParamSub();
        //方法的重载可以根据具体的对象选择，（方法重载）参数选择选择最接近他本身的不需要转换就能得到的类型（静态发生）
        object.print(param);
    }
}
