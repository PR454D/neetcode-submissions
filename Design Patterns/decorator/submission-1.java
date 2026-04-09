abstract class Coffee {
    public abstract double getCost();
}

class SimpleCoffee extends Coffee {
    @Override
    public double getCost() {
        return 1.1;
    }
}

abstract class CoffeeDecorator extends Coffee {
    protected Coffee decoratedCoffee;

    public CoffeeDecorator(Coffee coffee) {
        this.decoratedCoffee = coffee;
    }

    public double getCost() {
        return decoratedCoffee.getCost();
    }
}

class MilkDecorator extends CoffeeDecorator {
    private double offset = 0.5;
    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }
    @Override
    public double getCost() {
        return this.decoratedCoffee.getCost() + offset;
    }
}

class SugarDecorator extends CoffeeDecorator {
    private double offset = 0.2;
    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }
    @Override
    public double getCost() {
        return this.decoratedCoffee.getCost() + offset;
    }
}

class CreamDecorator extends CoffeeDecorator {
    private double offset = 0.7;
    public CreamDecorator(Coffee coffee) {
        super(coffee);
    }
    @Override
    public double getCost() {
        return this.decoratedCoffee.getCost() + offset;
    }
}
