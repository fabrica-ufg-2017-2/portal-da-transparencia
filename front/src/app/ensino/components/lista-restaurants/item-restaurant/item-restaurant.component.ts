import { Component, OnInit, Input } from '@angular/core';
import { Restaurant } from '../../../models/restaurant.model';

@Component({
  selector: 'inf-item-restaurant',
  templateUrl: './item-restaurant.component.html',
  styleUrls: ['./item-restaurant.component.scss']
})
export class ItemRestaurantComponent implements OnInit {
  @Input() restaurant: Restaurant;

  constructor() {}

  ngOnInit() {}
}
