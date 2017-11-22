import { ProjetoScreenComponent } from './screens/projeto/projeto.component';
import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { ChartsModule } from 'ng2-charts';

import { PesquisaScreenComponent } from './screens/pesquisa/pesquisa.component';
import { ProjetosScreenComponent } from './screens/projetos/projetos.component';

import { ProjetoComponent } from './components/projetos/projeto/projeto.component';
import { ProjetosComponent } from './components/projetos/projetos.component';

import { ProjetosContainerComponent } from './containers/projetos.container';

import { PesquisaRoutingModule } from './pesquisa-routing.module';
import { PesquisaService } from './services/pesquisa.service';
import { ProjetosService } from './services/projetos.service';
import { LeftSideBarComponent } from './components/left-side-bar/left-side-bar.component';
import { PesquisaDashboardScreenComponent } from './screens/pesquisa-dashboard/pesquisa-dashboard.component';

import { PaginationModule } from './../shared/components/pagination/pagination.module';
import { GraficoSituacaoProjetosComponent } from './components/grafico-situacao-projetos/grafico-situacao-projetos.component';

@NgModule({
  declarations: [
    PesquisaScreenComponent,
    ProjetosScreenComponent,
    ProjetosComponent,
    ProjetoComponent,
    ProjetosContainerComponent,
    LeftSideBarComponent,
    PesquisaDashboardScreenComponent,
    GraficoSituacaoProjetosComponent,
    ProjetoScreenComponent
  ],
  imports: [
    CommonModule,
    ChartsModule,
    PesquisaRoutingModule,
    PaginationModule
  ],
  exports: [PesquisaScreenComponent],
  providers: [PesquisaService, ProjetosService]
})
export class PesquisaModule {}
