/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.sirfin.archivio.di.clienti.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import org.springframework.data.annotation.Id;

/**
 *
 * @author Francesco Lillo
 */
@Entity
public class Cliente implements Serializable{
    @Id
    @GeneratedValue
    private long id;
    @Column
    private String codice;
    @Column
    private String ragioneSociale;
    @Column
    private String indirizzo;

    public Cliente() {
    }

    public Cliente(long id, String codice, String ragioneSociale, String indirizzo) {
        this.id = id;
        this.codice = codice;
        this.ragioneSociale = ragioneSociale;
        this.indirizzo = indirizzo;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCodice() {
        return codice;
    }

    public void setCodice(String codice) {
        this.codice = codice;
    }

    public String getRagioneSociale() {
        return ragioneSociale;
    }

    public void setRagioneSociale(String ragioneSociale) {
        this.ragioneSociale = ragioneSociale;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", codice=" + codice + ", ragioneSociale=" + ragioneSociale + ", indirizzo=" + indirizzo + '}';
    }
    
}
