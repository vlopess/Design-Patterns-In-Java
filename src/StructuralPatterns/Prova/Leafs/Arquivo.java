package StructuralPatterns.Prova.Leafs;

import StructuralPatterns.Prova.Component.Component;
import StructuralPatterns.Prova.Models.Credencial;

import java.util.Date;

public class Arquivo extends Component {
    private Long tamanho;


    public Arquivo(String name, Date creationDate, Long tamanho) {
        super(name, creationDate);
        this.tamanho = tamanho;
    }

    @Override
    public Long tamanho() {
        return this.tamanho;
    }

    @Override
    public void ler(Credencial credencial) {
        System.out.println("Lendo o arquivo...");
    }
}
