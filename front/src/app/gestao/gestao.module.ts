import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { PortariasContainerComponent } from './containers/portarias.container';

import { GestaoComponent } from './screens/gestao/gestao.component';
import { GestaoRoutingModule } from './gestao-routing.module';
import { GestaoService } from './services/gestao.service';

@NgModule({
  declarations: [
    GestaoComponent,
    PortariasContainerComponent
  ],
  imports: [CommonModule, GestaoRoutingModule],
  exports: [GestaoComponent],
  providers: [GestaoService]
})
export class GestaoModule {}
