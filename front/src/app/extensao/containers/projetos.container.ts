import { Component, OnInit } from '@angular/core';

import { ProjetosService } from './../services/projetos.service';
import { Projeto } from './../models/projeto.interface';

@Component({
  selector: 'inf-projetos-container-extensao',
  template: `    
    <inf-projetos-extensao [projetos]="projetos"></inf-projetos-extensao>
  `
})
export class ProjetosContainerComponent implements OnInit {
  projetos: Array<Projeto>;

  constructor(private projetosService: ProjetosService) {

  }

  ngOnInit() {
    this.projetosService.getAll().subscribe(projetos => {
      // console.log(projetos);
      this.projetos = projetos;
    });
  }
}
