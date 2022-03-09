package com.winston.file.buildmodel.factorymethod;

/**
 * 工厂方法模式
 * 更加遵循开闭原则
 * 开发拓展，关闭修改
 * 每次有新的拓展，只需要为这类创建一个具体的工厂类就可以获得对应的实例
 *
 * @author Winston
 * @date 2022/3/8
 */
public class FactoryDemo {


    public static void main(String[] args) {

        new StrawberryFactory().createProduct().doSomething();

        new AppleFactory().createProduct().doSomething();
    }

}
