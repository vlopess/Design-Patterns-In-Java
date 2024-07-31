package StructuralPatterns.Prova.Proxy;

import StructuralPatterns.Prova.Component.Component;
import StructuralPatterns.Prova.Leafs.Arquivo;
import StructuralPatterns.Prova.Models.Credencial;
import StructuralPatterns.Prova.Service.RegisterLog;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArquivoProxy extends Component {
    private final Long tamanho;
    private final RegisterLog service;
    private final Arquivo arquivo;
    private final Map<String, Integer> counter = new HashMap<>();
    
    public ArquivoProxy(String name, Long tamanho, Date date, RegisterLog service, Arquivo arquivo) {
        super(name, date);
        this.tamanho = tamanho;
        this.service = service;
        this.arquivo = arquivo;
    }

    @Override
    public Long tamanho() {
        return this.tamanho;
    }

    @Override
    public void ler(Credencial credencial) {
        int qtdAcessos = this.counter.getOrDefault(credencial.getId(), 1);
        this.counter.put(credencial.getId(), qtdAcessos + 1);
        this.service.register(credencial, qtdAcessos);
        this.arquivo.ler(credencial);
    }
}
