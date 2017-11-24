import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { ExtensaoScreenComponent } from './screens/extensao/extensao.component';
import { ExtensaoDashboardScreenComponent } from './screens/extensao-dashboard/extensao-dashboard.component';
import { ProjetosScreenComponent } from './screens/projetos/projetos.component';
import { ProjetoScreenComponent } from './screens/projeto/projeto.component';

const routes: Routes = [
  {
    path: '',
    component: ExtensaoScreenComponent,
    children: [
      {
        path: 'dashboard',
        component: ExtensaoDashboardScreenComponent
      },
      {
        path: 'projetos',
        component: ProjetosScreenComponent
      },
      {
        path: 'projeto/:id',
        component: ProjetoScreenComponent
      }
    ]
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class ExtensaoRoutingModule {}
