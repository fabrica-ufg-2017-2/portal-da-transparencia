import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { EnsinoScreenComponent } from './screens/ensino/ensino.component';

const routes: Routes = [
  {
    path: '',
    component: EnsinoScreenComponent
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class EnsinoRoutingModule {}
