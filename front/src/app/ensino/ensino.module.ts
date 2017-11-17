import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { EnsinoScreenComponent } from './screens/ensino/ensino.component';
import { EnsinoRoutingModule } from './ensino-routing.module';
import { ListaRestaurantsComponent } from './components/lista-restaurants/lista-restaurants.component';
import { ItemRestaurantComponent } from './components/lista-restaurants/item-restaurant/item-restaurant.component';
import { RestauranteService } from './services/restaurante.service';
import { ListaRestaurantsContainerComponent } from './containers/restaurants.container';

@NgModule({
  declarations: [
    EnsinoScreenComponent,
    ListaRestaurantsComponent,
    ItemRestaurantComponent,
    ListaRestaurantsContainerComponent
  ],
  imports: [CommonModule, EnsinoRoutingModule],
  exports: [EnsinoScreenComponent],
  providers: [RestauranteService]
})
export class EnsinoModule {}
