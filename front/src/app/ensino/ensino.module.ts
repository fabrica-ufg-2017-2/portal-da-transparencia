import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { EnsinoComponent } from './ensino/ensino.component';
import { EnsinoRoutingModule } from './ensino-routing.module';
import { EnsinoService } from './shared/ensino.service';

@NgModule({
  declarations: [EnsinoComponent],
  imports: [
    CommonModule,
    EnsinoRoutingModule
  ],
  exports: [EnsinoComponent],
  providers: [EnsinoService]
})
export class EnsinoModule { }
