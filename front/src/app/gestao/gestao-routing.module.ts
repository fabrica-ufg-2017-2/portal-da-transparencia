import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { PortariasScreenComponent } from './screens/portarias/portarias.component';

const routes: Routes = [
  {
    path: '',
    redirectTo: 'portarias'
  }, {
    path: 'portarias',
    component: PortariasScreenComponent
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class GestaoRoutingModule {}
