import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { PortariasContainerComponent } from './containers/portarias.container';

import { GestaoComponent } from './screens/gestao/gestao.component';
import { GestaoRoutingModule } from './gestao-routing.module';
import { GestaoService } from './services/gestao.service';
import { LeftSideBarComponent } from './components/left-side-bar/left-side-bar.component';
import { PortariasComponent } from './components/portarias/portarias.component';

@NgModule({
  declarations: [
    GestaoComponent,
    LeftSideBarComponent,
    PortariasComponent
  ],
  imports: [CommonModule, GestaoRoutingModule],
  exports: [GestaoComponent],
  providers: [GestaoService]
})
export class GestaoModule {}
