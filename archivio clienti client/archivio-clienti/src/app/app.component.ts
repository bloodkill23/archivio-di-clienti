import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';
import { Cliente } from './cliente';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  cliente = new Cliente();
  vettoreClienti: [] = [];
  search="";
  constructor(private http: HttpClient) { }

  inserisci() { }

  ricerca(){}

  ricercaCodice(){}

  ricercaRagioneSociale(){}

  ricercaIndirizzo(){}

  aggiorna(){}

  confermaModifica(){}

  annulla(){}

  cancellazione(){}

  seleziona(){}




}
