import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { EnsinoScreenComponent } from './screens/ensino/ensino.component';
import { EnsinoRoutingModule } from './ensino-routing.module';
import { ListaDiciplinasComponent } from './components/lista-diciplinas/lista-diciplinas.component';
import { ItemDiciplinaComponent } from './components/lista-diciplinas/item-diciplina/item-diciplina.component';
import { ListaDisciplinasContainerComponent } from './containers/disciplinas.container';
import { DisciplinasService } from './services/disciplinas.service';

@NgModule({
  declarations: [
    EnsinoScreenComponent,
    ListaDisciplinasContainerComponent,
    ListaDiciplinasComponent,
    ItemDiciplinaComponent
  ],
  imports: [CommonModule, EnsinoRoutingModule],
  exports: [EnsinoScreenComponent],
  providers: [DisciplinasService]
})
export class EnsinoModule {}
