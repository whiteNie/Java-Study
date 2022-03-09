package com.winston.file.buildmodel.singleton;

/**
 * 懒汉式
 *
 * @author Winston
 * @date 2022/3/4
 */
public class LazyDemo {

    private String name;

    public String getName() {
        return "单例模式懒汉式";
    }

    private volatile static LazyDemo lazyDemo;

    private LazyDemo() {
    }

    public static LazyDemo getLazyDemo() {
        if (lazyDemo == null) {
            synchronized (LazyDemo.class) {
                if (lazyDemo == null) {
                    lazyDemo = new LazyDemo();
                }
                return lazyDemo;
            }
        }
        return lazyDemo;
    }

    public static void main(String[] args) {
        LazyDemo lazyDemo = LazyDemo.getLazyDemo();
        System.out.println(lazyDemo.getName());
    }


}
