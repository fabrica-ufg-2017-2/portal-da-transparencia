import { Component, OnInit, Input } from '@angular/core';

import { Projeto } from './../../../models/projeto.interface';

@Component({
  selector: 'inf-projeto-pesquisa',
  templateUrl: './projeto.component.html',
  styleUrls: ['./projeto.component.scss']
})
export class ProjetoComponent implements OnInit {
  @Input() projeto: Projeto;

  constructor() {}

  ngOnInit() {}
}
