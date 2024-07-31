package StructuralPatterns.Prova.Service;

import StructuralPatterns.Prova.Models.Credencial;

public class ConsoleLog implements RegisterLog{

    @Override
    public void register(Credencial credencial, int qtdAcesso) {
        String message = "O usuário de id %s acessou %s vezes".formatted(credencial.getId(),qtdAcesso);
        System.out.println(message);
    }
}
