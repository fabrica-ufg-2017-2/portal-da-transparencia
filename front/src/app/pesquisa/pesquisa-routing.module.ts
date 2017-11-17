import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { PesquisaScreenComponent } from './screens/pesquisa/pesquisa.component';
import { PesquisaDashboardScreenComponent } from './screens/pesquisa-dashboard/pesquisa-dashboard.component';
import { ProjetosScreenComponent } from './screens/projetos/projetos.component';

const routes: Routes = [
  {
    path: '',
    component: PesquisaScreenComponent,
    children: [
      {
        path: 'dashboard',
        component: PesquisaDashboardScreenComponent
      },
      {
        path: 'projetos',
        component: ProjetosScreenComponent
      }
    ]
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class PesquisaRoutingModule {}
