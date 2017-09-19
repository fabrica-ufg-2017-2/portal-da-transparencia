import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { GestaoComponent } from './gestao/gestao.component';
import { GestaoRoutingModule } from './gestao-routing.module';
import { GestaoService } from './shared/gestao.service';

@NgModule({
  declarations: [GestaoComponent],  
  imports: [
    CommonModule,
    GestaoRoutingModule
  ],
  exports: [GestaoComponent],
  providers: [GestaoService]
})
export class GestaoModule { }
