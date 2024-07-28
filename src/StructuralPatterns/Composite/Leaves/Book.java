package StructuralPatterns.Composite.Leaves;

public class Book extends AbstractProduct{

    public Book(String name, double price) {
        super(name, price);
    }
    @Override
    public double getPrice() {
        return this.price;
    }
}
