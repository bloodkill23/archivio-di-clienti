/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.sirfin.archivio.di.clienti.service.impl;

import it.sirfin.archivio.di.clienti.dto.ListaClientiDto;
import it.sirfin.archivio.di.clienti.repository.ClientiRepository;
import it.sirfin.archivio.di.clienti.service.ClientiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Francesco Lillo
 */
@Service
public class GestioneClientiServiceImpl implements  ClientiService  {
    @Autowired
    ClientiRepository clientiRepository;

    @Override
    public ListaClientiDto inseriscoCliente() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ListaClientiDto ricercaCliente() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ListaClientiDto cancellaCliente() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ListaClientiDto aggiorna() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
