package net.osgg.decorator;

public abstract class CondimentDecorator extends Beverage {
    private Beverage beverage;
    
    public CondimentDecorator (Beverage beverage){
        setBeverage(beverage);
    }
    
    public Beverage getBeverage() {
        return beverage;
    }

    public void setBeverage(Beverage beverage) {
        this.beverage = beverage;
    }
    
    public abstract String getDescription();
}
