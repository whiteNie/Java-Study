package com.winston.file.buildmodel.simplefactory;

/**
 * 简单工厂模式-创建型设计模式
 *
 * @author Winston
 * @date 2022/3/4
 */
public class SimpleFactory {

    Product get(int type) {
        switch (type) {
            case 1:
                return new ProductA();
            case 2:
                return new ProductB();
            default:
                throw new RuntimeException("没有对应的产品");
        }
    }


    public static void main(String[] args) {
        SimpleFactory simpleFactory = new SimpleFactory();
        Product product = simpleFactory.get(1);

    }
}
