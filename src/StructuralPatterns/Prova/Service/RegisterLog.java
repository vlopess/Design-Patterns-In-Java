package StructuralPatterns.Prova.Service;

import StructuralPatterns.Prova.Models.Credencial;

public interface RegisterLog {
    void register(Credencial credencial, int qtdAcesso);
}
