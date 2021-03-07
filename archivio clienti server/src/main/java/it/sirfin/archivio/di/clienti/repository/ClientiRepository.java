/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.sirfin.archivio.di.clienti.repository;

import it.sirfin.archivio.di.clienti.model.Cliente;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Francesco Lillo
 */
@Repository
public interface ClientiRepository extends JpaRepository<Cliente, Long> {

    List<Cliente> findByCodiceContainsOrIndirizzoContainsOrRagioneSocialeContains(String criterio, String criterio2, String criterio3);

}
