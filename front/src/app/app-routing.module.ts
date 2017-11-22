import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { HomeComponent } from './shared/screens/home/home.component';
import { NotFoundComponent } from './shared/screens/not-found/not-found.component';

const routes: Routes = [
  {
    path: '',
    component: HomeComponent
  },
  {
    path: 'ensino',
    loadChildren: 'app/ensino/ensino.module#EnsinoModule'
  },
  {
    path: 'gestao',
    loadChildren: 'app/gestao/gestao.module#GestaoModule'
  },
  {
    path: 'extensao',
    loadChildren: 'app/extensao/extensao.module#ExtensaoModule'
  },
  {
    path: 'pesquisa',
    loadChildren: 'app/pesquisa/pesquisa.module#PesquisaModule'
  },
  {
    path: '**',
    component: NotFoundComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {}
