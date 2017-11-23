import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { PortariasContainerComponent } from './containers/portarias.container';

import { PortariasScreenComponent } from './screens/portarias/portarias.component';
import { GestaoComponent } from './screens/gestao/gestao.component';
import { GestaoRoutingModule } from './gestao-routing.module';
import { GestaoService } from './services/gestao.service';

import { LeftSideBarComponent } from './components/left-side-bar/left-side-bar.component';
import { PortariasComponent } from './components/portarias/portarias.component';
import { PortariaComponent } from './components/portarias/portaria/portaria.component';
import {PortariasService} from './services/portarias.service';

@NgModule({
  declarations: [
    PortariasScreenComponent,
    PortariasContainerComponent,
    GestaoComponent,
    LeftSideBarComponent,
    PortariasComponent,
    PortariaComponent
  ],
  imports: [CommonModule, GestaoRoutingModule],
  exports: [GestaoComponent],
  providers: [
    GestaoService,
    PortariasService
  ]
})
export class GestaoModule {}
