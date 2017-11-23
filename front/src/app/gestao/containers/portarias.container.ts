import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs/Observable';

import { PortariasService } from './../services/portarias.service';
import { Portaria } from './../models/portaria.interface';

@Component({
  selector: 'inf-portarias-container',
  template: `
    <inf-portarias-gestao [portarias]="portarias"></inf-portarias-gestao>
  `
})

export class PortariasContainerComponent implements OnInit {
  portarias: Array<Portaria>;

  constructor(private portariasService: PortariasService) {}

  ngOnInit() {
    this.portariasService.getAll().subscribe(portarias => {
      this.portarias = portarias;
    });
  }
}
