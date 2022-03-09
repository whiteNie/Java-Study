package com.winston.file.actionmodel.decorative;

/**
 * @author Winston
 * @date 2022/3/9
 */
public class DecoratorDemo {

    public static void main(String[] args) {
        new VideoDecorator(new OrangePhone()).addBehavior();
    }

}
