import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs/Observable';
import { DisciplinasService } from '../services/disciplinas.service';

@Component({
  selector: 'inf-lista-disciplinas-container',
  template: `<inf-lista-diciplinas [disciplinas]="disciplinas"></inf-lista-diciplinas>`
})
export class ListaDisciplinasContainerComponent implements OnInit {
  disciplinas: Observable<any>;

  constructor(private disciplinaService: DisciplinasService) {}

  ngOnInit() {
    this.disciplinas = this.disciplinaService.buscarDisciplinas();
  }
}
