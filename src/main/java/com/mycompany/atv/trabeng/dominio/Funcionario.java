package com.mycompany.atv.trabeng.dominio;

import java.io.Serializable;

public class Funcionario {
    public String nome;
    public String cpf;
    public String email;
    public String telefone;
    public double salario;

    public Funcionario() {
    }
    
    public Funcionario(String nome, String cpf, String email, String telefone, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
        this.salario = salario;
    }
    
    public void imprimir(){
        System.out.println("Nome: "+this.nome);
        System.out.println("CPF: "+this.cpf);
        System.out.println("Email: "+this.email);
        System.out.println("Telefone: "+this.telefone);
        System.out.println("Salário: "+this.salario);
        System.out.println("");
    }
}
