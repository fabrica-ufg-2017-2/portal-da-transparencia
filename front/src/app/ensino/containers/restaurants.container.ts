import { Component, OnInit } from '@angular/core';
import { RestauranteService } from '../services/restaurante.service';
import { Observable } from 'rxjs/Observable';

@Component({
  selector: 'inf-lista-restaurants-container',
  template: `<inf-lista-restaurants [restaurants]="restaurants"></inf-lista-restaurants>`
})
export class ListaRestaurantsContainerComponent implements OnInit {
  restaurants: Observable<any>;

  constructor(private restaurantService: RestauranteService) {}

  ngOnInit() {
    this.restaurants = this.restaurantService.fetchRestaurants();
  }
}
