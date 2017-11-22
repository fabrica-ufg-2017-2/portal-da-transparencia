import { Component, OnInit, Input } from '@angular/core';
import { Observable } from 'rxjs/Observable';

import { Restaurant } from '../../models/restaurant.model';

@Component({
  selector: 'inf-lista-restaurants',
  templateUrl: './lista-restaurants.component.html',
  styleUrls: ['./lista-restaurants.component.scss']
})
export class ListaRestaurantsComponent implements OnInit {
  @Input() restaurants: Observable<Restaurant[]>;

  constructor() {}

  ngOnInit() {}
}
