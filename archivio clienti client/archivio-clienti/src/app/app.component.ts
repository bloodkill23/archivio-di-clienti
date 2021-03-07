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
  constructor(private http: HttpClient) { }

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

  aggiorna() { }

  confermaModifica() { }

  annulla() { }

  cancellazione() { }

  seleziona() { }




}
