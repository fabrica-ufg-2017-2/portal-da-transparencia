import { Component, OnInit, Input } from '@angular/core';
import { Observable } from 'rxjs/Observable';

import { Disciplina } from '../../models/disciplina.model';

@Component({
  selector: 'inf-lista-diciplinas',
  templateUrl: './lista-diciplinas.component.html',
  styleUrls: ['./lista-diciplinas.component.scss']
})
export class ListaDiciplinasComponent implements OnInit {
  @Input() disciplinas: Observable<Disciplina[]>;

  constructor() {}

  ngOnInit() {}
}
