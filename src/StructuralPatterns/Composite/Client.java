package StructuralPatterns.Composite;

import StructuralPatterns.Composite.Composite.Caixa;
import StructuralPatterns.Composite.DeliveryService.DeliveryService;
import StructuralPatterns.Composite.Leaves.Book;
import StructuralPatterns.Composite.Leaves.Notebook;
import StructuralPatterns.Composite.Leaves.Shampoo;

public class Client {
    public static void main(String[] args) {
        DeliveryService deliveryService = new DeliveryService();

        deliveryService.add(
                new Caixa(
                    new Book("Linux: O guia essencial", 40.00),
                    new Book("Clear Code", 60.00),
                    new Book("Alice's Adventures In Wonderland", 35.00))
        );

        deliveryService.add(
                new Caixa(
                        new Notebook("ThinkPad", 3500),
                        new Shampoo("Shampoo", 35)
                )
        );

        System.out.println("Cost total: R$" + deliveryService.getCost());
    }
}

//Output:
//Cost total: R$3670.0
