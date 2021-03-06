/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.sirfin.archivio.di.clienti.dto;

import it.sirfin.archivio.di.clienti.model.Cliente;
import java.util.List;

/**
 *
 * @author aleur
 */
public class ListaClientiDto {
    private List<Cliente> listaclienti;

    public ListaClientiDto() {
    }

    public ListaClientiDto(List<Cliente> listaclienti) {
        this.listaclienti = listaclienti;
    }

    public List<Cliente> getListaclienti() {
        return listaclienti;
    }

    public void setListaclienti(List<Cliente> listaclienti) {
        this.listaclienti = listaclienti;
    }

    @Override
    public String toString() {
        return "ListaClientiDto{" + "listaclienti=" + listaclienti + '}';
    }
    
}
