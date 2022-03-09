package com.winston.file.buildmodel.factorymethod;

/**
 * 草莓
 *
 * @author Winston
 * @date 2022/3/8
 */
public class StrawberryFactory implements BaseFactory {

    @Override
    public BaseProduct createProduct() {
        System.out.println("草莓工厂");
        return new StrawberryMilkTea();
    }
}
