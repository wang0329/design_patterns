package com.wbj.pattern.factory.abstract_factory;

/**
 * @version v1.0
 * @ClassName: AmericanDessertFactory
 * @Description:
 *         没事风味的甜品工厂
 *             生产美式咖啡和抹茶慕斯
 */
public class AmericanDessertFactory implements DessertFactory {

    public Coffee createCoffee() {
        return new AmericanCoffee();
    }

    public Dessert createDessert() {
        return new MatchaMousse();
    }
}
