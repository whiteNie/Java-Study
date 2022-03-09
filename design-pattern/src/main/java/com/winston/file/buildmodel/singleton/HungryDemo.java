package com.winston.file.buildmodel.singleton;

/**
 * 饿汉式
 *
 * @author Winston
 * @date 2022/3/4
 */
public class HungryDemo {

    private String name;

    public String getName() {
        return "单例模式饿汉式";
    }

    private final static HungryDemo hungry = new HungryDemo();

    private HungryDemo() {
    }

    public static HungryDemo getHungry() {
        return hungry;
    }

    public static void main(String[] args) {
        HungryDemo hungry = HungryDemo.getHungry();
        System.out.println(hungry.getName());
    }


}
