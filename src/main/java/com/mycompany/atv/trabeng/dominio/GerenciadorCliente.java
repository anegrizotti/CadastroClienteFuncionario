package com.mycompany.atv.trabeng.dominio;

import java.util.ArrayList;

public class GerenciadorCliente {

    private ArrayList<Cliente> lista_clientes = new ArrayList<Cliente>();

    public GerenciadorCliente() {
    }

    public void InserirCliente(Cliente cliente) {
        lista_clientes.add(cliente);
    }

    public boolean RemoverCliente(Cliente cliente) {
        boolean excluido = false;
        try {
            lista_clientes.remove(cliente);
            excluido = true;
        } catch (Exception e) {
        }

        return excluido;
    }

    public ArrayList<Cliente> ListarClientes() {
        return lista_clientes;
    }

    public void LimparListaClientes() {
        lista_clientes.clear();
    }
}
