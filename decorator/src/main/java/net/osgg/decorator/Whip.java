package net.osgg.decorator;

public class Whip extends CondimentDecorator {

    public Whip(Beverage beverage) {
        super(beverage);
    }

    public String getDescription() {
        return getBeverage().getDescription() + ", Whip";
    }

    public double cost() {
        return .10 + getBeverage().cost();
    }
}
