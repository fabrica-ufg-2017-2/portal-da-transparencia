import {Component, Input, OnInit} from '@angular/core';
import {Portaria} from '../../../models/portaria.interface';

@Component({
  selector: 'inf-portaria-gestao',
  templateUrl: './portaria.component.html',
  styleUrls: ['./portaria.component.scss']
})
export class PortariaComponent implements OnInit {
  @Input() portaria: Portaria;

  constructor() { }

  ngOnInit() {
  }

}
