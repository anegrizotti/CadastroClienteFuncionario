package com.mycompany.atv.trabeng.dominio;

import java.io.Serializable;

public class Cliente {
    public String nome;
    public String cpf;
    public String email;
    public String telefone;

    public Cliente() {
    }

    public Cliente(String nome, String cpf, String email, String telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
    }
    
    public void imprimir() {
        System.out.println("Nome: "+this.nome);
        System.out.println("CPF: "+this.cpf);
        System.out.println("Email: "+this.email);
        System.out.println("Telefone: "+this.telefone);
    }
}
