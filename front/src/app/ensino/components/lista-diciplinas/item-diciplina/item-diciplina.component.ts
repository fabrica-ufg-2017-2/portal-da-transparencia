import { Component, OnInit, Input } from '@angular/core';
import { Disciplina } from '../../../models/disciplina.model';

@Component({
  selector: 'inf-item-diciplina',
  templateUrl: './item-diciplina.component.html',
  styleUrls: ['./item-diciplina.component.scss']
})
export class ItemDiciplinaComponent implements OnInit {
  @Input() disciplina: Disciplina;

  constructor() {}

  ngOnInit() {}
}
