import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { GestaoComponent } from './gestao/gestao.component';

const routes: Routes = [
  {
    path: 'gestao',
    component: GestaoComponent
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class GestaoRoutingModule { }
