import { Component, OnInit, Input } from '@angular/core';
import { Observable } from 'rxjs/Observable';

import { Projeto } from './../../models/projeto.interface';

@Component({
  selector: 'inf-projetos-pesquisa',
  templateUrl: './projetos.component.html',
  styleUrls: ['./projetos.component.scss']
})
export class ProjetosComponent implements OnInit {
  @Input() projetos: Observable<Array<Projeto>>;

  constructor() {}

  ngOnInit() {}
}
