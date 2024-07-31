package StructuralPatterns.Prova;

import StructuralPatterns.Prova.Component.Component;
import StructuralPatterns.Prova.Composite.Pasta;
import StructuralPatterns.Prova.Leafs.Arquivo;
import StructuralPatterns.Prova.Models.Credencial;
import StructuralPatterns.Prova.Proxy.ArquivoProxy;
import StructuralPatterns.Prova.Service.ConsoleLog;

import java.util.Date;

public class Client {
    public static void main(String[] args) throws Exception {
        Component pasta = new Pasta("Pasta", new Date(2024, 30,1));
        var arquivo = new Arquivo("laudo.pdf", new Date(2024, 30,1), 10L);
        pasta.add(arquivo);
        pasta.add(new Arquivo("laudo2.pdf", new Date(2024, 30,2), 10L));
        pasta.add(new Arquivo("laudo3.pdf", new Date(2024, 30,2), 10L));
        pasta.add(new Arquivo("laudo4.pdf", new Date(2024, 30,2), 10L));
        var proxy = new ArquivoProxy("laudo2.pdf", 10L , new Date(2024, 30,2), new ConsoleLog(), arquivo);
        pasta.add(proxy);

        Credencial credencial = new Credencial("Qw-121-3");
        Credencial credencial2 = new Credencial("Qw-121-DD");

        proxy.ler(credencial2);//mostra o log
        proxy.ler(credencial);//mostra o log

        arquivo.ler(credencial);//leitura sem log

        proxy.ler(credencial);//mostra o log

        System.out.println("Tamanho da pasta: " + pasta.tamanho());

        proxy.ler(credencial);//mostra o log

        arquivo.ler(credencial2);//leitura sem log

        proxy.ler(credencial2);//mostra o log

    }
}

////////////////////////////////////////////
//O usuário de id Qw-121-DD acessou 1 vezes
//Lendo o arquivo...
//O usuário de id Qw-121-3 acessou 1 vezes
//Lendo o arquivo...
//Lendo o arquivo...
//O usuário de id Qw-121-3 acessou 2 vezes
//Lendo o arquivo...
//Tamanho da pasta: 50
//O usuário de id Qw-121-3 acessou 3 vezes
//Lendo o arquivo...
//Lendo o arquivo...
//O usuário de id Qw-121-DD acessou 2 vezes
//Lendo o arquivo...
