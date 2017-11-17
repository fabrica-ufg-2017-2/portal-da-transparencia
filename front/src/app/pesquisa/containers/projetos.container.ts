import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs/Observable';

import { ProjetosService } from './../services/projetos.service';
import { Projeto } from './../models/projeto.interface';

@Component({
  selector: 'inf-projetos-container',
  template: `<inf-projetos-pesquisa [projetos]="projetos"></inf-projetos-pesquisa>`
})
export class ProjetosContainerComponent implements OnInit {
  projetos: Array<Projeto>;

  constructor(private projetosService: ProjetosService) {}

  ngOnInit() {
    this.projetosService.getAll().subscribe(projetos => {
      console.log(projetos);
      this.projetos = projetos;
    });
  }
}
