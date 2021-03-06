/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.sirfin.archivio.di.clienti.service;

import it.sirfin.archivio.di.clienti.dto.ListaClientiDto;
import it.sirfin.archivio.di.clienti.model.Cliente;

/**
 *
 * @author Francesco Lillo
 */
public interface ClientiService {
    
    ListaClientiDto inserisciCliente (Cliente c);
    ListaClientiDto ricercaCliente (String criterio);
    ListaClientiDto cancellaCliente (Cliente cl);
    ListaClientiDto aggiorna ();
    
    
    
}
