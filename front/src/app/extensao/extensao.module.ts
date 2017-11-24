import { ProjetoScreenComponent } from './screens/projeto/projeto.component';
import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { ChartsModule } from 'ng2-charts';

import { ExtensaoScreenComponent } from './screens/extensao/extensao.component';
import { ProjetosScreenComponent } from './screens/projetos/projetos.component';

import { ProjetoComponent } from './components/projetos/projeto/projeto.component';
import { ProjetosComponent } from './components/projetos/projetos.component';

import { ProjetosContainerComponent } from './containers/projetos.container';

import { ExtensaoRoutingModule } from './extensao-routing.module';
import { ExtensaoService } from './services/extensao.service';
import { ProjetosService } from './services/projetos.service';
import { LeftSideBarComponent } from './components/left-side-bar/left-side-bar.component';
import { ExtensaoDashboardScreenComponent } from './screens/extensao-dashboard/extensao-dashboard.component';

import { PaginationModule } from './../shared/components/pagination/pagination.module';

@NgModule({
  declarations: [
    ExtensaoScreenComponent,
    ProjetosScreenComponent,
    ProjetosComponent,
    ProjetoComponent,
    ProjetosContainerComponent,
    LeftSideBarComponent,
    ExtensaoDashboardScreenComponent,
    ProjetoScreenComponent
  ],
  imports: [
    CommonModule,
    ChartsModule,
    ExtensaoRoutingModule,
    PaginationModule
  ],
  exports: [ExtensaoScreenComponent],
  providers: [ExtensaoService, ProjetosService]
})
export class ExtensaoModule {}
