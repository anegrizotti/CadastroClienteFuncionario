package com.mycompany.atv.trabeng.dominio;

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
}
