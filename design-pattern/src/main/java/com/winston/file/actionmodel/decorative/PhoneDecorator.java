package com.winston.file.actionmodel.decorative;

/**
 * @author Winston
 * @date 2022/3/9
 */
public abstract class PhoneDecorator implements Phone {

    private Phone phone;

    public PhoneDecorator(Phone phone) {
        this.phone = phone;
    }

    @Override
    public void call() {
        phone.call();
    }

    abstract void addBehavior();

}
