package net.osgg.decorator;

public class Soy extends CondimentDecorator {


    public Soy(Beverage beverage) {
        super(beverage);
    }

    public String getDescription() {
        return getBeverage().getDescription() + ", Soy";
    }

    public double cost() {
        return 0.15 + getBeverage().cost();
    }
}
