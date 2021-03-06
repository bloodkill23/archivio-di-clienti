/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.sirfin.archivio.di.clienti.service.impl;

import it.sirfin.archivio.di.clienti.dto.ListaClientiDto;
import it.sirfin.archivio.di.clienti.model.Cliente;
import it.sirfin.archivio.di.clienti.repository.ClientiRepository;
import it.sirfin.archivio.di.clienti.service.ClientiService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Francesco Lillo
 */
@Service
public class GestioneClientiServiceImpl implements ClientiService {

    @Autowired
    ClientiRepository clientiRepository;

    @Override
    public ListaClientiDto inserisciCliente(Cliente c) {
        clientiRepository.save(c);
        return aggiorna();
    }

    @Override
    public ListaClientiDto ricercaCliente(String criterio) {
        List<Cliente> lista = clientiRepository.findByCodiceContainsOrIndirizzoContainsOrRagioneSocialeContains(criterio);
        return new ListaClientiDto(lista);
    }

    @Override
    public ListaClientiDto cancellaCliente(Cliente cl) {
        clientiRepository.delete(cl);
        return aggiorna();
    }

    @Override
    public ListaClientiDto aggiorna() {
        List<Cliente> lista = clientiRepository.findAll();
        return new ListaClientiDto(lista);
    }
}
