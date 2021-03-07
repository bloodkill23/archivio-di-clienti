import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';
import { Cliente } from './cliente';
import { ClienteDto } from './cliente-dto';
import { CriterioRicercaDto } from './criterio-ricerca-dto';
import { ListaClienteDto } from './lista-cliente-dto';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  cliente = new Cliente();
  vettoreClienti: Cliente[] = [];
  search = "";
  constructor(private http: HttpClient) {
    this.aggiorna();
  }

  inserisci() {
    let dto = new ClienteDto();
    dto.cliente = this.cliente;
    let os = this.http.post<ListaClienteDto>("http://localhost8080/inserisciCliente", dto
    );
    os.subscribe(r => this.vettoreClienti = r.listaCliente);
    this.cliente = new Cliente();
  }

  ricerca() {
    let criterio = new CriterioRicercaDto();
    criterio.stringa = this.search;
    let ox = this.http.post<ListaClienteDto>("http://localhost8080/ricercaCliente", criterio
    );
    ox.subscribe(v => this.vettoreClienti = v.listaCliente);
  }

  aggiorna() {
    this.http.get<ListaClienteDto>("http://localhost:8080/aggiorna-liste")
      .subscribe(v => this.vettoreClienti = v.listaCliente);
  }

  cancellazione(clienteDaRimuovere: Cliente) {
    let dto = new ClienteDto();
    dto.cliente = clienteDaRimuovere;
    let os = this.http.post<ListaClienteDto>("http://localhost8080/cancellaCliente", dto
    );
    os.subscribe(r => this.vettoreClienti = r.listaCliente);
  }

  seleziona() {
    this.cliente = new Cliente();
  }

  confermaModifica() {
    this.vettoreClienti.push(this.cliente);
  }

  annulla() {
    this.cliente = new Cliente();
  }




  resetDB() { }


}
