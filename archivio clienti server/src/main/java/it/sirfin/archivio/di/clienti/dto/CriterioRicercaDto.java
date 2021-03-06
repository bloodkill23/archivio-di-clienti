/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.sirfin.archivio.di.clienti.dto;

/**
 *
 * @author aleur
 */
public class CriterioRicercaDto {
    private String criterio;

    public CriterioRicercaDto() {
    }
    

    public CriterioRicercaDto(String criterio) {
        this.criterio = criterio;
    }

    public String getCriterio() {
        return criterio;
    }

    public void setCriterio(String criterio) {
        this.criterio = criterio;
    }

    @Override
    public String toString() {
        return "CriterioRicercaDto{" + "criterio=" + criterio + '}';
    }
    
}
