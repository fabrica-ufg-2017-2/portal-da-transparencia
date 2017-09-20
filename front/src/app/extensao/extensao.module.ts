import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { ExtensaoComponent } from './extensao/extensao.component';
import { ExtensaoRoutingModule } from './extensao-routing.module';
import { ExtensaoService } from './shared/extensao.service';

@NgModule({
  declarations: [ExtensaoComponent],  
  imports: [
    CommonModule,
    ExtensaoRoutingModule
  ],
  exports: [ExtensaoComponent],
  providers: [ExtensaoService]
})
export class ExtensaoModule { }
