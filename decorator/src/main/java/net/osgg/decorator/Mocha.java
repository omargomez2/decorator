package net.osgg.decorator;

public class Mocha extends CondimentDecorator {
   

    public Mocha(Beverage beverage) {
        super(beverage);
    }

    public String getDescription() {
        return getBeverage().getDescription() + ", Mocha";
    }

    public double cost() {
        return .20 + getBeverage().cost();
    }
}
