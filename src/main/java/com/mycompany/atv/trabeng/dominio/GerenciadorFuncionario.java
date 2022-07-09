package com.mycompany.atv.trabeng.dominio;

import java.util.ArrayList;

public class GerenciadorFuncionario {

    private ArrayList<Funcionario> lista_funcionarios = new ArrayList<Funcionario>();

    public GerenciadorFuncionario() {
    }

    public void InserirFuncionario(Funcionario funcionario) {
        lista_funcionarios.add(funcionario);
    }

    public boolean RemoverFuncionario(Funcionario funcionario) {
        boolean excluido = false;
        try {
            lista_funcionarios.remove(funcionario);
            excluido = true;
        } catch (Exception e) {
        }

        return excluido;
    }

    public ArrayList<Funcionario> ListarFuncionarios() {
        return lista_funcionarios;
    }

    public void LimparListaFuncionarios() {
        lista_funcionarios.clear();
    }

}
