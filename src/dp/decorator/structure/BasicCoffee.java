package dp.decorator.structure;

public class BasicCoffee implements Coffee {
    @Override
    public double getCost() {
        return 2.00; 
    }

    @Override
    public String getDescription() {
        return "Basic Coffee";
    }
}