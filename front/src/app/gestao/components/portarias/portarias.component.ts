import {Component, Input, OnInit} from '@angular/core';
import {Observable} from 'rxjs/Observable';
import {Portaria} from '../../models/portaria.interface';

@Component({
  selector: 'inf-portarias-gestao',
  templateUrl: './portarias.component.html',
  styleUrls: ['./portarias.component.scss']
})
export class PortariasComponent implements OnInit {
  @Input() portarias: Observable<Array<Portaria>>;

  constructor() {}

  ngOnInit() {}
}
