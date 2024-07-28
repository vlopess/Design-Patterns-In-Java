package StructuralPatterns.Composite.Leaves;

public class Notebook extends AbstractProduct{
    public Notebook(String name, double price) {
        super(name, price);
    }

    @Override
    public double getPrice() {
        return this.price;
    }
}
