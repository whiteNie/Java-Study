package com.winston.file.buildmodel.factorymethod;

/**
 * @author Winston
 * @date 2022/3/8
 */
public class AppleFactory implements BaseFactory {

    @Override
    public BaseProduct createProduct() {
        System.out.println("苹果工厂");
        return new AppleMilkTea();
    }
}
