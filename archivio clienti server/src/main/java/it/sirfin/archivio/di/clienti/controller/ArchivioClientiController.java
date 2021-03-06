/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.sirfin.archivio.di.clienti.controller;

import it.sirfin.archivio.di.clienti.dto.ClienteDto;
import it.sirfin.archivio.di.clienti.dto.CriterioRicercaDto;
import it.sirfin.archivio.di.clienti.dto.ListaClientiDto;
import it.sirfin.archivio.di.clienti.service.ClientiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Francesco Lillo
 */
@CrossOrigin("*")
@RestController
public class ArchivioClientiController {

    @Autowired
    ClientiService GestioneClientiService;

    @RequestMapping("/inserisciCliente")
    @ResponseBody
    public ListaClientiDto inserisciCliente(@RequestBody ClienteDto dto) {
        System.out.println("sono in inserisci cliente" + dto);
        return GestioneClientiService.inserisciCliente(dto.getCliente());
    }

    @RequestMapping("/ricerca-cliente")
    @ResponseBody
    public ListaClientiDto ricercaCliente(@RequestBody CriterioRicercaDto dto) {
        return GestioneClientiService.ricercaCliente(dto.getCriterio());
    }

    @RequestMapping("/cancella-cliente")
    @ResponseBody
    public ListaClientiDto cancellaCliente(@RequestBody ClienteDto dto) {
        return GestioneClientiService.cancellaCliente(dto.getCliente());
    }

    @RequestMapping("/reset-db")
    @ResponseBody
    public ListaClientiDto resetDB() {
        throw new UnsupportedOperationException();
    }

    @RequestMapping("/aggiorna-liste")
    @ResponseBody
    public ListaClientiDto aggiornaListe() {
        return GestioneClientiService.aggiorna();
    }

}
