package StructuralPatterns.Composite.DeliveryService;

import StructuralPatterns.Composite.Components.Componente;
import StructuralPatterns.Composite.Composite.Caixa;


public class DeliveryService {
    private Componente componente;

    public DeliveryService() {
        this.componente = new Caixa();
    }

    public void add(Componente componente){
        this.componente.add(componente);
    }

    public double getCost(){
        return this.componente.getPrice();
    }
}
