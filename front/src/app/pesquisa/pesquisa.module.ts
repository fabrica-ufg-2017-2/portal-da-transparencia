import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { PesquisaComponent } from './screens/pesquisa/pesquisa.component';
import { PesquisaRoutingModule } from './pesquisa-routing.module';
import { PesquisaService } from './services/pesquisa.service';

@NgModule({
  declarations: [PesquisaComponent],
  imports: [CommonModule, PesquisaRoutingModule],
  exports: [PesquisaComponent],
  providers: [PesquisaService]
})
export class PesquisaModule {}
