package StructuralPatterns.Composite.Leaves;

public class Shampoo extends AbstractProduct{
    public Shampoo(String name, double price) {
        super(name, price);
    }
    @Override
    public double getPrice() {
        return this.price;
    }
}
