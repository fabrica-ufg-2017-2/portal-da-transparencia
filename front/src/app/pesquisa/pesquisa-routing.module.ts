import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { PesquisaComponent } from './pesquisa/pesquisa.component';

const routes: Routes = [
  {
    path: 'pesquisa',
    component: PesquisaComponent
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class PesquisaRoutingModule { }
