package com.winston.file.structuremodel.decorative;

/**
 * @author Winston
 * @date 2022/3/9
 */
public class GameDecorator extends PhoneDecorator {

    public GameDecorator(Phone phone) {
        super(phone);
    }

    @Override
    void addBehavior() {
        System.out.println("新增游戏功能");
    }

}
