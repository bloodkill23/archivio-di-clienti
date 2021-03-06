/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.sirfin.archivio.di.clienti.dto;

import it.sirfin.archivio.di.clienti.model.Cliente;

/**
 *
 * @author Francesco Lillo
 */
public class ClienteDto {
    private Cliente cliente;

    public ClienteDto() {
    }

    public ClienteDto(Cliente cliente) {
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "ClienteDto{" + "cliente=" + cliente + '}';
    }
    
}
